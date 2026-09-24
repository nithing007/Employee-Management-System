# Employee Management System

A console-based employee management application built with **Java, JDBC, and MySQL**. The system provides a simple menu-driven interface for managing employees and maintaining their relationships with departments and projects.

## Overview

The **Employee Management System** is a Java-based application that connects to a MySQL database using **JDBC**.

It was built to practice real-world database operations such as:

- Creating and storing employee records
- Associating employees with departments and projects
- Updating employee information
- Retrieving employee records from MySQL
- Executing SQL queries through JDBC
- Working with relational database relationships

The application runs directly from the command line and uses a menu-driven interface.

## Features

- Add department details
- Add project details
- Add employee details
- Assign employees to departments and projects
- Update employee information
- View employee records
- Maintain employee, department, and project relationships
- Handle database operations using JDBC
- Simple command-line interface

## Tech Stack

| Technology | Purpose |
|---|---|
| **Java** | Application development |
| **JDBC** | Communication between Java and MySQL |
| **MySQL** | Relational database |
| **SQL** | Data storage and manipulation |
| **Java Scanner** | Console input handling |

## Project Structure

```text
Employee-Management-System/
│
├── src/
│   └── ManagementJDBC.java
│
├── lib/
│   └── MySQL JDBC Connector
│
└── README.md
````

### Main Source File

`ManagementJDBC.java`

This file contains the main application logic, including:

* MySQL connection
* Menu handling
* Department insertion
* Project insertion
* Employee insertion
* Employee updates
* Employee record retrieval
* Exception handling

## Database Design

The application works with three main tables:

```text
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

### Department

Stores department information such as:

* Department ID
* Department name

### Project

Stores project information such as:

* Project ID
* Project name
* Project status

### Employee

Stores employee information such as:

* Employee ID
* Employee name
* Email
* Mobile number
* City
* State
* Date of joining
* Department ID
* Project ID
* Employee status
* Experience

The `Department ID` and `Project ID` stored in the employee record establish the relationship between employees, departments, and projects.

## Application Flow

```text
Start
  │
  ▼
Connect to MySQL Database
  │
  ▼
Display Main Menu
  │
  ├── 1. Insert Details
  │       │
  │       ├── Department
  │       ├── Project
  │       └── Employee
  │
  ├── 2. Update Employee
  │       │
  │       ├── Name
  │       ├── Email
  │       ├── Mobile
  │       ├── City
  │       ├── State
  │       └── Experience
  │
  ├── 3. View Employee Details
  │
  └── 4. Exit
          │
          ▼
        Close
```

## Getting Started

### Prerequisites

Before running the application, make sure you have:

* **JDK 8 or later**
* **MySQL Server**
* **MySQL Connector/J**
* A Java-compatible IDE or terminal

You can use IntelliJ IDEA, Eclipse, VS Code, or another Java development environment.

## Database Setup

### 1. Create the Database

Open MySQL and create the application database:

```sql
CREATE DATABASE management_db;
```

Select the database:

```sql
USE management_db;
```

### 2. Create the Required Tables

Create the following tables:

```text
Department
Project
Employee
```

The `Employee` table should reference the corresponding department and project records using their IDs.

> **Note:** Make sure the table and column names match the SQL queries used in `ManagementJDBC.java`.

## Configure the Database Connection

Before running the application, configure the MySQL connection in `ManagementJDBC.java`.

The connection follows this format:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/management_db",
    "YOUR_USERNAME",
    "YOUR_PASSWORD"
);
```

Replace:

```text
YOUR_USERNAME
YOUR_PASSWORD
```

with your local MySQL credentials.

### Security Note

Do not commit real database passwords, API keys, or other credentials to GitHub.

For a production-ready version, database credentials should be stored outside the source code using environment variables or a configuration file that is excluded from Git.

## Add MySQL JDBC Driver

Download **MySQL Connector/J** and add the `.jar` file to the project's classpath.

Example:

```text
mysql-connector-j-8.x.x.jar
```

If you are using an IDE, add the connector JAR as a project dependency.

## Run the Application

From the directory containing the Java source file, compile the application:

```bash
javac -cp "lib/mysql-connector-j-8.x.x.jar" src/ManagementJDBC.java
```

Then run it with the required classpath:

```bash
java -cp "lib/mysql-connector-j-8.x.x.jar;src" ManagementJDBC
```

> **Note:** On Linux/macOS, replace `;` in the classpath with `:`.

## Using the Application

After starting the application, the following menu is displayed:

```text
===== Management System =====

1. Insert Details
2. Update Details
3. View Details
4. Exit

Enter Choice:
```

### Insert Details

Selecting option `1` allows you to enter:

1. Department information
2. Project information
3. Employee information

The employee is associated with the selected department and project through their IDs.

### Update Details

Selecting option `2` requires an employee ID and allows you to update:

* Name
* Email
* Mobile number
* City
* State
* Experience

### View Details

Selecting option `3` retrieves employee records from the MySQL database and displays them in the console.

### Exit

Selecting option `4` closes the application and database connection.

## Example

```text
===== Management System =====

1. Insert Details
2. Update Details
3. View Details
4. Exit

Enter Choice: 3

===== Employee Details =====

--------------------------------
Employee ID   : 101
Name          : John
Email         : john@example.com
Mobile No     : 9876543210
City          : Chennai
State         : Tamil Nadu
Date Joining  : 2026-01-10
Department ID : 1
Project ID    : 10
Status        : true
Experience    : 2 years
```

## Concepts Demonstrated

This project focuses on practical implementation of:

* Java programming
* JDBC
* MySQL database connectivity
* SQL queries
* `PreparedStatement`
* `Statement`
* `ResultSet`
* CRUD operations
* Relational database concepts
* Foreign key relationships
* Exception handling
* Console-based application development

## Current Limitations

The current version is intentionally simple and focuses on core Java and JDBC concepts.

Some features that are not currently implemented include:

* Employee deletion
* Employee search
* Advanced input validation
* Authentication and authorization
* GUI
* REST API
* Automated database initialization
* Externalized configuration
* Unit and integration tests

## Future Improvements

Possible improvements for future versions include:

* Add employee deletion
* Add employee search by ID or name
* Add input validation
* Improve exception handling
* Move database credentials to environment variables
* Add dedicated database scripts
* Add unit and integration tests
* Add logging
* Build a Java Swing/JavaFX interface
* Convert the application into a Spring Boot REST API
* Add authentication and role-based access control

## Learning Outcome

This project provided hands-on experience with connecting a Java application to a relational database and performing database operations through JDBC.

It also helped reinforce the relationship between application logic, SQL queries, and relational database design.

## Contributing

Contributions and improvements are welcome.

If you would like to improve the project:

```bash
git clone https://github.com/nithing007/Employee-Management-System.git
cd Employee-Management-System
```

Create a new branch for your changes:

```bash
git checkout -b feature/your-feature-name
```

Make your changes, test them locally, and open a pull request.

## Author

**Nithin G**

GitHub: [@nithing007](https://github.com/nithing007)

## License

This project is currently available for learning and educational purposes.
