-- Last updated: 9/14/2026, 1:19:22 PM
# Write your MySQL query statement below
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;