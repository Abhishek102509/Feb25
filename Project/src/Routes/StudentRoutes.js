import express from 'express';
import { verifyToken } from '../middlewares/VerifyToken.js';
import { deleteStudent, getAllStudents, getStudentsById, registerStudent, updateStudent } from '../controllers/Studentcontroller.js';

const studentRouter= express.Router();

studentRouter.post("/",registerStudent);

studentRouter.get("/:id",getStudentsById);
studentRouter.get("/",getAllStudents);
studentRouter.delete("/:id",deleteStudent);
studentRouter.put("/:id",updateStudent);

export default studentRouter;