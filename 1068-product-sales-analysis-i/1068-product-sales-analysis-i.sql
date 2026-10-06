# Write your MySQL query statement below
SELECT p.product_name, s.price, s.year
FROM  Sales as s
JOIN Product as p
ON s.product_id = p.product_id;


-- SELECT product_name, year, price
-- FROM Sales
-- JOIN Product USING(product_id);
