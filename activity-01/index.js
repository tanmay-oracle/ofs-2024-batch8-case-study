import readline from "readline-sync";
import { Employee } from "./Employee.js";
import * as fs from "fs";

let id = readline.question("Enter your id: ");
let name = readline.question("Enter your name: ");
let salary = readline.question("Enter your salary: ");

const employeeDetails = new Employee(id, name, salary);

let jsonData = [];

if (fs.existsSync("employees.json")) {
    const existingData = fs.readFileSync("employees.json");
    jsonData = JSON.parse(existingData);
}

jsonData.push(employeeDetails);

fs.writeFileSync("employees.json", JSON.stringify(jsonData));
