-- Last updated: 9/14/2026, 1:25:03 PM
# Write your MySQL query statement below
DELETE p1
FROM Person p1
JOIN Person p2
ON p1.Email = p2.Email
AND p1.Id > p2.Id;