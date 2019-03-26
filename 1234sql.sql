SELECT SYSDATE FROM mysql;

-- SQL語句
CREATE TABLE student (id INT(4),NAME VARCHAR(20),gender VARCHAR(1),birth DATE)

ALTER TABLE student ADD (hiredate DATE )

DESC student

ALTER TABLE student 
DROP (hiredate)

DESC student

ALTER TABLE student MODIFY(derr(40))

INSERT INTO student (id,NAME,age,derr,hiredate) VALUE (1,'houfei',27,'wangjiahe','2019-08-19')

SELECT * FROM student
-- 删除表
DROP TABLE db
CREATE TABLE db(id number(4),NAME VARCHAR(20),gender CHAR(1) DEFAULT 'M',birth DATE)

CREATE TABLE teacher(id INT(4),NAME VARCHAR(20) NOT NULL,gender CHAR(1),birth DATE)

DESC teacher

-- 修改表名
RENAME db TO teacher

DESC db

ALTER TABLE teacher MODIFY(NAME VARCHAR(225) DEFAULT 'cherk')

COMMIT

INSERT INTO teacher(id,NAME,gender,birth) VALUES(1003,'houfei','men',to_date('1991-12-28','YY-MM-DD'))

UPDATE teacher SET NAME = 'wujing' WHERE id = 1

UPDATE teacher SET NAME = 'zhangjie',gender = 'wmen' WHERE id = 1

DELETE FROM teacher WHERE NAME = 'wujing'







