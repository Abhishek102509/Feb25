const mymodule = require("./mymodule.js"); // for user defined module develoepr need to give a relative path  
console.log("hello world");
var rs = mymodule.sum(3,4);
var p = mymodule.product(5,7);
console.log("sum is ",rs," product is",p);