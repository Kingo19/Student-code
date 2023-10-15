-- 11. Hollywood is remaking the classic movie "The Blob" and doesn't have a director yet. Add yourself to the person
--     table, and assign yourself as the director of "The Blob" (the movie is already in the movie table). (1 record each)
INSERT INTO person (person_name)
VALUES ('Your Name');
SELECT person_id FROM person WHERE person_name = 'Your Name';
INSERT INTO movie_actor (movie_id, actor_id)
VALUES ((SELECT movie_id FROM movie WHERE title = 'The Blob'), 1);

