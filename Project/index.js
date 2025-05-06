import { compare, hashSync } from 'bcrypt';
import express from 'express';

//import { StatusCodes } from 'http-status-codes';

import jwt from 'jsonwebtoken';
import { verifyToken } from './src/middlewares/VerifyToken.js';
import studentRouter from './src/Routes/StudentRoutes.js';







const app = express();
app.use(express.json());




app.get("/", (req, res) => {
    res.send({ message: 'Welcome to student CRUD' });
});
















app.post("/admin", (req, res) => {
    try {
        const data = req.body;
       const encryptedPasswrod = hashSync(data.password,10);
       data.password="";

        const qry = `insert into admin values (${data.id},'${data.name}','${data.username}','${encryptedPasswrod}')`;
    
        conn.query(qry,(error,result)=>{
            if(error){
                console.log(error)
                res.send({massage: "Problem in inserting data" })
            }else{
                res.send({massage:"Admin register"})
            }
    
        })
        
    } catch (error) {
        req.send({massage:"somthing went wrong"})
    }
 

})


app.get("/admin",(req,res)=>{

    try {
        //const id = parseInt(req.params.id);
    const qry = `select * from admin;`;
    conn.query(qry,(error,result)=>{
        if(error){
            console.log(error)
            res.send({massage:"Admin nahi hai"})
        }else{
            res.send(result);
        }

    })
        
    } catch (error) {
        res.send("Somthing went wrong")
        
    }
    
})
app.get("/admin/login",verifyToken,(req,res)=>{

    try {
        // const id = parseInt(req.params.id);
       const requestData=  req.body;
    const qry = `select * from admin where username=${requestData.username}`;
    conn.query(qry,(error,result)=>{
        if(error){
            console.log(error)
            res.send({message:'Problem while logging you in...please try again later'});
        }else{
           console.log(result);
            if(result.length==0){
                res.send({massage:"username and passwars incorrect"})
            }else{
                if(compare(requestData.password,result[0].password)){
                    const token =jwt.sign({adminId:result[0].id},"hello123")
                    res.send({massage:'login ho gaya'},token);
                    

                }else{
                    res.send({massage:"username and passwars incorrect"})
                }
            }
            
        }

    })
        
    } catch (error) {
        res.send("Somthing went wrong")
        
    }
    
})















app.use("/student",studentRouter)



const port = 4040;

app.listen(port, (req, res) => {
    console.log("server Started..");

});