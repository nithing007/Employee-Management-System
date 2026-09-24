CREATE DATABASE management_db;
USE management_db;
CREATE TABLE Department (
    Departmentid INT PRIMARY KEY AUTO_INCREMENT,
    DepartmentName VARCHAR(100) NOT NULL
);
CREATE TABLE Project (
    Projectid INT PRIMARY KEY AUTO_INCREMENT,
    ProjectName VARCHAR(100) NOT NULL,
    Status BOOLEAN
);
CREATE TABLE Employee (
    Empid INT PRIMARY KEY AUTO_INCREMENT,
    Empname VARCHAR(20) UNIQUE NOT NULL,
    Email VARCHAR(100),
    MobileNO VARCHAR(15),
    City VARCHAR(100),
    State VARCHAR(100),
    DateofJoining DATE,
    Departmentid INT,
    Projectid INT,
    Status BOOLEAN,
    Experience VARCHAR(100),
    FOREIGN KEY (Departmentid) REFERENCES Department(Departmentid),
    FOREIGN KEY (Projectid) REFERENCES Project(Projectid)
);
SELECT * FROM Employee;