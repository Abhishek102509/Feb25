// Database setup (using IndexedDB as a client-side "SQL-like" storage)
let db;
const DB_NAME = 'ExpenseTrackerDB';
const DB_VERSION = 1;
const STORE_NAME = 'expenses';

// Initialize the database
function initDB() {
    return new Promise((resolve, reject) => {
        const request = indexedDB.open(DB_NAME, DB_VERSION);
        
        request.onerror = (event) => {
            console.error('Database error:', event.target.error);
            reject('Database error');
        };
        
        request.onsuccess = (event) => {
            db = event.target.result;
            console.log('Database initialized');
            resolve(db);
        };
        
        request.onupgradeneeded = (event) => {
            const db = event.target.result;
            if (!db.objectStoreNames.contains(STORE_NAME)) {
                const store = db.createObjectStore(STORE_NAME, { 
                    keyPath: 'id',
                    autoIncrement: true 
                });
                store.createIndex('date', 'date', { unique: false });
                store.createIndex('category', 'category', { unique: false });
                console.log('Database store created');
            }
        };
    });
}

// CRUD Operations
async function addExpense(expense) {
    return new Promise((resolve, reject) => {
        const transaction = db.transaction([STORE_NAME], 'readwrite');
        const store = transaction.objectStore(STORE_NAME);
        
        const request = store.add(expense);
        
        request.onsuccess = () => {
            resolve(request.result);
        };
        
        request.onerror = (event) => {
            reject(event.target.error);
        };
    });
}

async function getAllExpenses() {
    return new Promise((resolve, reject) => {
        const transaction = db.transaction([STORE_NAME], 'readonly');
        const store = transaction.objectStore(STORE_NAME);
        
        const request = store.getAll();
        
        request.onsuccess = () => {
            resolve(request.result);
        };
        
        request.onerror = (event) => {
            reject(event.target.error);
        };
    });
}

async function getExpenseById(id) {
    return new Promise((resolve, reject) => {
        const transaction = db.transaction([STORE_NAME], 'readonly');
        const store = transaction.objectStore(STORE_NAME);
        
        const request = store.get(Number(id));
        
        request.onsuccess = () => {
            resolve(request.result);
        };
        
        request.onerror = (event) => {
            reject(event.target.error);
        };
    });
}

async function updateExpense(expense) {
    return new Promise((resolve, reject) => {
        const transaction = db.transaction([STORE_NAME], 'readwrite');
        const store = transaction.objectStore(STORE_NAME);
        
        const request = store.put(expense);
        
        request.onsuccess = () => {
            resolve(request.result);
        };
        
        request.onerror = (event) => {
            reject(event.target.error);
        };
    });
}

async function deleteExpense(id) {
    return new Promise((resolve, reject) => {
        const transaction = db.transaction([STORE_NAME], 'readwrite');
        const store = transaction.objectStore(STORE_NAME);
        
        const request = store.delete(Number(id));
        
        request.onsuccess = () => {
            resolve(true);
        };
        
        request.onerror = (event) => {
            reject(event.target.error);
        };
    });
}

// UI Functions
function formatDate(dateString) {
    const date = new Date(dateString);
    return date.toLocaleDateString('en-US', { 
        year: 'numeric', 
        month: 'short', 
        day: 'numeric' 
    });
}

function formatCurrency(amount) {
    return new Intl.NumberFormat('en-US', {
        style: 'currency',
        currency: 'USD'
    }).format(amount);
}

async function renderExpenses(filterCategory = '', filterMonth = '') {
    const expenses = await getAllExpenses();
    const tbody = document.getElementById('expenseTableBody');
    tbody.innerHTML = '';
    
    let filteredExpenses = [...expenses];
    
    // Apply filters
    if (filterCategory) {
        filteredExpenses = filteredExpenses.filter(expense => expense.category === filterCategory);
    }
    
    if (filterMonth) {
        const [year, month] = filterMonth.split('-');
        filteredExpenses = filteredExpenses.filter(expense => {
            const expenseDate = new Date(expense.date);
            return expenseDate.getFullYear() === Number(year) && 
                   (expenseDate.getMonth() + 1) === Number(month);
        });
    }
    
    // Sort by date (newest first)
    filteredExpenses.sort((a, b) => new Date(b.date) - new Date(a.date));
    
    if (filteredExpenses.length === 0) {
        const tr = document.createElement('tr');
        tr.innerHTML = `<td colspan="5" style="text-align: center;">No expenses found</td>`;
        tbody.appendChild(tr);
        return;
    }
    
    filteredExpenses.forEach(expense => {
        const tr = document.createElement('tr');
        tr.innerHTML = `
            <td>${formatDate(expense.date)}</td>
            <td>${expense.description}</td>
            <td>${expense.category}</td>
            <td>${formatCurrency(expense.amount)}</td>
            <td>
                <button class="action-btn edit-btn" data-id="${expense.id}">Edit</button>
                <button class="action-btn delete-btn" data-id="${expense.id}">Delete</button>
            </td>
        `;
        tbody.appendChild(tr);
    });
    
    // Update summary
    updateSummary(expenses);
}

function updateSummary(expenses) {
    const totalAmount = expenses.reduce((sum, expense) => sum + expense.amount, 0);
    document.getElementById('totalAmount').textContent = formatCurrency(totalAmount);
    
    const currentMonth = new Date().toISOString().slice(0, 7);
    const monthlyExpenses = expenses.filter(expense => 
        expense.date.startsWith(currentMonth));
    const monthlyAmount = monthlyExpenses.reduce((sum, expense) => sum + expense.amount, 0);
    document.getElementById('monthlyAmount').textContent = formatCurrency(monthlyAmount);
}

// Modal Functions
function openEditModal(expense) {
    const modal = document.getElementById('editModal');
    document.getElementById('editId').value = expense.id;
    document.getElementById('editAmount').value = expense.amount;
    document.getElementById('editDescription').value = expense.description;
    document.getElementById('editCategory').value = expense.category;
    document.getElementById('editDate').value = expense.date;
    modal.style.display = 'block';
}

function closeEditModal() {
    const modal = document.getElementById('editModal');
    modal.style.display = 'none';
}

// Event Listeners
document.addEventListener('DOMContentLoaded', async () => {
    try {
        await initDB();
        await renderExpenses();
        
        // Set today's date as default
        const today = new Date().toISOString().split('T')[0];
        document.getElementById('date').value = today;
        
    } catch (error) {
        console.error('Initialization error:', error);
        alert('Failed to initialize the application. Please try again.');
    }
});

document.getElementById('expenseForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const amount = parseFloat(document.getElementById('amount').value);
    const description = document.getElementById('description').value.trim();
    const category = document.getElementById('category').value;
    const date = document.getElementById('date').value;
    
    try {
        await addExpense({ amount, description, category, date });
        await renderExpenses();
        
        // Reset form
        document.getElementById('expenseForm').reset();
        document.getElementById('date').value = new Date().toISOString().split('T')[0];
    } catch (error) {
        console.error('Error adding expense:', error);
        alert('Failed to add expense. Please try again.');
    }
});

document.getElementById('editExpenseForm').addEventListener('submit', async (e) => {
    e.preventDefault();
    
    const id = parseInt(document.getElementById('editId').value);
    const amount = parseFloat(document.getElementById('editAmount').value);
    const description = document.getElementById('editDescription').value.trim();
    const category = document.getElementById('editCategory').value;
    const date = document.getElementById('editDate').value;
    
    try {
        await updateExpense({ id, amount, description, category, date });
        await renderExpenses(
            document.getElementById('filterCategory').value,
            document.getElementById('filterMonth').value
        );
        closeEditModal();
    } catch (error) {
        console.error('Error updating expense:', error);
        alert('Failed to update expense. Please try again.');
    }
});

document.getElementById('expenseTableBody').addEventListener('click', async (e) => {
    if (e.target.classList.contains('delete-btn')) {
        const id = e.target.getAttribute('data-id');
        if (confirm('Are you sure you want to delete this expense?')) {
            try {
                await deleteExpense(id);
                await renderExpenses(
                    document.getElementById('filterCategory').value,
                    document.getElementById('filterMonth').value
                );
            } catch (error) {
                console.error('Error deleting expense:', error);
                alert('Failed to delete expense. Please try again.');
            }
        }
    } else if (e.target.classList.contains('edit-btn')) {
        const id = e.target.getAttribute('data-id');
        try {
            const expense = await getExpenseById(id);
            openEditModal(expense);
        } catch (error) {
            console.error('Error fetching expense:', error);
            alert('Failed to load expense for editing. Please try again.');
        }
    }
});

document.getElementById('filterCategory').addEventListener('change', async (e) => {
    await renderExpenses(
        e.target.value,
        document.getElementById('filterMonth').value
    );
});

document.getElementById('filterMonth').addEventListener('change', async (e) => {
    await renderExpenses(
        document.getElementById('filterCategory').value,
        e.target.value
    );
});

document.querySelector('.close').addEventListener('click', closeEditModal);

window.addEventListener('click', (e) => {
    const modal = document.getElementById('editModal');
    if (e.target === modal) {
        closeEditModal();
    }
}); 