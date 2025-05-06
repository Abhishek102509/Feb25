// import {createServer} from 'http';

// const server  = createServer((req,res)=>{
//     res.write("hello");
//     res.end();
// } );

import express from 'express';
// const express = require(express);
const app = express();


app.get('/',(req,res)=>{
    res.send("root")
});
app.get('/Home',(req,res)=>{
    res.send("Home Page")
});
app.get('/sum/:x/:y',(req,res) => {
   console.log(req.params);
   var a = parseInt(req.params.x);
   var b =parseInt(req.params.y);
   var z = a+b
   res.send(`sum of${z}`)
})
app.get('/fact/:x',(req,res)=>{
    console.log(req.params);
    var fact =1;
    var n= parseInt(req.params.x);
    for(var i=1; i<=n;i++){
        fact = fact*i
    }
    res.send(`fact is ${fact}`)


});
app.get('/Age/:x',(req,res)=>{
    

  console.log(req.params);
 
  var a =parseInt(req.params.x);
  if(a>18){
    res.status(200).send("Madharchod ke age jada ho gayi");
  }else{
    res.status(404).send("Bhadwe ki age kam hai");
}
  
})




// app.post('/users',async(req,res)=>{
//     const user = new user(req.body);
//     await user.save();
//     res.send(user);

// });

let port =8080;
app.listen(port,()=>{
    console.log(`server startes....${port}`)
});