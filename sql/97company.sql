-- 创建部门表
CREATE TABLE department(
	id INT PRIMARY KEY AUTO_INCREMENT,
	NAME VARCHAR(30) NOT NULL
);
-- 添加部门
INSERT INTO department(NAME) VALUES('销售部'),('工程部'),('人事部');

-- 创建员工表
DROP TABLE emplloy;
CREATE TABLE emplloy(
	id INT PRIMARY KEY,
	NAME VARCHAR(30),
	tel VARCHAR(11),
	department_id INT,
	CONSTRAINT emplloy_department FOREIGN KEY (department_id) REFERENCES department(id)
);
INSERT INTO emplloy VALUES
	(1001,'乔布斯','13919948379',1),
	(1002,'盖茨','13919948379',2),
	(1003,'克林顿','13919948379',3),
	(1004,'乔峰','13919948379',2),
	(1005,'段誉','13919948379',3),
	(1006,'段王爷','13919948379',2);
	
ALTER TABLE emplloy ADD COLUMN salary INT;
UPDATE emplloy SET salary = 10000;
UPDATE emplloy SET salary = 15000 WHERE id = 1001;

SELECT * FROM emplloy;
SELECT * FROM emplloy WHERE id = 1002;

-- 10. 查询显示所有员工及所属部门信息 （内连接）
SELECT * FROM emplloy,department WHERE emplloy.department_id = department.id;
SELECT * FROM emplloy JOIN department ON emplloy.department_id = department.id;
-- 11. 添加一个新员工，还没确定进入那个部门。
INSERT INTO emplloy(id,NAME,tel) VALUES(1007,'刘德华','1346647895');
--    使用左外连接显示所有员工信息及部门信息
SELECT * FROM emplloy LEFT JOIN department ON emplloy.department_id = department.id;
-- 12. 添加一个新部门,还没有员工加入这个部门
INSERT INTO department(NAME) VALUES('吹牛部');
--    使用右外连接显示所有员工及部门信息
SELECT * FROM emplloy RIGHT JOIN department ON emplloy.department_id = department.id;

SELECT emplloy.NAME 姓名,department.name 部门 FROM emplloy JOIN department ON emplloy.department_id = department.id;

