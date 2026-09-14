-- Last updated: 9/14/2026, 1:25:35 PM
# Write your MySQL query statement below
select MAX(Salary) as SecondHighestSalary
from Employee
where salary<(
    select MAX(Salary)
    from Employee
)