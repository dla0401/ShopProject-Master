create table items
(
	item_id		int 	primary key,
	item_name	varchar2(20),
	price		int,
	description	varchar2(100),
	pictureUrl	varchar2(100)
)

drop table items
drop table users


create table users
(
	user_id		varchar2(10)	primary key,
	user_pwd	varchar2(10)	not null,
	user_name	varchar2(10)	not null
)

drop table order_list
create table order_list
(
	order_num		int				primary key,
	user_id			varchar2(10),
	order_date		date			default sysdate,
	foreign key(user_id) references users(user_id)
)

drop table order_detail
create table order_detail
(
	order_num		int,
	item_id			int,
	count			int,
	primary key(order_num, item_id),
	foreign key(order_num) references order_list(order_num),
	foreign key(item_id) references items(item_id)
)

select * from items


create sequence item_seq
create sequence order_seq

insert into items values(item_seq.nextval, 'a', 100, '', '')
insert into items values(item_seq.nextval, 'b', 200, '', '');
insert into items values(item_seq.nextval, 'c', 300, '', '');
insert into items values(item_seq.nextval, 'd', 400, '', '');
insert into items values(item_seq.nextval, 'e', 500, '', '');



