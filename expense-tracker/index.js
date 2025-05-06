import express from 'express';
import { StatusCodes } from 'http-status-codes';
import userRouter from './src/routes/userRoutes.js';
import expenseRouter from './src/routes/expenseRoutes.js';

const PORT = 7800;
const app = express();
app.use(express.json());

// Routes
app.use('/api/users', userRouter);
app.use('/api/expenses', expenseRouter);

// Health check
app.get('/', (req, res) => {
  res.status(StatusCodes.OK).send({ message: 'Expense Tracker API is running' });
});

// Error handling
app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Something broke!' });
});

app.listen(PORT, () => {
  console.log(`Server is running on ${PORT}`);
});