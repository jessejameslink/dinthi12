SELECT * FROM `luyện tập các hàm thông dụng trong sql`.sinhvien;
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (1,'Hoang',18,'CNTT',400);
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (2,'Viet',18,'DTVT',320);
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (3,'Thanh',18,'KTDN',400);
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (4,'Nhan',18,'CK',450);
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (5,'Huong',20,'CNTT',500);
insert into sinhvien (ID,TEN,TUOI,KHOAHOC,SOTIEN) values (5,'Huong',20,'TCNH',200);

select * from sinhvien where Ten ='Huong';
select sum(SOTIEN) from sinhvien where ID = 5;
select TEN from sinhvien group by TEN;