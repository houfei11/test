SELECT stuName, school AS SSS FROM personal WHERE stuId = 3

SELECT school, stuAge FROM personal WHERE stuName = '张恩阳'

select * FROM personal

SELECT stuName FROM personal WHERE stuAge < 20

SELECT stuName FROM personal WHERE stuAge <> 22

SELECT stuName FROM personal WHERE stuAge > 22

SELECT * FROM personal WHERE stuAge < 20 OR stuId > 10

SELECT stuName FROM personal WHERE stuName LIKE '%n%'

SELECT stuName FROM personal WHERE stuName LIKE 'k%g'

-- IN 和 NOT IN
select * FROM student where id IN (2,3)

SELECT * FROM personal WHERE stuAge NOT IN (22)

SELECT * FROM personal WHERE stuAge BETWEEN 20 AND 30

SELECT * FROM student WHERE genger IS NULL

SELECT NAME, genger FROM student WHERE genger IS NOT NULL

SELECT * FROM personal WHERE stuAge > any(SELECT stuAge FROM personal WHERE stuAge = 22)

SELECT DISTINCT stuName, stuAge FROM personal

SELECT stuName, stuAge, stuTime FROM personal ORDER BY stuTime DESC,stuAge DESC

