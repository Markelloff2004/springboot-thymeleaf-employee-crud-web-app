CREATE DATABASE IF NOT EXISTS EmployeeDB;

USE EmployeeDB;

DROP TABLE IF EXISTS EmployeeDB.employee;

CREATE TABLE EmployeeDB.employee (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    phone VARCHAR(255)
    );

INSERT INTO EmployeeDB.employee (first_name, last_name, email, phone) VALUES
('John', 'Doe', 'john.doe@example.com', '123-456-7890'),
('Jane', 'Smith', 'jane.smith@example.com', '098-765-4321'),
('Alice', 'Johnson', 'alice.johnson@example.com', '111-222-3333'),
('Bob', 'Williams', 'bob.williams@example.com', '444-555-6666'),
('Charlie', 'Brown', 'charlie.brown@example.com', '777-888-9999'),
('David', 'Lee', 'david.lee@example.com', '333-444-5555'),
('Emma', 'Taylor', 'emma.taylor@example.com', '999-888-7777'),
('Frank', 'Wilson', 'frank.wilson@example.com', '222-333-4444'),
('Grace', 'Anderson', 'grace.anderson@example.com', '555-666-7777'),
('Henry', 'Martinez', 'henry.martinez@example.com', '666-777-8888'),
('Ivy', 'Garcia', 'ivy.garcia@example.com', '888-999-0000'),
('James', 'Clark', 'james.clark@example.com', '000-111-2222');


show databases ;
