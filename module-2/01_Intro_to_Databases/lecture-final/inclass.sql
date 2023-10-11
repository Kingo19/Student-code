-- SELECT * FROM city;
select * from city;


SELECT city_name, state_abbreviation FROM city;

-- TAKE 2+2 add them, THEN put in a fictitious column called SUM
--SELECT 2 + 2 AS SUM;

--Select city_name AS city_nm FROM city 

-- AS is defining an alias
--SELECT city_name, state_abbreviation AS abbreviation FROM city;

SELECT city_name, area, state_abbreviation, population, city_id FROM city;

SELECT city_name, area, state_abbreviation, population, city_id 
FROM city
WHERE area < 25

SELECT city_name, area, state_abbreviation, population, city_id 
FROM city
WHERE area < 25 AND state_abbreviation = 'CA';


SELECT * FROM state;

SELECT state_name, census_region 
FROM state
WHERE census_region IS NULL;

SELECT state_name, census_region 
FROM state
WHERE census_region IS NOT NULL;

SELECT state_name, census_region 
FROM state
WHERE census_region <> 'Midwest' OR census_region IS NULL

SELECT * FROM city;

SELECT city_name, population, area, state_abbreviation
FROM city
WHERE state_abbreviation = 'CA' OR state_abbreviation = 'FL';

SELECT city_name, population, area, state_abbreviation
FROM city
WHERE state_abbreviation IN ('CA', 'FL', 'OH')

-- SELECT statements involving math
-- Write a query to retrieve the names and areas of all parks in square METERS
-- (the values in the database are stored in square kilometers)
-- Label the second column "area_in_square_meters"



SELECT * FROM park;

SELECT park_name, area, (area * 2) AS area_in_square_meters
FROM park;

SELECT count(*) FROM city;

SELECT DISTINCT city_name 
FROM city 
ORDER BY city_name;   --ASCENDING ORDER IS DEFAULT

SELECT DISTINCT city_name 
FROM city 
ORDER BY city_name DESC;   --DECENDING ORDER IS DEFAULT


-- Give me a list of all cities that end with  "Falls"
SELECT city_name
FROM city
WHERE city_name LIKE '% Falls';

SELECT city_name
FROM city
WHERE city_name LIKE '% %';

SELECT city_name
FROM city
WHERE city_name ILIKE 'AT%';


select count(*) from park;

SELECT park_name, area
FROM park
WHERE area >= 50 and area <=100;



SELECT park_name, area
FROM park
WHERE area BETWEEN 50 and 100;

-- Write a query to retrieve the names and dates established of parks established before 1900


SELECT park_name, date_established
FROM park
WHERE date_established IS NOT NULL







