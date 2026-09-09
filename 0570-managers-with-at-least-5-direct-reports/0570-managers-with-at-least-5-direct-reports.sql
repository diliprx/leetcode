# Write your MySQL query statement below
Select name from Employee where id in(Select managerId from Employee Group by managerId Having Count(managerId)>=5);