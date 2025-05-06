import { StatusCodes } from 'http-status-codes';
import { 
  createExpense, 
  getExpensesByUser, 
  getExpenseById, 
  updateExpense, 
  deleteExpense 
} from '../models/expenseModel.js';

export const addExpense = (req, res) => {
  const { amount, description, category, date } = req.body;
  
  if (!amount || !description || !category) {
    return res.status(StatusCodes.BAD_REQUEST).send({ message: 'Amount, description, and category are required' });
  }

  createExpense({ amount, description, category, date }, req.userId, (err, result) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error adding expense' });
    }
    res.status(StatusCodes.CREATED).send({ message: 'Expense added successfully', id: result.insertId });
  });
};

export const getAllExpenses = (req, res) => {
  getExpensesByUser(req.userId, (err, results) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error fetching expenses' });
    }
    res.status(StatusCodes.OK).send(results);
  });
};

export const getSingleExpense = (req, res) => {
  const expenseId = req.params.id;
  
  getExpenseById(expenseId, req.userId, (err, results) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error fetching expense' });
    }
    
    if (results.length === 0) {
      return res.status(StatusCodes.NOT_FOUND).send({ message: 'Expense not found' });
    }
    
    res.status(StatusCodes.OK).send(results[0]);
  });
};

export const modifyExpense = (req, res) => {
  const expenseId = req.params.id;
  const { amount, description, category, date } = req.body;
  
  if (!amount || !description || !category) {
    return res.status(StatusCodes.BAD_REQUEST).send({ message: 'Amount, description, and category are required' });
  }

  updateExpense(expenseId, req.userId, { amount, description, category, date }, (err, result) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error updating expense' });
    }
    
    if (result.affectedRows === 0) {
      return res.status(StatusCodes.NOT_FOUND).send({ message: 'Expense not found' });
    }
    
    res.status(StatusCodes.OK).send({ message: 'Expense updated successfully' });
  });
};

export const removeExpense = (req, res) => {
  const expenseId = req.params.id;
  
  deleteExpense(expenseId, req.userId, (err, result) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error deleting expense' });
    }
    
    if (result.affectedRows === 0) {
      return res.status(StatusCodes.NOT_FOUND).send({ message: 'Expense not found' });
    }
    
    res.status(StatusCodes.OK).send({ message: 'Expense deleted successfully' });
  });
};