-- Last updated: 8/10/2026, 3:51:56 PM
# Write your MySQL query statement below
SELECT product_id,
       year AS first_year,
       quantity,
       price
FROM Sales
WHERE (product_id, year) IN (
    SELECT product_id, MIN(year)
    FROM Sales
    GROUP BY product_id
);