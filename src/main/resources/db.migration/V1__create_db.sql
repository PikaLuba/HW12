CREATE TABLE world.Client(
 id INT PRIMARY KEY AUTO_INCREMENT,
 name VARCHAR(200) NOT NULL unique,
 CONSTRAINT client_chk_name CHECK (length(name) > 2)
 )
 collate = utf8mb4_unicode_ci
 engine = InnoDB
 row_format = default
 auto_increment = 1;

 CREATE TABLE world.Planet(
  id VARCHAR(10) NOT NULL unique,
  name VARCHAR(500),
  constraint planet_chk_id check ( id regexp '[0-9]' or id regexp '[A-Z]')
  );

 CREATE TABLE world.Ticket(
  id INT PRIMARY KEY AUTO_INCREMENT,
  created_at timestamp,
  client_id INT,
  from_planet_id VARCHAR(10),
  to_planet_id VARCHAR(10)
  )
  collate = utf8mb4_unicode_ci
  engine = InnoDB
  row_format = default
  auto_increment = 1;