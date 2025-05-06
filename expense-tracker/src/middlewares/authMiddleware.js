import jwt from 'jsonwebtoken';
import { StatusCodes } from 'http-status-codes';

export const authenticate = (req, res, next) => {
  const token = req.header('Authorization')?.replace('Bearer ', '');
  
  if (!token) {
    return res.status(StatusCodes.UNAUTHORIZED).send({ error: 'Authentication required' });
  }

  try {
    const decoded = jwt.verify(token, process.env.JWT_SECRET || 'your-secret-key');
    req.userId = decoded.id;
    next();
  } catch (err) {
    res.status(StatusCodes.UNAUTHORIZED).send({ error: 'Invalid token' });
  }
};