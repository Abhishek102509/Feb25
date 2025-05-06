import db from './db.js';
import bcrypt from 'bcrypt';
import jwt from 'jsonwebtoken';

export const createUser = (userData, callback) => {
  bcrypt.hash(userData.password, 10, (err, hash) => {
    if (err) return callback(err);
    
    const query = 'INSERT INTO users (username, email, password) VALUES (?, ?, ?)';
    db.query(query, [userData.username, userData.email, hash], callback);
  });
};

export const findUserByEmail = (email, callback) => {
  const query = 'SELECT * FROM users WHERE email = ?';
  db.query(query, [email], callback);
};

export const generateAuthToken = (userId) => {
  return jwt.sign({ id: userId }, process.env.JWT_SECRET || 'your-secret-key', { expiresIn: '24h' });
};