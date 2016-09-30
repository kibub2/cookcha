CREATE TABLE book (
  seq number(10) not null primary key,
  id varchar2(40) not null,
  name varchar2(16) not null,
  book_date date not null,
  book_time char(4) default '점심',
  code number not null,
  phone varchar2(15) not null,
  seat number(2) default 0 not null,
  content clob not null,
  constraint book_member_fk1 foreign key(id) references member(id),
  constraint book_shop_fk1 foreign key(code) references shop(code)
);
create sequence book_seq;

create table board (
 seq int not null primary key,
 code number(1,0),
 subject varchar2(40) not null,
 content clob not null,
 reg_date date not null,
 id varchar2(40) not null,
 constraint board_member_fk1 foreign key(id) references member(id)
);

create table board2 (
 seq int not null primary key,
 code number(1,0),
 subject varchar2(40) not null,
 content clob not null,
 reg_date date not null,
 id varchar2(40) not null,
 constraint board_member_fk2 foreign key(id) references member(id)
);

