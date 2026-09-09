# Write your MySQL query statement below
SELECT p.project_id,ROUND(AVG(e.experience_years),2) as average_years From Project p INNER JOIN Employee e on p.employee_id=e.employee_id Group By project_id;