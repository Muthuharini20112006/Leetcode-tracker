-- Last updated: 9/14/2026, 1:21:53 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2 OR referee_id IS NULL;
