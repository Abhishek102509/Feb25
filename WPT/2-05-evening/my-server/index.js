import {createServer} from 'http';

const server = createServer((request,response)=>{
    // read the request url
    // apply conditions on url
    // if(url="127.0.0.1:5000") {} else if(url=="127.0.0.1:5000/students"){}
    response.write("hii and bye");
    response.end();
});

server.listen(5600,()=>{
    console.log("server is started");
});