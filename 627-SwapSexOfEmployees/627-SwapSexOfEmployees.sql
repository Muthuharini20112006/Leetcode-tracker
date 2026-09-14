-- Last updated: 9/14/2026, 1:21:25 PM
# Write your MySQL query statement below
UPDATE Salary
SET sex = CASE
            WHEN sex = 'm' THEN 'f'
            ELSE 'm'
          END;