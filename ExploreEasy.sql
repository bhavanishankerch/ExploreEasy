create table explore_ease.bus(
 id int AUTO_INCREMENT not null ,
 travels_name varchar(50),
 boarding varchar(50),
 departure varchar(50),
 bus_type varchar(50),
 starting_time time,
 ending_time time,
 duration varchar(50),
 ratings double,
 ticket_price int,
 primary key(id)
);

create table explore_ease.flight(
id int auto_increment not null,
flight varchar(50),
boarding varchar(50),
departure varchar(50),
starting_time time,
ending_time time,
duration int,
ticket_price int,
primary key(id)
);

create table explore_ease.hotel(
id int auto_increment not null,
hotel_name varchar(50),
check_in time,
check_out time,
hotel_price int,
rating double,
primary key(id)
);

CREATE TABLE explore_ease.busbooking (
  id INT AUTO_INCREMENT NOT NULL,
  user_name VARCHAR(50),
  aadhar_number VARCHAR(50),
  mobile_number varchar(50),
  email_id varchar(50),
  date_time DATETIME DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (id)
);


create table explore_ease.flightbooking(
id int  AUTO_INCREMENT not null,
user_name varchar(50),
passport_number varchar(50),
mobile_number varchar(50),
email_id varchar(50),
date_time DATETIME DEFAULT CURRENT_TIMESTAMP,
primary key(id)
);

create table explore_ease.hotelbooking(
id int  AUTO_INCREMENT not null,
user_name varchar(50),
aadhar_number varchar(50),
check_in datetime,
check_out datetime,
mobile_number varchar(50),
email_id varchar(50),
date_time DATETIME DEFAULT CURRENT_TIMESTAMP,
primary key(id)
);