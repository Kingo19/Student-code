-- ORDERING RESULTS

-- Populations of all states from largest to smallest.
SELECT * FROM state;

SELECT state_name, population 
FROM state
ORDER BY population DESC;

-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
FROM state
WHERE census_region IS NOT NULL
ORDER BY census_region DESC, state_name ASC;


SELECT * FROM park;
-- The biggest park by area
SELECT park_name, area
FROM park
ORDER BY area DESC
LIMIT 1;



-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT * FROM city;

SELECT city_name, population
FROM city
ORDER BY population DESC
LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.

SELECT * FROM park;
SELECT(CURRENT_DATE - date_established) / 365 AS age, park_name
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;


SELECT park_name, date_part('year', date_established) AS year_part FROM park;
SELECT date_part('month', CURRENT_DATE) AS month_part
SELECT date_part('day', CURRENT_DATE) AS day_part

SELECT (date_part('year', CURRENT_DATE) - date_part('year', date_established)) AS age, park_name
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;

SELECT (EXTRACT(year FROM CURRENT_DATE) - EXTRACT(year FROM date_established)) AS age, park_name
FROM park;


SELECT CURRENT_DATE - 30
--SELECT (date_part('day', CURRENT_DATE) - date_part('day', date_established)) as num_days

-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
select * FROM city;

SELECT (city_name || ', '  || state_abbreviation)
FROM city;



-- The all parks by name and date established.
SELECT * FROM park;

SELECT (park_name || '  ('  || date_established || ')')
FROM park;

-- The census region and state name of all states in the West & Midwest sorted in ascending order.
select * from state;

SELECT (census_region || '  ('  || state_name || ')') AS region_and_state
FROM state
-- WHERE census_region = 'West' OR census_region = 'Midwest'
-- WHERE census_region IN ('West', 'Midwest')
WHERE census_region ILIKE '%West'
ORDER BY region_and_state

-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT avg(population) AS avg_state_population
FROM state;

-- Total population in the West and South census regions
SELECT sum(population) AS sum_population
FROM state
WHERE census_region IN ('West', 'South')

-- The number of cities with populations greater than 1 million
SELECT count(population) AS big_cities_count
FROM city
WHERE population > 1000000;

-- The number of state nicknames.
SELECT count(state_nickname) AS nickname_count
FROM state

SELECT count(*) AS nickname_count
FROM state

-- The area of the smallest and largest parks.
select * from park;

SELECT min(area) AS smallest_park_size, max(area) AS largest_park_size
FROM park;


-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.

select * from city;

SELECT count(city_name) AS city_count, state_abbreviation
FROM city
-- WHERE population > 100000
GROUP BY state_abbreviation
ORDER BY city_count DESC;

-- Determine the average park area depending upon whether parks allow camping or not.
select * from park;

SELECT has_camping, avg(area) AS average_area
FROM park
GROUP BY has_camping

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, sum(population) as sum_city_population
FROM city
GROUP BY state_abbreviation
--ORDER BY state_abbreviation
ORDER BY sum_city_population
LIMIT 10

-- The smallest city population in each state ordered by city population.

-- see above

-- Miscelleneous

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)

SELECT city_name, population
FROM city
ORDER BY city_name
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;

SELECT city_name, population
FROM city
ORDER BY city_name
OFFSET 100 ROWS FETCH NEXT 10 ROWS ONLY;

-- SUBQUERIES (optional)


-- List the capital cities for the states in the Northeast census region.
select * from city
select * from state

select s.state_name, 
 (SELECT c.city_name from city as c where c.city_id = s.capital)
from state AS s
where s.census_region = 'Northeast'

select state.state_name, 
 (SELECT city.city_name from city where city.city_id = state.capital)
from state
where state.census_region = 'Northeast'

