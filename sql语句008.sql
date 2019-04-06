SELECT emp.Ename, dd.Dname FROM employee AS emp 
LEFT JOIN Dep AS dd ON dd.Department = emp.Department

SELECT employee.Ename, Dep.Dname FROM employee, Dep WHERE
Dep.Department = employee.Department

SELECT emp.Ename, dd.Dname FROM employee AS emp, Dep AS dd WHERE
dd.Department = emp.Department AND dd.location = "克顿星球"

SELECT emp.Ename, emp.Salary, dd.Dname, dd.Location FROM
employee AS emp, Dep AS dd WHERE dd.Department = emp.Department AND emp.Salary > 3000

SELECT emp.Ename, emp.Salary, dd.Dname, dd.Location FROM 
employee AS emp JOIN Dep AS dd ON dd.Department = emp.Department WHERE emp.Salary > 3000

INSERT INTO employee VALUES("绿灯侠", 2000, NULL)
INSERT INTO Dep VALUES(50, NULL, NULL)

SELECT emp.Ename, emp.Salary, dd.Dname FROM employee AS emp LEFT OUTER JOIN Dep AS dd ON emp.Department = dd.Department

SELECT emp.Ename, dd.Dname FROM employee AS emp RIGHT OUTER JOIN Dep AS dd ON emp.Department = dd.Department

SELECT emp.Ename, dd.Dname FROM employee AS emp FULL OUTER JOIN Dep AS dd ON emp.Department = dd.Department

SELECT emp.Ename, emp.Salary, dd.Dname, dd.Location FROM 
employee AS emp JOIN Dep AS dd ON dd.Department = emp.Department WHERE emp.Salary > 3000

SELECT * FROM employee

SELECT emp.Ename, ee.Ename FROM employee AS emp JOIN employee AS ee ON emp.Department = ee.number WHERE emp.Ename = "绿巨人"

SELECT Ename, Salary FROM employee WHERE Salary > (SELECT Salary FROM employee WHERE Ename = "鹰眼") 

SELECT emp.Ename, dd.Dname FROM employee AS emp JOIN Dep AS dd ON emp.Department = dd.Department WHERE dd.Dname = 
(SELECT dd.Dname FROM employee AS emp JOIN Dep AS dd ON dd.Department = emp.Department WHERE emp.Ename = "美国队长") 

SELECT emp.Ename, emp.Salary, emp.Department, emp.number, dd.Department, dd.Dname, dd.Location FROM 
employee AS emp JOIN Dep AS dd ON emp.Department = dd.Department

CREATE TABLE employeeAdd AS 
(SELECT emp.Ename, emp.Salary, emp.Department, emp.number, dd.Dname, dd.Location FROM 
employee AS emp JOIN Dep AS dd ON emp.Department = dd.Department)

SELECT * FROM employeeAdd

SELECT Dname FROM employeeAdd WHERE Ename = '蝙蝠侠'

DELETE FROM employeeAdd WHERE Dname = (SELECT Dname FROM employeeAdd WHERE Ename = "蝙蝠侠")

DELETE FROM employeeAdd WHERE Dname = 'DC部'

SELECT Ename, Salary FROM employee WHERE Salary > (SELECT AVG(Salary) FROM employee)

SELECT Ename, Dname FROM employeeAdd WHERE Ename IN (SELECT Ename FROM employeeAdd WHERE Dname = '复仇者联盟部')

SELECT Ename, Salary FROM employeeAdd WHERE EXISTS (SELECT Dname FROM employeeAdd WHERE Dname = '毒液家族')

SELECT AVG(Salary),Dname FROM employeeAdd GROUP BY Dname

