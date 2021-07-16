SELECT * FROM furama.employee;
use furama;
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('QLb01','QL','QL','ĐH','Khang','Huỳnh Lê','1977-10-08','0968554120','khangkhaukhinh@gmail.com','Đại Học','Quản lý','10.0',738859);
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('QLb02','QL','QL','ĐH','Khoa','Phan Minh Anh','1967-12-03','0934787158','khoa112@gmail.com','Đại Học','Quản lý','8.0',931861);
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('HC001','HC','LT','ĐH','Huyền','Trương Tiểu','1995-12-29','0968760450','huyen@gmail.com','Đại Học','Lễ Tân','6.0',889045);
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('HC002','HC','LT','ĐH','Như','Nguyễn Thị Quỳnh','1996-10-12','0964348848','nhu@gmail.com','Đại Học','Lễ Tân','6.0',673377);
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('HC003','HC','LT','ĐH','Tuấn','Phan Văn','1990-10-11','096457420','tuan@gmail.com','Đại Học','Lễ Tân','7.0',167775);

--
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('SALEa1','Sale','CV','CĐ','Thủy','Nguyễn Lê Thu','1988-02-23','0968507108','thuye12@gmail.com','Đại Học','chuyên viên','7.5',157562);
insert into employee (id_employee,id_part,id_job_position,id_level,Ten
,Ho,Ngay_sinh,Sdt,Email,Trinh_do,Vi_tri,Luong,Cmnd) 
values ('SALEa2','Sale','CV','ĐH','Hoa','Huỳnh Thị','1984-10-15','0968892633','hoa22a1@gmail.com','Đại Học','chuyên viên','6.5',206021);

alter table employee add column Dia_chi varchar(20) not null after Cmnd