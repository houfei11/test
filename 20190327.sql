SELECT id,NAME,genger FROM student

CONCAT()-- 函數，用來連接字符串

SELECT CONCAT(NAME,genger) FROM student

SELECT CONCAT(CONCAT(NAME,','),genger) FROM student

SELECT NAME||','||genger FROM student

LENGTH()-- 函數

SELECT NAME, LENGTH(NAME) FROM student

UPPER/LOWER/InITCAP/  -- 全大寫，全小寫，首字符大寫

SELECT * FROM student

INSERT INTO student(id,NAME,genger,class,birth) VALUES (2,"helloword","女",'4版','2019-03-17')

SELECT UPPER('helloword') FROM student

SELECT LOWER('HELLOWORD') FROM student

SELECT INITCAP('helloword') FROM student

SELECT TRIM('e' FROM 'eeeliteeee') FROM student

SELECT LTRIM('eeeeliteeeee','e') FROM student

SELECT RTRIM('eeeeliteeeed','e') FROM student

LPAD , RPAD -- 不位函數

SELECT LPAD(NAME,2,'$') FROM student











