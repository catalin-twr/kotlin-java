# kotlin-java
Simple application that proves kotlin-java interoperability. The application has a simple controller, which allows to create and retrieve an employee entity.
In order to run it, import the project in IntelliJ. Java 17 is required.

Endpoints:
GET: http://localhost:8080/employee/{employee_id}
POST: http://localhost:8080/employee
{
"name":"John",
"departmentId":22
}