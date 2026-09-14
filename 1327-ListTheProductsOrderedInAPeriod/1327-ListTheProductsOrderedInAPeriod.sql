-- Last updated: 9/14/2026, 1:18:28 PM
# Write your MySQL query statement below
SELECT
    p.product_name,
    SUM(o.unit) AS unit
FROM Orders o
JOIN Products p
ON o.product_id = p.product_id
WHERE YEAR(o.order_date) = 2020
AND MONTH(o.order_date) = 2
GROUP BY p.product_name
HAVING SUM(o.unit) >= 100;