create table accesslogs(id serial primary key,
url varchar(255),access_date timestamp default current_timestamp,
ipaddress varchar(20),method varchar(10),data text,
user_agent varchar(255));