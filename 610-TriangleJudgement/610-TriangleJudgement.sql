-- Last updated: 9/14/2026, 1:21:38 PM
# Write your MySQL query statement below
SELECT
    x,
    y,
    z,
    CASE
        WHEN x + y > z
         AND x + z > y
         AND y + z > x
        THEN 'Yes'
        ELSE 'No'
    END AS triangle
FROM Triangle;