/*câu hỏi: dùng check để kiểm tra nhập sđt chỉ 10 chữ số hoặc level kiểu như dùng enum*/
create table employee(
id_employee varchar(10) not null,
first_name varchar(10) not null,
last_name varchar(10) not null,
birthday date not null, 
phone int not null,
email varchar(10) not null,
level varchar(10) not null,
job_position varchar(10) not null,
salary int not null,
sex varchar(5) not null ,
id_card int not null,
primary key (id_employee),
check (sex ='male' or sex ='famale' or sex ='other')
);
-- -------------------create table level----------------------
create table level(
id_level varchar(10) not null,
name_level varchar(10) not null,

primary key( id_level),
foreign key (id_employee) references employee(id_employee)
);
-- -------------------create table part----------------------
create table part(
id_part varchar(10) not null,
name_part varchar(10) not null,

primary key( id_part),
foreign key (id_employee) references employee(id_employee)
);
-- -------------------create table job position----------------------
create table job_position(
id_job_position varchar(10) not null,
name_job_position varchar(10) not null,

primary key( id_job_position),
foreign key (id_employee) references employee(id_employee)
);
-- -------------------create table customer----------------------
create table customer(
id_customer varchar(10) not null,
first_name varchar(10) not null,
last_name varchar(10) not null,
birthday date not null, 
phone int not null,
email varchar(10) not null,
sex varchar(5) not null ,
id_card int not null,
primary key (id_customer),
check (sex ='male' or sex ='famale' or sex ='other')
);
-- -------------------create table type_customer----------------------
create table type_customer(
id_type_customer varchar(10) not null,
name_type_customer varchar(10) not null,
primary key (id_type_customer)
);
-- -------------------create table service----------------------
create table service(
id_service varchar(10) not null,
number_persons int not null,
room_standard text,
description text,
number_floors int not null,
id_type_Service varchar(10) not null,
id_rental_type varchar(10) not null,
primary key (id_service)

);
create table type_service(
id_type_Service varchar(10) not null,
name_service varchar(10) not null
);
create table rental_type(
id_rental_type varchar(10) not null,
name_rental_type varchar(10) not null,
price float
);
alter table rental_type add primary key (id_rental_type);
alter table service add foreign key (id_rental_type) references rental_type(id_rental_type);

create table contract(
id_contract varchar(10) not null,
start_day date not null,
end_date date not null,
advance_deposit_amount float not null,
total_payment float not null,
primary key (id_contract)
);

create table Accompanied_service(
id_Accompanied_service varchar(10) not null,
name_Accompanied_service varchar(20) not null,
unit varchar(10) not null,
price float not null,
primary key (id_Accompanied_service)
);

create table detailed_contract(
id_detailed_contract varchar(10) not null,
id_contract varchar(10) not null,
id_Accompanied_service varchar(10) not null,
primary key (id_detailed_contract)
);
alter table contract add column id_employee varchar(10) not null,
add column id_customer varchar(10) not null;
alter table contract add column id_service varchar(10) not null;

alter table contract add foreign key (id_employee) references employee(id_employee);
alter table contract add foreign key (id_customer) references customer(id_customer);
alter table contract add foreign key (id_service) references service(id_service);
-- xóa foreign key
alter table job_position drop foreign key job_position_ibfk_1;
alter table level drop foreign key level_ibfk_1;
alter table part drop foreign key part_ibfk_1;

-- thêm 1 column vào table
alter table employee add column id_job_position varchar(10) after id_employee,
add column id_part varchar(10) after id_employee;

-- xóa 1 cột khỏi table
-- alter table part drop column id_employee;
-- alter table employee add foreign key(id_level) references level(id_level)

-- thêm khóa ngoại bằng alter
-- alter table employee add foreign key(id_level) references level(id_level);
-- alter table employee add foreign key(id_part) references part(id_part);
-- alter table employee add foreign key(id_job_position) references job_position(id_job_position)
