````markdown
# Employee Management System

A console-based Employee Management System built using Java, JDBC, and MySQL to perform employee record management operations. This project demonstrates CRUD operations, database connectivity, and relational database concepts using a menu-driven Java application.

---

## 📌 Features

-  Add Department Details
-  Add Project Details
-  Add Employee Details
-  Update Employee Information
-  View All Employee Records
-  Maintain relationships between Employees, Departments, and Projects
-  Exit the application safely

---

## 🛠️ Tech Stack

| Technology | Usage |
|------------|--------|
| Java | Core Application Development |
| JDBC | Database Connectivity |
| MySQL | Relational Database |
| SQL | Data Manipulation |
| Scanner | Console Input Handling |

---

## 📂 Project Structure

```text
EmployeeManagementSystem/
│
├── ManagementJDBC.java      # Main Java source file
├── README.md                # Project Documentation
└── Database/
    ├── Department Table
    ├── Project Table
    └── Employee Table
````

## ⚙️ Functionality

### 1. Insert Details

The system allows users to insert:

* Department Information
* Project Information
* Employee Information

Employee records are linked with corresponding departments and projects using foreign keys.

---

### 2. Update Details

Users can update the following employee details using the Employee ID:

* Name
* Email
* Mobile Number
* City
* State
* Experience

---

### 3. View Details

Displays all employee records stored in the database, including:

* Employee ID
* Employee Name
* Email
* Mobile Number
* City
* State
* Date of Joining
* Department ID
* Project ID
* Employment Status
* Experience

---

## 🔄 Application Flow

```text
Start Application
       │
       ▼
Display Main Menu
       │
       ▼
1. Insert Details
2. Update Details
3. View Details
4. Exit
       │
       ▼
Perform Selected Operation
       │
       ▼
Update/Retrieve Data from MySQL
       │
       ▼
Display Result
       │
       ▼
Return to Menu or Exit
```

---

## 🚀 How to Run the Project

### Prerequisites

* Java JDK 8 or above
* MySQL Server
* MySQL Connector/J (JDBC Driver)
* Any Java IDE (IntelliJ IDEA, Eclipse, VS Code)

---

### Step 1: Create Database

```sql
CREATE DATABASE management_db;
```

---

### Step 2: Create Tables

Create the following tables:

* Department
* Project
* Employee

Ensure foreign key relationships are properly defined.

---

### Step 3: Configure Database Credentials

Update the following code with your MySQL credentials:

```java
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/management_db",
    "your_username",
    "your_password"
);
```

---

### Step 4: Add MySQL JDBC Driver

Add the MySQL Connector JAR file to your project.

Example:

```text
mysql-connector-j-8.x.x.jar
```

---

### Step 5: Compile and Run

Compile:

```bash
javac ManagementJDBC.java
```

Run:

```bash
java ManagementJDBC
```

---

## 📸 Sample Console Output

```text
===== Management System =====

1. Insert Details
2. Update Details
3. View Details
4. Exit

Enter Choice:
```

---

## 🎓 Learning Outcomes

This project helped in understanding:

* Java Database Connectivity (JDBC)
* CRUD Operations
* SQL Query Execution
* Relational Database Design
* Foreign Key Relationships
* Exception Handling
* Console-Based Application Development

---

## 🔮 Future Enhancements

* Delete Employee Records
* Search Employee by ID or Name
* Department Management Module
* Project Management Module
* Input Validation
* Logging Support
* GUI Version using Java Swing or JavaFX
* Web-based version using Spring Boot

---
