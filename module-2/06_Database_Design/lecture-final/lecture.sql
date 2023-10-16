
START TRANSACTION;


DROP TABLE IF EXISTS customers, art, artists, purchase_art, purchase CASCADE;

CREATE TABLE customers
(
   customerId serial,
   name varchar(64) NOT NULL,
   address varchar(100) NOT NULL,
   phone varchar(11) NULL,
	
   constraint pk_customerId primary key (customerId)
   
	
);

CREATE TABLE artists
(
  artistId serial,
  firstName varchar(64) NOT NULL,
  lastName varchar(64) NOT NULL,
	
  constraint pk_artistId primary key (artistId) 	

);

CREATE TABLE art 
(
   artCodeId serial,
   title varchar(128) NOT NULL,
   artistId int NOT NULL,
	
   constraint pk_artCodeId primary key (artCodeId),
   constraint fk_artistId foreign key (artistId) references artists (artistId)	
	


);

CREATE TABLE purchase
(
	purchaseId serial,
	purchaseDate timestamp NOT NULL,
    price money NOT NULL,
	customerId int NOT NULL,
	
	
    constraint pk_purchaseId primary key (purchaseId),
	constraint fk_customerId foreign key (customerId) references customers (customerId)
	
	
);

CREATE TABLE purchase_art
(
    purchaseId int NOT NULL,
	artCodeId int NOT NULL,
	
	constraint pk_purchase_art primary key (purchaseId, artCodeId), 		
	constraint fk_purchaseId foreign key (purchaseId) references purchase (purchaseId),
    constraint fk_artCodeId foreign key (artCodeId) references art (artCodeId)
);


ROLLBACK;




-- CREATE INSERTS TO POPULATE WITH ANY STARTING DATA









