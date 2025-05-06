import express from 'express';
import { deleteStudent, getAllStudents, getStudentById, registerStudent, updateStudent } from '../controllers/StudentController.js';
import { verifyToken } from '../middlewares/VerifyToken.js';

const studentRouter = express.Router(); // becasue routing is not getting handled into a separate js file

studentRouter.post("/",registerStudent);

studentRouter.get("/",getAllStudents);

studentRouter.get("/:id",getStudentById);

studentRouter.delete("/:id",deleteStudent);

studentRouter.put("/:id",updateStudent);

export default studentRouter;

