import express from 'express';

// create an express application
const app = express(); // it will return object of newly created express app

app.get("/",(request,response)=>{
    response.status(200).send("welcome to home");
});

app.get("/login",(request,response)=>{
    response.send("welcome to login");
});

app.get("/sum/:x/:y",(request,response)=>{
    console.log(request.params.x); // {x:3,y:5}
    var a = parseInt(request.params.x);
    var b = parseInt(request.params.y);
    var c = a + b;
    response.send(`sum is ${c}`);
});

app.listen(3500,()=>{
    console.log("server is running....");
});