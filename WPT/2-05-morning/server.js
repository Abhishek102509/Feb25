import {createServer} from 'http';
import {sum,product} from './mymodule.js';
var server = createServer((request,response)=>{
    var s = sum(2,3);
    var p = product(5,6);
    response.write(`sum is ${s} and product is ${p}`);
    response.end();
}); // create a server and will return a server object

server.listen(4500,()=>{
    console.log("server started");
}); // start listening on the requests