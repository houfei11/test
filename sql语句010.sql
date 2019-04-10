-- 视图--
SELECT * FROM employeeadd

CREATE VIEW v_emp_20 AS
SELECT Ename, Salary, Department, number, Dname, Location FROM employeeadd 
WHERE Department = 20

SELECT * FROM v_emp_20

CREATE OR REPLACE VIEW v_emp_20 AS 
SELECT Ename id, Salary sal, Department d, number m, Dname dn, Location LL FROM employeeadd
WHERE Department = 20

DESC v_emp_20

INSERT INTO v_emp_20 (id, sal,d,m,dn,LL) VALUES ('蜘蛛侠',10230,20,10,'漫威','华盛顿')

DELETE FROM v_emp_20 WHERE id = '蜘蛛侠'

INSERT INTO v_emp_20 (id, sal,d,m,dn,LL) VALUES ('凯特琳',10230,10,10,'漫威','华盛顿')

UPDATE v_emp_20 SET d = 10

DELETE FROM v_emp_20 WHERE d = 20

CREATE VIEW v_emp_30 AS
SELECT Ename, Salary, Department, number, Dname, Location FROM employeeadd 
WHERE Department = 10
WITH CHECK OPTION

SELECT * FROM v_emp_30

INSERT INTO v_emp_30 (Ename, Salary, Department, number, Dname, Location) VALUES ('akali',10230,20,20,'xxx','xxx')

SELECT object_name FROM USER_objects WHERE object_type = 'view' AND object_name LIKE '%_fanchuanqi'

SELECT TEXT FROM user_view

CREATE VIEW v_dept_sal AS
SELECT Department, Dname, MIN(Salary) min_sal, MAX(Salary) max_sal, AVG(Salary) avg_sal, SUM(Salary) sum_sal FROM employeeadd GROUP BY Department, Dname

SELECT * FROM v_dept_sal

SELECT e.Ename, e.Salary, e.Department FROM employeeadd AS e, v_dept_sal AS v 
WHERE e.Department = v.Department AND e.Salary > v.avg_sal

DROP VIEW v_emp_20

CREATE SEQUENCE seq_emp_id START WITH 1 INCREMENT BY 1

SELECT seq_emp_id.NEXTVAL FROM DUAL





