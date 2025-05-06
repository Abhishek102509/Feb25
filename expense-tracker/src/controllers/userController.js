import { StatusCodes } from 'http-status-codes';
import { createUser, findUserByEmail, generateAuthToken } from '../models/userModel.js';
import bcrypt from 'bcrypt';

export const registerUser = (req, res) => {
  const { username, email, password } = req.body;
  
  if (!username || !email || !password) {
    return res.status(StatusCodes.BAD_REQUEST).send({ message: 'Please provide all required fields' });
  }

  findUserByEmail(email, (err, results) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Database error' });
    }
    
    if (results.length > 0) {
      return res.status(StatusCodes.CONFLICT).send({ message: 'Email already registered' });
    }

    createUser({ username, email, password }, (err, result) => {
      if (err) {
        return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Error creating user' });
      }
      
      const token = generateAuthToken(result.insertId);
      res.status(StatusCodes.CREATED).send({ token });
    });
  });
};

export const loginUser = (req, res) => {
  const { email, password } = req.body;
  
  if (!email || !password) {
    return res.status(StatusCodes.BAD_REQUEST).send({ message: 'Email and password required' });
  }

  findUserByEmail(email, (err, results) => {
    if (err) {
      return res.status(StatusCodes.INTERNAL_SERVER_ERROR).send({ message: 'Database error' });
    }
    
    if (results.length === 0) {
      return res.status(StatusCodes.UNAUTHORIZED).send({ message: 'Invalid credentials' });
    }

    const user = results[0];
    bcrypt.compare(password, user.password, (err, isMatch) => {
      if (err || !isMatch) {
        return res.status(StatusCodes.UNAUTHORIZED).send({ message: 'Invalid credentials' });
      }
      
      const token = generateAuthToken(user.id);
      res.status(StatusCodes.OK).send({ token });
    });
  });
};