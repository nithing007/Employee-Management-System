# Employee Management System

A console-based **Employee Management System** built with **Java, JDBC, and MySQL**. The application demonstrates how a Java program can connect to a relational database, manage employee records, and maintain relationships between employees, departments, and projects.

## Features

- Add department, project, and employee details
- Assign employees to departments and projects
- Update employee information
- View employee records
- Perform SQL operations using JDBC
- Use `PreparedStatement`, `Statement`, and `ResultSet`
- Maintain relational data using foreign keys
- Secure database credentials using an external configuration file

## Tech Stack

| Technology | Purpose |
|---|---|
| Java | Application development |
| JDBC | Java-MySQL database connectivity |
| MySQL | Relational database |
| SQL | Data definition and manipulation |
| MySQL Connector/J | JDBC driver |
| Scanner | Console input |

## Project Structure

```text
Employee-Management-System/
│
├── src/
│   └── ManagementJDBC.java
│
├── config/
│   ├── db.properties
│   └── db.properties.example
│
├── sql/
│   └── database.sql
│
├── lib/
│   └── mysql-connector-j-....jar
│
├── .gitignore
└── README.md
```

## Main Components

- ManagementJDBC.java — application logic and JDBC operations
- db.properties — local database configuration and credentials
- db.properties.example — configuration template for other users
- database.sql — database and table setup script
- MySQL Connector/J — JDBC driver used to connect Java with MySQL
Database Design
The application uses three related tables:
```
Department
    │
    │ Department ID
    ▼
Employee
    │
    │ Project ID
    ▼
Project
```
# Department
Stores department information.
- Department ID
- Department Name
# Project
Stores project information.
- Project ID
- Project Name
- Project Status
# Employee
Stores employee information.
- Employee ID
- Employee Name
- Email
- Mobile Number
- City
- State
- Date of Joining
- Department ID
- Project ID
- Status
- Experience
DepartmentID and ProjectID establish relationships between employees, departments, and projects.
# Setup
Prerequisites
- JDK 8 or later
- MySQL Server
- MySQL Connector/J
- Java-compatible IDE or terminal
1. Clone the Repository
```
git clone https://github.com/nithing007/Employee-Management-System.git
cd Employee-Management-System
```

2. Configure MySQL
Run the SQL script located at:
```
sql/database.sql
```

This creates the management_db database and required tables.
3. Configure Database Credentials
Create:
```
config/db.properties
```

using the example file:
```
config/db.properties.example
```

Set your local MySQL credentials:
```
db.url=jdbc:mysql://localhost:3306/management_db
db.username=root
db.password=YOUR_MYSQL_PASSWORD
```

Do not commit config/db.properties to GitHub.
The project uses config/db.properties only for local database configuration.

# Run the Application
Add the MySQL Connector/J .jar file to the project classpath.
On Windows:
```
javac -cp "lib/mysql-connector-j-....jar" src/ManagementJDBC.java
java -cp "lib/mysql-connector-j-....jar;src" ManagementJDBC
```
On Linux/macOS, replace ; with : in the classpath.
Application Menu
```
===== Management System =====
1. Insert Details
2. Update Details
3. View Details
4. Exit
```
Insert Details
Adds:
1. Department
2. Project
3. Employee
The employee is linked to the selected department and project using their IDs.

Update Details
Employee information that can be updated:
- Name
- Email
- Mobile Number
- City
- State
- Experience
View Details
Retrieves employee records from MySQL and displays them in the console.
Concepts Demonstrated
- Core Java
- JDBC
- MySQL connectivity
- SQL
- PreparedStatement
- Statement
- ResultSet
- CRUD operations
- Foreign key relationships
- Relational database design
- Exception handling
- External configuration
- Console-based application development
- 
Security
Database credentials are stored locally in:
```
config/db.properties
```
This file is excluded from Git using .gitignore.
Use:
```
config/db.properties.example
```
as the configuration template.
Never commit real passwords or other sensitive credentials to a public repository.

# Future Improvements
- Employee search
- Employee deletion
- Input validation
- Better exception handling
- Unit testing
- Logging
- GUI using JavaFX or Swing
- REST API using Spring Boot
- Authentication and role-based access control

# Author
Nithin G

GitHub: @nithing007