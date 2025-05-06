import {createConnection} from 'mysql2';


 var conn = createConnection({
    host: "localhost",
    user: "root",
    password: "cdac",
    database: "project"
});
conn.connect((error) => {
    if (error) {
        console.log(error);
    }
    else {
        console.log("Db connected !");
    }
});
export function getConnectionObject(){
    return conn;
}