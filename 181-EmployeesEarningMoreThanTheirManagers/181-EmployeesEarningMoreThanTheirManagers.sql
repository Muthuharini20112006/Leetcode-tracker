-- Last updated: 9/14/2026, 1:25:30 PM
# Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e
JOIN Employee m
ON e.managerId = m.id
WHERE e.salary > m.salary;