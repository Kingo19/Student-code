
START TRANSACTION;

DROP TABLE IF EXISTS teams, players, positions, player_position CASCADE;

CREATE TABLE teams
(
   team_id serial,
   name varchar(25) NOT NULL,

   constraint pk_team_id primary key (team_id)
);

CREATE TABLE players
(
  player_id serial,
  firstName varchar(25) NOT NULL,
  lastName varchar(25) NOT NULL,
  jerseyNumber int NOT NULL,
  salary NUMERIC(12,2) NOT NULL,
  team_id int, 	
  
  constraint pk_player_id primary key (player_id),
  constraint fk_team_id foreign key (team_id) references teams (team_id)
 	
);

CREATE TABLE positions 
(
  position_id serial,
  positionName VARCHAR(25),

  constraint pk_position_id primary key (position_id) 
);

CREATE TABLE player_position
(
	player_id int,
    position_id int, 
	
    constraint pk_player_id_position_id primary key (player_id, position_id),
	constraint fk_player_id foreign key (player_id) references players (player_id),
    constraint fk_position_id foreign key (position_id) references positions (position_id)
);

-- CREATE INSERTS TO POPULATE WITH ANY STARTING DATA

--populate team table
INSERT INTO teams (name) VALUES ('Jolly Green Java Giants');

--populate players table
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Derek', 'Jeter', 2, 22000000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Mariano', 'Rivera', 42, 15000000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Alex', 'Rodriguez', 13, 25000000.00, 1);
INSERT INTO players (firstName, lastName, jerseyNumber, salary, team_id) VALUES ('Babe', 'Ruth', 3, 1000000.00, 1);
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

COMMIT;


