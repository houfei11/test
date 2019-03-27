-- 补位函数
SELECT LPAD(genger,5,'*') FROM student

-- SUBSTR 截取字符串
SELECT SUBSTR ('think in java',13,4) FROM student

SELECT SUBSTR ('think in javva',10) FROM student

SELECT INSTR ('think in java', 'in',4,2) FROM DUAL

-- round() 数字函数

SELECT ROUND (45.88,2) FROM DUAL

SELECT ROUND (45.123,0) FROM DUAL

SELECT ROUND (55.678,-1) FROM DUAL

-- TRunc() 截取数字
SELECT TRUNCATE (45.36985,2) FROM DUAL

-- mod(m,n)求余数
SELECT id, genger, MOD (genger,1000) FROM student

-- ceil,floor() 向上向下取整
SELECT CEIL (85.789) FROM DUAL

SELECT FLOOR (85.789) FROM DUAL

SELECT NAME, genger, deptno FROM student WHERE NAME = UPPER('scott')

SELECT NAME, sal, genger FROM teacher WHERE SUBSTR (NAME,3,1) = 'A'

-- sysDate,SYSTIMESTAMP
SELECT SYSDATE FROM DUAL

SELECT SYSTIMESTAMP FROM DUAL

-- to_date 函数
SELECT to_DATE ('2019-03-27 20:02:08', 'YYYY"年"MM"月"DD"日" HH24:MI:ss') FROM DUAL

SELECT NAME, SYSDATE-hiredate FROM emp

SELECT SYSDATE - to_date('1992-08-02','YYYY-MM-DD') FROM DUAL

SELECT to_char(SYSDATE,'YYYY-MM-DD HH24:MI:SS') FROM DUAL







































