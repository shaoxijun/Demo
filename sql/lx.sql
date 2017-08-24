CREATE DATABASE foodcompany;

CREATE TABLE company(company_no INT PRIMARY KEY,company_name VARCHAR(50),company_address VARCHAR(40),company_tel CHAR(11));
CREATE TABLE foodinfor(foodifor_name VARCHAR(30),food_price FLOAT,company_no INT);

USE choose;
DROP TABLE students;
DROP TABLE class;
DROP DATABASE adf;

CREATE TABLE class(NO INT PRIMARY KEY,
		NAME VARCHAR(30),
		department VARCHAR(30));
SELECT * FROM class;
DELETE FROM class WHERE class_no = 001;
INSERT INTO class VALUES(001,'自动化1班','自动控制系'),
			(002,'自动化2班','自动控制系'),
			(003,'自动化3班','自动控制系'),
			(004,'自动化4班','自动控制系'),
			(005,'自动化5班','自动控制系');
INSERT INTO class(NO,NAME) VALUES(006,'自动3班');
CREATE TABLE students (
			id INT PRIMARY KEY,
			NAME VARCHAR(20),
			age INT DEFAULT 18
);
CREATE TABLE lists(
	id INT PRIMARY KEY,
	NAME VARCHAR(30) NOT NULL,
	age INT DEFAULT 15	
	age		
);
CREATE TABLE company(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL,
	age INT DEFAULT 19
);
SELECT * FROM class;
SELECT * FROM student;
CREATE TABLE student(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL,
	age INT DEFAULT 19,
	class_id INT,
	CONSTRAINT student_class FOREIGN KEY (class_id) REFERENCES class(NO)	
);
INSERT INTO student VALUES(100,'刘德华',49,1);
INSERT INTO student VALUES(101,'刘亦菲',30,2);
INSERT INTO student VALUES(102,'周润发',50,3);
INSERT INTO student VALUES(103,'周星驰',60,4);
INSERT INTO student VALUES(104,'吴孟达',55,5);
SHOW TABLES;



CREATE DATABASE lx;
CREATE TABLE teacher(
	num INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL,
	age INT,
	tel VARCHAR(11)
	
);
INSERT INTO teacher(NAME,age,tel) VALUES
	('刘德华',29,'123040192'),
	('刘亦菲',22,'123040192'),
	('周润发',24,'123040192'),
	('周星驰',25,'123040192'),
	('吴孟达',26,'123040192'),
	('梁朝伟',27,'123040192'),
	('陈小春',39,'123874231');	
SELECT * FROM teacher;
SELECT * FROM teacher WHERE num>5;

CREATE TABLE newteacher LIKE teacher;
INSERT INTO newteacher SELECT * FROM teacher WHERE num>3;
SELECT * FROM newteacher;
SHOW TABLES;
SHOW DATABASES;
SELECT * FROM emplloy;
DROP TABLE class;
DROP DATABASE choose;