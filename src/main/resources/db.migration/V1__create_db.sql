CREATE TABLE Client(
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(200) NOT NULL,
 CONSTRAINT client_chk_name CHECK (length(name) > 2)
 );

 CREATE TABLE Planet(
 id VARCHAR(10) NOT NULL,
 name VARCHAR(500)
 );

 CREATE UNIQUE INDEX unique_index ON Planet (id, name);

 CREATE TABLE Ticket(
 id INT PRIMARY KEY AUTO_INCREMENT,
 created_at timestamp,
 client_id INT,
 from_planet_id VARCHAR(10),
 to_planet_id VARCHAR(10),
 FOREIGN KEY (client_id) REFERENCES Client(id),
 FOREIGN KEY (from_planet_id) REFERENCES Planet(id),
 FOREIGN KEY (to_planet_id) REFERENCES Planet(id)
 );