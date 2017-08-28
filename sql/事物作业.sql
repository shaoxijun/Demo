-- 练习:
-- 给选课系统添加调课的存储过程
-- 如原先 2012001 选修了课程1 需要换到课程3
-- 这时候需要在choose表中删除课程1的记录增加课程3的记录
-- 但如果课程3的可报人数avaliable=0的时候，该学生就没法选修了。
-- 另外选修成功后 课程1 availiable +1 课程3 availiable -1
DROP PROCEDURE change_lesson_pro;
DELIMITER $$
CREATE PROCEDURE change_lesson_pro (IN stu_no INT,IN cor_no INT)
BEGIN
   START TRANSACTION;
	IF cor_no = (SELECT course.course_no 
			FROM course,student,choose 
			WHERE student.student_no=choose.student_no 
			AND course.course_no=choose.course_no
			AND student.student_no = stu_no
			AND course.course_no = 1) OR get_left_fu(cor_no) <= 0 THEN
	ROLLBACK;
	END IF;
	
	IF cor_no != (SELECT course.course_no 
			FROM course,student,choose 
			WHERE student.student_no=choose.student_no 
			AND course.course_no=choose.course_no
			AND student.student_no = stu_no
			AND course.course_no = 1) AND get_left_fu(cor_no)>0 THEN
	UPDATE choose SET choose.course_no = cor_no WHERE choose.student_no = stu_no;
	END IF;
	COMMIT;
END
$$
DELIMITER ;
	
CALL change_lesson_pro(2012001,1);

(SELECT course.course_no 
			FROM course,student,choose 
			WHERE student.student_no=choose.student_no 
			AND course.course_no=choose.course_no
			AND student.student_no = stu_no
			AND course.course_no = 1)

-- 求还剩多少人可选应该是搞个函数
DROP FUNCTION get_left_fu;
DELIMITER $$
CREATE FUNCTION get_left_fu(c_no INT) RETURNS INT
BEGIN
	DECLARE c INT DEFAULT 0;
	DECLARE d INT DEFAULT 0;
	SELECT COUNT(*) INTO c FROM student st,course co,choose ch
	WHERE ch.student_no = st.student_no AND ch.course_no = c_no AND ch.course_no = co.course_no;
	
	SELECT course.up_limit INTO d FROM course 
	WHERE course.course_no = c_no;
	
	RETURN  d - c;
	
END
$$
DELIMITER ;

SELECT get_left_fu(1) 还剩多少可选人数;




-- 统计课程有多少人选修
-- 课程名 人数
SELECT co.coruse_name,COUNT(*)
FROM student st,course co,choose ch
WHERE ch.student_no = st.student_no AND co.course_no = ch.course_no
GROUP BY co.coruse_name;

CREATE VIEW course_count_view
AS
SELECT co.coruse_name 课程名,COUNT(*) 选修人数
FROM student st,course co,choose ch
WHERE ch.student_no = st.student_no AND co.course_no = ch.course_no
GROUP BY co.coruse_name;

SELECT * FROM course_count_view;
-- 创建一个视图包含   名字 所选课程名字 老师名字 
SELECT st.student_name,co.coruse_name,co.course_no,te.teacher_name 
FROM student st,course co,teacher te,choose ch
WHERE st.student_no = ch.student_no AND co.course_no = ch.course_no AND co.teacher_no = te.teacher_no;

DROP VIEW student_course_teacher_view;
CREATE VIEW student_course_teacher_view
AS
SELECT st.student_name,co.coruse_name,co.course_no,te.teacher_name 
FROM student st,course co,teacher te,choose ch
WHERE st.student_no = ch.student_no AND co.course_no = ch.course_no AND co.teacher_no = te.teacher_no;

SELECT * FROM student_course_teacher_view;
