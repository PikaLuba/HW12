INSERT INTO Client (id,name) VALUES (1,'Alex');
INSERT INTO Client (id,name) VALUES (2,'John');
INSERT INTO Client (id,name) VALUES (3,'Gleb');
INSERT INTO Client (id,name) VALUES (4,'Paul');
INSERT INTO Client (id,name) VALUES (5,'Peter');
INSERT INTO Client (id,name) VALUES (6,'Max');
INSERT INTO Client (id,name) VALUES (7,'Louis');
INSERT INTO Client (id,name) VALUES (8,'Michelle');
INSERT INTO Client (id,name) VALUES (9,'Elena');
INSERT INTO Client (id,name) VALUES (10,'Sofia');

INSERT INTO Planet (id,name) VALUES ('VENUS','Venus');
INSERT INTO Planet (id,name) VALUES ('EARTH','Earth');
INSERT INTO Planet (id,name) VALUES ('MARS','Mars');
INSERT INTO Planet (id,name) VALUES ('JUPITER','Jupiter');
INSERT INTO Planet (id,name) VALUES ('SATURN','Saturn');

INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (1,'2020-01-01 07:30:10',1,'VENUS','EARTH');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (2, '2020-02-02 07:40:10',2,'EARTH','VENUS');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (3,'2020-03-03 07:50:10',3,'EARTH','MARS');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (4,'2020-04-04 07:31:10',4,'EARTH','JUPITER');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (5,'2020-05-05 07:32:10',5,'EARTH','SATURN');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (6,'2020-06-06 07:33:10',6,'MARS','EARTH');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (7,'2020-07-07 07:34:10',7,'JUPITER','EARTH');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (8,'2020-08-08 07:35:10',8,'SATURN','EARTH');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (9,'2020-09-09 07:36:10',9,'MARS','EARTH');
INSERT INTO Ticket (id, created_at, client_id, from_planet_id, to_planet_id) VALUES (10,'2020-10-10 07:37:10',1,'EARTH','VENUS');
