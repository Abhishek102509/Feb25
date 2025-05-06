import { getConnectionObject } from "../Dbconfig/DbConnection.js";




const conn = getConnectionObject();


export function registerStudent(req, res){

    try {
        const data = req.body;
        const qry = `insert into student values(${data.id},'${data.name}','${data.phone}',${data.marks})`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error)
                res.send({ massege: 'problem in inserting data' })
            } else {
                res.send({ massage: 'Student Data Added' })
            }

        });
    } catch (error) {
        res.send({ massege: 'Somting went wrong' });

    }
};




export function getAllStudents(req, res)  {
    try {
        const qry = "select * from student";

        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                res.send("problrm data base");
            } else {
                res.send(result);
            }
        })

    } catch (error) {
        res.send("Somthing went wrong")

    }
};

export function getStudentsById(req, res) {
    try {
        const id = parseInt(req.params.id);
        const qry = `select * from student where id = ${id}`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                res.send("Baccha nahi hai");
            } else {
                res.send(result[0]);
            }

        })

    } catch (error) {
        res.send("somthing went wrong")

    }



};

export function deleteStudent(req, res){
    try {
        const id = parseInt(req.params.id);
        const qry = `delete from student where id =${id}`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                res.send("id nahi hai");
            }
            else {
                res.send("delete hoga gaya")
            }
        });

    } catch (error) {
        res.send("kuch to galat hua hai")

    }
};


export function updateStudent(req, res)  {
    try {
        const id = parseInt(req.params.id);
        const data = req.body;
        const qry = `update student set name='${data.name}', phone='${data.phone}', marks='${data.marks}' where id=${id}`;
        conn.query(qry, (error, result) => {
            if (error) {
                console.log(error);
                res.send("student nahi hai");
            } else {
                res.send("update ho gya");
            }
        });

    } catch (error) {
        res.send("kuch to galta hua hai")

    }

};