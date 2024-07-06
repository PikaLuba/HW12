INSERT INTO Client (name) VALUES ('Alex');
INSERT INTO Client (name) VALUES ('John');
INSERT INTO Client (name) VALUES ('Gleb');
INSERT INTO Client (name) VALUES ('Paul');
INSERT INTO Client (name) VALUES ('Peter');
INSERT INTO Client (name) VALUES ('Max');
INSERT INTO Client (name) VALUES ('Louis');
INSERT INTO Client (name) VALUES ('Michelle');
INSERT INTO Client (name) VALUES ('Elena');
INSERT INTO Client (name) VALUES ('Sofia');

INSERT INTO Planet (id,name) VALUES ('VENUS','Venus');
INSERT INTO Planet (id,name) VALUES ('EARTH','Earth');
INSERT INTO Planet (id,name) VALUES ('MARS','Mars');
INSERT INTO Planet (id,name) VALUES ('JUPITER','Jupiter');
INSERT INTO Planet (id,name) VALUES ('SATURN','Saturn');

INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-01-01 07:30:10','2. klasse',1,'VENUS','EARTH');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-02-02 07:40:10','',2,'EARTH','VENUS');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-03-03 07:50:10','',3,'EARTH','MARS');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-04-04 07:31:10','',4,'EARTH','JUPITER');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-05-05 07:32:10','',5,'EARTH','SATURN');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-06-06 07:33:10','',6,'MARS','EARTH');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-07-07 07:34:10','',7,'JUPITER','EARTH');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-08-08 07:35:10','',8,'SATURN','EARTH');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-09-09 07:36:10','',9,'MARS','EARTH');
INSERT INTO Ticket (created_at, name, client_id, from_planet_id, to_planet_id) VALUES ('2020-10-10 07:37:10','',1,'EARTH','VENUS');
