USE choose;
-- 1. 显示课程列表，并显示课程由哪个老师教的。(course,teacher)
SELECT course.coruse_name,teacher.teacher_name FROM course JOIN teacher ON course.teacher_no = teacher.teacher_no;
-- 2. 查询学生选择了哪门课程及的得分 (choose student course)
-- 使用 and 连接2个条件
SELECT student.student_name,course.coruse_name,choose.score 
FROM student,choose,course
WHERE student.student_no = choose.student_no
AND course.course_no = choose.course_no;
-- 得到类似如下格式结果
-- 学生姓名	课程名字	课程得分
-- 张三		Java		40
-- 张三		C语言		50
-- 李四		Java		60


-- ------------------------------------------------------------------
USE school;
-- 练习:
-- 1. 添加一个性别字段 在名字后面
ALTER TABLE student ADD COLUMN sex ENUM('男','女');
-- 2. 将所有人设置为男性，然后再将其中部分学生设置为女性
UPDATE student SET sex = '男';
UPDATE student SET sex = '女' WHERE student.english > 70;
-- 3. 查询显示student表中男女人数
SELECT COUNT(*) 男  FROM student WHERE sex = '男';
SELECT COUNT(*) 女  FROM student WHERE sex = '女';
-- 4. 查询显示各科平均成绩
SELECT AVG(chinese) 语文,AVG(math) 数学,AVG(english) 英语 FROM student;

-- 5. 查询表中所有学生的信息。
SELECT * FROM student;
-- 6. 查询表中所有学生的姓名和对应的英语成绩。
SELECT student.student_name 姓名,student.english 英语成绩 FROM student;
-- 7. 查询表中学生的姓名和对应的英语成绩，去除英语成绩相同的数据行
SELECT student.student_name 姓名,student.english 英语成绩 FROM student
WHERE student.english NOT IN (SELECT student.english FROM student GROUP BY student.english HAVING COUNT(student.english) >1) ;
-- 8. 使用别名表示学生分数。
SELECT s.student_name 姓名,s.age 年龄,s.chinese 语文成绩,s.math 数学成绩,s.english 英语成绩 FROM student s;
-- 9. 查询所有姓名为杨的学生成绩
SELECT * FROM student s WHERE s.student_name LIKE '杨%';
-- 10.查询英语成绩大于等于90分的同学
SELECT * FROM student s WHERE s.english > 90;
-- 11 查询总分大于200分的所有同学
SELECT s.student_name 姓名,(s.chinese+s.math+s.english) 总分 FROM student s WHERE (s.chinese+s.math+s.english)>200;
-- 12 查询所有姓段的学生英语成绩。
SELECT s.student_name ,s.english FROM student s WHERE  s.student_name LIKE '段%' ;
-- 13 查询英语>80或者总分>200的同学
SELECT s.student_name,s.english,(s.chinese+s.math+s.english) 总分 FROM student s 
WHERE (s.chinese+s.math+s.english)>200 OR s.english>80;
-- 14 统计每个学生的总分。
SELECT s.student_name 姓名,(s.chinese+s.math+s.english) 总分 FROM student s;
-- 15 在所有学生总分数上加10分特长分。
SELECT s.student_name 姓名,(s.chinese+s.math+s.english)+10 总分 FROM student s;
-- ------------------------------------------------------------------
-- 查询练习:
USE choose;
-- 1. 给定一个学生如2012001,查询该生选修了几门课。（统计函数）
SELECT student.student_name 学生姓名,GROUP_CONCAT(course.coruse_name),COUNT(*) 总计 
FROM student,choose,course
WHERE student.student_no = choose.student_no
AND student.student_no = 2012001
AND choose.course_no = course.course_no;
-- 2. 统计每个学生选修多少课程,最高分、最低分、总分、平均成绩 (分组统计）
SELECT COUNT(ch.course_no) 选修门数,s.student_name 学生姓名,MAX(ch.score) 最高分,MIN(ch.score) 最低分,SUM(ch.score) 总计,AVG(ch.score) 平均分
FROM student s,choose ch,course co
WHERE s.student_no = ch.student_no
GROUP BY ch.choose_no HAVING BY COUNT(co.course_no)>1;
-- 搞不定

-- 3. 检索平均成绩高于70分 的 学生信息及平均成绩 (分组统计 及having条件)
SELECT AVG(ch.score),s.student_name 
FROM choose ch, student s
WHERE ch.student_no = s.student_no
GROUP BY s.student_no HAVING AVG(ch.score)>70;
