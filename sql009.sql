SELECT * FROM employeeadd

SELECT * FROM (SELECT Dname, t.* FROM (SELECT * FROM employeeadd ORDER BY Salary DESCSELECT * FROM 
      employeeadd ORDER BY Salary DESC) AS t) WHERE Dname BETWEEN 6 AND 10

SELECT Ename, Salary, Dname, DECODE(Ename, 
                                    '沙赞',Salary*10, 
                                    '绿巨人', Salary*10, 
                                    '黑寡妇', Salary*2, Salary) dd FROM employeeadd
SELECT Ename, Salary, Dname, CASE Ename 
WHEN '沙赞' THEN Salary*10 
WHEN '绿巨人' THEN Salary*10 
WHEN '黑寡妇' THEN Salary*2 ELSE Salary END FROM employeeadd

SELECT Ename, Dname, Salary FROM employeeadd ORDER BY DECODE(Ename,"红眼",1, "绿巨人",2,"毒液",3)

SELECT Ename, Dname, Salary, 
ROW_NUMBER() OVER(
	PARTITION BY Dname
	ORDER BY Salary DESC
)
FROM employeeadd 

SELECT Ename, Dname, Salary,
ROW_COUNT(
)
FROM employeeadd