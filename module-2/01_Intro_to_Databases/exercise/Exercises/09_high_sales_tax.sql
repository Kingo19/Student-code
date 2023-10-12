-- 9. The name, abbreviation, population, and sales tax of all states and territories with a sales tax greater than 6.6% (9 rows)
SELECT state_abbreviation, state_name, population, sales_tax FROM state
WHERE sales_tax > 6.6;