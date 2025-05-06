import express from 'express';

const app = express();

app.get('/',(req,res)=>{
    res.send("welcome to page");
})

app.post('/sum',(req,res)=>{
    req.params // it will give url parameter
    req.body; //it will give data passed into the request
    
})




const port =8080;
app.listen(port,()=>{
    console.log("Server started");
})