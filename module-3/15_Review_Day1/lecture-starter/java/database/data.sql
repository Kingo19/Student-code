BEGIN TRANSACTION;

INSERT INTO users (username,password_hash,role) VALUES ('user','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_USER');
INSERT INTO users (username,password_hash,role) VALUES ('admin','$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC','ROLE_ADMIN');


--populate team table
INSERT INTO teams (name) VALUES ('Jolly Green Java Giants');

--populate players table
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Derek', 'Jeter', 2, 220000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Mariano', 'Rivera', 42, 150000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Alex', 'Rodriguez', 13, 250000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Babe', 'Ruth', 3, 10000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Lou', 'Gehrig', 4, 800000.00, 1);

--populate positions
INSERT INTO positions (positionName) VALUES ('Pitcher');
INSERT INTO positions (positionName) VALUES ('Catcher');
INSERT INTO positions (positionName) VALUES ('First Baseman');
INSERT INTO positions (positionName) VALUES ('Second Baseman');
INSERT INTO positions (positionName) VALUES ('Shortstop');
INSERT INTO positions (positionName) VALUES ('Third Baseman');
INSERT INTO positions (positionName) VALUES ('Outfielder');
INSERT INTO positions (positionName) VALUES ('Designated Hitter');
INSERT INTO positions (positionName) VALUES ('Relief Pitcher');


-- Link player 1 to position 1 (Pitcher)
INSERT INTO player_position (player_id, position_id) VALUES (1, 1);

-- Link player 2 to position 2 (Catcher)
INSERT INTO player_position (player_id, position_id) VALUES (2, 2);

-- Link player 3 to position 3 (First Baseman)
INSERT INTO player_position (player_id, position_id) VALUES (3, 3);

-- Link player 4 to position 4 (Second Baseman)
INSERT INTO player_position (player_id, position_id) VALUES (4, 4);

-- Link player 5 to position 5 (Shortstop)
INSERT INTO player_position (player_id, position_id) VALUES (5, 5);


COMMIT TRANSACTION;
