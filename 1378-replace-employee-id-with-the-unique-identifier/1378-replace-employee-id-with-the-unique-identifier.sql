# Write your MySQL query statement below
select unique_id , name 
from employees e
left join employeeUNI em
ON e.id = em.id

