-- 12. The titles of the movies in the "Star Wars Collection" that weren't directed by George Lucas, sorted alphabetically.
-- (5 rows)
SELECT movie.title
FROM movie
JOIN collection ON movie.collection_id = collection.collection_id
JOIN movie_actor ON movie.movie_id = movie_actor.movie_id
JOIN person ON movie_actor.actor_id = person.person_id
WHERE collection.collection_name = 'Star Wars Collection'
AND person.person_name <> 'George Lucas'
ORDER BY movie.title ASC;


