create table address(
addressid int not null primary key  auto_increment ,
addressinfo varchar(255) default ''
);

create table user(
userid int not null primary key  auto_increment ,
name varchar(20) default '',
password varchar(12) 
);

create table user_address(
addressid int not null,
userid int not null ,
  primary key (`addressid`,`userid`),
  key `fk1` (`addressid`),
  key `fk2` (`userid`),
  constraint `fk1` foreign key  (`addressid`) references `address` (`addressid`),
  constraint `fk2` foreign key  (`userid`) references `user` (`userid`)
);
