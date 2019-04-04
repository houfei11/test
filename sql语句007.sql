SELECT * FROM personal

SELECT COUNT(*) FROM personal

SELECT stuName, stuAge FROM personal ORDER BY stuTime

SELECT AVG(stuAge), stuAge FROM personal ORDER BY stuAge

SELECT MAX(stuAge), stuName FROM personal GROUP BY stuId

SELECT AVG(stuAge), stuName FROM personal GROUP BY stuId HAVING AVG(stuAge) > 20

SELECT MAX(stuAge), MIN(stuAge), stuName FROM personal GROUP BY stuId HAVING AVG(stuAge) > 1

