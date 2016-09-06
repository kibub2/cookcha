CREATE TABLE book (
  seq number(10) not null primary key,
  id varchar2(40) not null,
  name varchar2(16) not null,
  book_date date not null,
  book_time varchar2(4) default '점심',
  code number not null,
  phone varchar2(15) not null,
  seat number(2) default 0 not null,
  content clob not null,
  constraint book_member_fk1 foreign key(id) references member(id),
  constraint book_shop_fk1 foreign key(code) references shop(code)
);
create sequence book_seq;


create table member(
	id varchar2(40) not null primary key,
	id_num number(7) not null,
	name varchar2(16) not null,
	passwd varchar2(15) not null,
	rate_count number(5) null,
	register date not null,
	birth date not null,
	sex varchar2(3) not null,
	grade number(1) null,
	point number(4) null,
	picture varchar2(100) null,
	phone varchar2(20) not null,
	coupon number null
);
create sequence member_seq;

create table shop(
	code number not null primary key,
	name varchar2(20) not null,
	phone varchar2(12) not null,
	address varchar2(40) not null,
	sub_rating number(2,1) default(0),
	main_picture varchar2(100) not null,
	back_picture varchar2(100) not null,
	introduction clob not null,
	rater number default(0),
	classify number(2) not null,
	maxtable number(2) not null,
	able_book number(1) default(0),
	able_coupon number(1) default(0)
);