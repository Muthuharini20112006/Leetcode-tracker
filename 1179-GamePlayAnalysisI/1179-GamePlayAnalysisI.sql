-- Last updated: 8/10/2026, 3:51:47 PM
# Write your MySQL query statement below
SELECT player_id,
       MIN(event_date) AS first_login
FROM Activity
GROUP BY player_id;