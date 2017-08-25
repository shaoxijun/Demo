-- 创建数据库
CREATE DATABASE choose;
USE choose;

-- -----------------------------------------------------
-- 建表格
-- 1. 班级表
DROP TABLE class;
CREATE TABLE class(
	class_no INT PRIMARY KEY,
	class_name VARCHAR(10) UNIQUE,
	deaprtment_name VARCHAR(10));
-- 2. 学生表
DROP TABLE student;
CREATE TABLE student(
	student_no INT PRIMARY KEY,
	student_name VARCHAR(10) NOT NULL,
	student_contact VARCHAR(50), 
	class_no INT,
	-- 外键约束
	CONSTRAINT student_class_fk FOREIGN KEY(class_no) REFERENCES class(class_no));
-- 3. 老师表
DROP TABLE teacher;
CREATE TABLE teacher(
	teacher_no INT PRIMARY KEY,
	teacher_name VARCHAR(10) NOT NULL,
	teacher_contact VARCHAR(50));
-- 4. 课程表
DROP TABLE course;
CREATE TABLE course(
	course_no INT PRIMARY KEY,
	coruse_name VARCHAR(10) NOT NULL,
	up_limit INT DEFAULT 60,
	description VARCHAR(100),
	STATUS VARCHAR(3) DEFAULT '未审核',
	teacher_no INT,
	-- 外键约束
	CONSTRAINT course_teacher_fk FOREIGN KEY(teacher_no) REFERENCES teacher(teacher_no));

-- 5. 选课信息表
DROP TABLE choose;
CREATE TABLE choose(
	choose_no INT PRIMARY KEY AUTO_INCREMENT,
	student_no INT NOT NULL,
	course_no INT NOT NULL,
	score TINYINT UNSIGNED,
	choose_time DATETIME,
	
	-- 外键约束
	CONSTRAINT choose_student_fk FOREIGN KEY(student_no) REFERENCES student(student_no),
	CONSTRAINT choose_course_fk FOREIGN KEY(course_no) REFERENCES course(course_no)
	);

-- ------------------------------------------------------------------
-- 增加数据
-- 1. 班级数据
INSERT INTO class VALUES(001,'2012自动化1班','机电工程');
INSERT INTO class VALUES(002,'2012自动化2班','机电工程');
INSERT INTO class VALUES(003,'2012自动化3班','机电工程');
INSERT INTO class VALUES(004,'2012自动化4班','机电工程');
SELECT * FROM class;

-- 2. 学生数据
INSERT INTO student VALUES(2012001,'张三','12323213123',001);
INSERT INTO student VALUES(2012002,'李四','1232s234233',002);
INSERT INTO student VALUES(2012003,'王五','12323423123',003);
INSERT INTO student VALUES(2012004,'赵六','12323213123',001);
INSERT INTO student VALUES
(2012005,'曹操','123123123213',3),
(2012006,'曹值','123123123213',3),
(2012007,'曹冲','123123123213',3),
(2012008,'刘禅','123123123213',3);

SELECT * FROM student;

-- 3. 教师数据
INSERT INTO teacher VALUES(1,'张老师','110000000');
INSERT INTO teacher VALUES(2,'李老师','110000000');
INSERT INTO teacher VALUES(3,'王老师','110000000');

SELECT * FROM teacher;

-- 4. 课程数据
INSERT INTO course VALUES (1,'Java语言设计',DEFAULT,'暂无','已审核',1);
INSERT INTO course VALUES (2,'C语言设计',150,'暂无','已审核',2);
INSERT INTO course VALUES (3,'Python语言设计',230,'暂无','已审核',3);

SELECT * FROM course;
-- 5. 选课信息
INSERT INTO choose VALUES
(NULL,2012001,1,40,NOW()),
(NULL,2012001,2,90,NOW()),
(NULL,2012002,3,70,NOW()),
(NULL,2012002,1,60,NOW()),
(NULL,2012003,1,50,NOW()),
(NULL,2012004,2,30,NOW()),
(NULL,2012005,1,90,NOW()),
(NULL,2012005,3,NULL,NOW()),
(NULL,2012007,1,NULL,NOW());

SELECT * FROM choose;

-- --------------------------------------------------------------------------

-- 

SELECT teacher_no,teacher_name,NOW() FROM teacher;

SELECT * FROM choose;

SELECT course.coruse_name,teacher.teacher_name FROM course,teacher WHERE course.teacher_no = teacher.teacher_no;

SELECT choose_no 编号,student_no 学生信息,course_no 课程信息 FROM choose;


-- 方式一
SELECT student.student_name 学生姓名,course.coruse_name 课程名称,choose.score 课程得分 FROM choose,course,teacher,class,student
							WHERE   choose.student_no = student.student_no AND
								choose.course_no = course.course_no AND
								course.teacher_no = teacher.teacher_no AND
								student.class_no = class.class_no;
-- 方式二
SELECT student.student_name 学生姓名,course.coruse_name 课程名称,choose.score 课程得分 
FROM choose JOIN course JOIN teacher JOIN student JOIN class ON choose.student_no = student.student_no
						  AND choose.course_no = course.course_no 
						  AND course.teacher_no = teacher.teacher_no
						  AND student.class_no = class.class_no;




