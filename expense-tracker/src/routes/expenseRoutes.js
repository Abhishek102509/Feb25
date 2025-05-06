import { Router } from 'express';
import { authenticate } from '../middlewares/authMiddleware.js';
import { 
  addExpense, 
  getAllExpenses, 
  getSingleExpense, 
  modifyExpense, 
  removeExpense 
} from '../controllers/expenseController.js';

const router = Router();

router.use(authenticate);

router.post('/', addExpense);
router.get('/', getAllExpenses);
router.get('/:id', getSingleExpense);
router.put('/:id', modifyExpense);
router.delete('/:id', removeExpense);

export default router;