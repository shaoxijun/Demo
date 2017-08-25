-- departments 部门表
-- dept_emp  部门员工表
-- dept_manager 部门主管表
-- employees 雇员表
-- salaries 薪水表
-- titile 职称表

-- * 查询统school计公司员工数量、男员工数量、女员工数量
SELECT COUNT(*) 员工数量 FROM employees;
SELECT COUNT(*) 男员工数量 FROM employees e WHERE e.gender LIKE 'M';
SELECT COUNT(*) 女员工数量 FROM employees e WHERE e.gender LIKE 'F';

-- * 查询员工最新薪水 (分页，第一页，每页50行)
SELECT * FROM salaries LIMIT 50;
-- * 查询部门列表需显示当前主管名字
SELECT de.dept_name,em.first_name
FROM departments de,dept_manager dm,dept_emp dp,employees em
WHERE em.emp_no = dp.emp_no
AND dp.dept_no = dm.dept_no;
AND 
-- * 查询 Lillian Haddadi的详细信息，及薪水调薪记录 以及担任某部门主管的详细信息
-- * 查询 Shahaf Famili的详细信息，及薪水调薪记录 以及担任某部门主管的详细信息



