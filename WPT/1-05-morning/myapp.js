const fs = require("fs");

var data = fs.readFileSync("myfile.txt");
console.log(data.toString());
console.log("after reading file...!");