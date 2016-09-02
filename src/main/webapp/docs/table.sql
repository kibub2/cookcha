CREATE TABLE member (
  id varchar2(40) not null primary key,
  idnum number(7) not null,
  name varchar2(16) not null,
  passwd varchar2(15) not null,
  rate_count number(5),
  register date not null,
  birth date not null,
  sex varchar2(3) not null,
  grade number(1),
  point number(4),
  picture varchar2(100),
  phone varchar2(20) not null
);