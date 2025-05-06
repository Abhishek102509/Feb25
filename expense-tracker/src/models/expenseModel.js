import db from './db.js';

export const createExpense = (expenseData, userId, callback) => {
  const query = 'INSERT INTO expenses (amount, description, category, date, user_id) VALUES (?, ?, ?, ?, ?)';
  db.query(query, [
    expenseData.amount,
    expenseData.description,
    expenseData.category,
    expenseData.date || new Date(),
    userId
  ], callback);
};

export const getExpensesByUser = (userId, callback) => {
  const query = 'SELECT * FROM expenses WHERE user_id = ? ORDER BY date DESC';
  db.query(query, [userId], callback);
};

export const getExpenseById = (expenseId, userId, callback) => {
  const query = 'SELECT * FROM expenses WHERE id = ? AND user_id = ?';
  db.query(query, [expenseId, userId], callback);
};

export const updateExpense = (expenseId, userId, expenseData, callback) => {
  const query = 'UPDATE expenses SET amount = ?, description = ?, category = ?, date = ? WHERE id = ? AND user_id = ?';
  db.query(query, [
    expenseData.amount,
    expenseData.description,
    expenseData.category,
    expenseData.date,
    expenseId,
    userId
  ], callback);
};

export const deleteExpense = (expenseId, userId, callback) => {
  const query = 'DELETE FROM expenses WHERE id = ? AND user_id = ?';
  db.query(query, [expenseId, userId], callback);
};