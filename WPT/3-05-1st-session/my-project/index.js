import express from 'express';

const app = express();

app.use(express.json()); // it will register a middleware that has to be cled on each and every request/url

app.get("/",(request,response)=>{
    response.send("welcome to our app");
});

app.post("/sum",(request,response)=>{
    //request.params // it will give url parameters
    const data = request.body; // it will give data passed into the request body
    console.log(data);
    response.send("sum");
});

app.listen(9600,()=>{
    console.log("server started...!");
});