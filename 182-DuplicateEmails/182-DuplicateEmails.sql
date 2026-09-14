-- Last updated: 9/14/2026, 1:25:23 PM
# Write your MySQL query statement below
SELECT Email
FROM Person
GROUP BY Email
HAVING COUNT(Email) > 1;