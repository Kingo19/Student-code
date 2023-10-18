CREATE TABLE Member (
    MemberID INT PRIMARY KEY,
    LastName VARCHAR(50) NOT NULL,
    FirstName VARCHAR(50) NOT NULL,
    EmailAddress VARCHAR(100) NOT NULL UNIQUE,
    PhoneNumber VARCHAR(15),
    DateOfBirth DATE NOT NULL,
    ReminderEmailFlag BOOLEAN
);

CREATE TABLE InterestGroup (
    GroupID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL UNIQUE
);

CREATE TABLE Event (
    EventID INT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    Description TEXT,
    StartDateTime DATETIME NOT NULL,
    Duration INT CHECK (Duration >= 30),
    GroupID INT,
    FOREIGN KEY (GroupID) REFERENCES InterestGroup(GroupID)
);

CREATE TABLE MemberGroup (
    MemberID INT,
    GroupID INT,
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID),
    FOREIGN KEY (GroupID) REFERENCES InterestGroup(GroupID)
);

CREATE TABLE MemberEvent (
    MemberID INT,
    EventID INT,
    FOREIGN KEY (MemberID) REFERENCES Member(MemberID),
    FOREIGN KEY (EventID) REFERENCES Event(EventID)
);

INSERT INTO Member (MemberID, LastName, FirstName, EmailAddress, PhoneNumber, DateOfBirth, ReminderEmailFlag)
VALUES
    (1, 'Nigus', 'Solomon', 'king.s@example.com', '123-456-7890', '1990-05-15', 1),
    (2, 'Fenan', 'Hidru', 'fenan.h@example.com', NULL, '1985-08-22', 1),
    (3, 'Bruno', 'Fernandes', 'bruno.f@example.com', '987-654-3210', '1982-12-10', 0),
    (4, 'Ten', 'Hag', 'Ten.h@example.com', NULL, '1995-03-28', 1),
    (5, 'Wayne', 'Rooney', 'wayne.r@example.com', '555-555-5555', '1980-07-04', 0),
    (6, 'Muluken', 'Melese', 'muluken.m@example.com', '111-222-3333', '1998-09-18', 1),
    (7, 'Teddy', 'Tadesse', 'teddy.t@example.com', NULL, '1975-01-01', 0),
    (8, 'Gosaye', 'Tesfaye', 'gosaye.t@example.com', '333-333-3333', '1988-06-14', 1);


    INSERT INTO InterestGroup (GroupID, Name)
    VALUES
    (1, 'Football Enthusiasts'),
    (2, 'Music Lovers'),
    (3, 'Cooking Club');

INSERT INTO Event (EventID, Name, Description, StartDateTime, Duration, GroupID)
VALUES
        (1, 'Football tournament', 'Watch football tournament.', '2023-04-15 10:00:00', 180, 1),
        (2, 'Music therapy', 'Listening music.', '2023-04-20 15:30:00', 120, 2),
        (3, 'Cooking Class', 'Cook and enjoy delicious meals.', '2023-04-25 18:00:00', 90, 3),
        (4, 'Nature Photography Walk', 'Capture the beauty of nature.', '2023-04-30 09:00:00', 60, 2);


        INSERT INTO MemberGroup (MemberID, GroupID)
        VALUES
            (1, 1), (1, 2), (2, 1), (3, 3), (4, 2), (5, 1), (5, 3), (6, 2), (7, 1), (8, 2);


            INSERT INTO MemberEvent (MemberID, EventID)
            VALUES
                (1, 1), (1, 2), (2, 2), (3, 1), (4, 3), (5, 4), (6, 2), (7, 3), (8, 4);

