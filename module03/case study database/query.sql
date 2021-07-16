use furama;
-- query2
select * from employee where ten like 'h%' or ten like 'k%' or ten like 't%' and length(ho)< 15;
-- query3
select * from customer where (year(now())-year(Ngay_sinh)between 18 and 50) and Dia_chi ='Đà Nẵng' or Dia_chi ='Quảng Trị';
-- query4 (coi lại)
select customer.Ten,customer.id_customer, count(contract.id_contract) as 'so_lan_dat' from customer
inner join contract on customer.id_customer = contract.id_customer
 inner join type_customer on type_customer.id_type_customer = customer.id_type_customer
 where type_customer.name_type_customer = 'Diamond'
 group by customer.id_customer
 order by so_lan_dat;
 -- query5
 -- type_service.price +accompanied_service.unit*accompanied_service.price
 select customer.id_customer,customer.Ho,customer.Ten,type_customer.name_type_customer,
		 contract.id_contract,contract.start_day,contract.end_date,service.Ten_dich_vu,
(type_service.price +accompanied_service.unit*accompanied_service.price) as 'Tong_tien'   
from customer
inner join type_customer on customer.id_type_customer = type_customer.id_type_customer
left join contract on customer.id_customer = contract.id_customer
left join service on contract.id_service  = service.id_service
left join type_service on type_service.id_type_Service = service.id_type_Service
left join detailed_contract on detailed_contract.id_contract = contract.id_contract
left join accompanied_service on accompanied_service.id_accompanied_service = detailed_contract.id_accompanied_service;
-- query6
select service.id_service,service.Ten_dich_vu,type_service.price,type_service.name_service from service 
inner join type_service on type_service.id_type_Service = service.id_type_Service
inner join contract on service.id_service =contract.id_service
where contract.start_day between  '2019-01-01' and '2019-03-31';
-- query7
-- query8
select customer.Ho,customer.Ten from customer;
select customer.Ho,customer.Ten from customer
group by customer.Ho;
-- query9
select temp.month,count(contract.start_day) as 'customer_dang_ki',sum(contract.total_payment) as 'Tong_tien' from
(select 1 as month
union select 2 as month
union select 3 as month
union select 4 as month
union select 5 as month
union select 6 as month
union select 7 as month
union select 8 as month
union select 9 as month
union select 10 as month
union select 11 as month
union select 12 as month) as temp 
left join contract on month(contract.start_day) = temp.month
left join customer on customer.id_customer=contract.id_customer
where year(contract.start_day)='2019' or year(contract.start_day) is null
group by temp.month
order by temp.month;
-- query10
select contract.id_contract,contract.start_day,contract.end_date,
		contract.advance_deposit_amount,count(detailed_contract.so_luong)
from contract
inner join detailed_contract on detailed_contract.id_contract=contract.id_contract
group by contract.id_contract;
-- query11
select accompanied_service.name_accompanied_service,contract.id_contract,type_customer.name_type_customer,customer.Dia_chi from detailed_contract
inner join accompanied_service on detailed_contract.id_accompanied_service =accompanied_service.id_accompanied_service
left join contract on detailed_contract.id_contract = contract.id_contract
inner join customer on customer.id_customer = contract.id_customer
left join type_customer on customer.id_type_customer = type_customer.id_type_customer
where type_customer.name_type_customer = 'Diamond' and (customer.Dia_chi = 'Quảng Ngãi' or customer.Dia_chi = 'Vinh');
-- query12
select contract.id_contract,customer.Ten ,employee.Ten as 'Ten_nv',customer.Sdt,
		service.Ten_dich_vu,contract.total_payment,count(detailed_contract.id_accompanied_service) as 'SoLuongDichVuDikem '
 from contract
inner join customer on customer.id_customer = contract.id_customer
left join employee on employee.id_employee = contract.id_employee
left join service on contract.id_service = service.id_service
left join detailed_contract on detailed_contract.id_contract = contract.id_contract
left join accompanied_service on accompanied_service.id_accompanied_service = detailed_contract.id_accompanied_service
where not exists (
	select contract.id_contract
    where contract.start_day between "2019-01-01" and "2019-06-30"
)
and exists(
	select contract.id_contract
    where contract.start_day between "2019-09-01" and "2019-12-31"
);
-- query13
create temporary table temp 
select accompanied_service.name_accompanied_service, count(detailed_contract.id_accompanied_service) as 'soLuong'
from detailed_contract
inner join accompanied_service on accompanied_service.id_accompanied_service = detailed_contract.id_accompanied_service
group by accompanied_service.name_accompanied_service;
select * 
from temp;
create temporary table temp1
select temp.name_accompanied_service, max(temp.soLuong) as max_soLuong from temp;
select * from temp1;
drop temporary table temp;
drop temporary table temp1;
-- query14
select type_service.name_service ,accompanied_service.name_accompanied_service, contract.id_contract, count(detailed_contract.id_accompanied_service) as SoLanSuDung from contract
inner join detailed_contract on detailed_contract.id_contract = contract.id_contract
inner join accompanied_service on accompanied_service.id_accompanied_service=detailed_contract.id_accompanied_service
inner join service on service.id_service=contract.id_service
inner join type_service on type_service.id_type_Service=service.id_type_Service
group by (accompanied_service.name_accompanied_service) 
having SoLanSuDung =1;
-- query15
select employee.id_employee,employee.Ho,employee.Ten,employee.Trinh_do,part.name_part, count(contract.id_employee) as soLanHopDong from employee
inner join contract on contract.id_employee = employee.id_employee
inner join part on part.id_part = employee.id_part
where start_day between '2018-01-01' and '2019-12-31"'
group by employee.id_employee
having soLanHopDong <4;
-- query16
-- query17
update customer
inner join type_customer on customer.id_type_customer = type_customer.id_type_customer
inner join contract on contract.id_customer = customer.id_customer
set  id_type_customer = 'Diamond'
where total_payment > 10.0 and name_type_customer = 'Platinium' and year(start_day) = '2019' ;
-- query18
-- query19
-- query20
select id_customer,Ho,Ten,Ngay_sinh,Email,Sdt,Dia_chi, "nhanvien" as FromTable from customer 
union all 
select id_employee,Ho,Ten,Ngay_sinh,Email,Sdt,Dia_chi,"khachhang" asFromTable from employee;
-- query21
create view V_nhanvien as
select * from employee 
inner join contract on contract-id_employee = employee.id_contract
where Dia_chi = 'Hải Châu' and start_day = '2019-12-12'
select * from V_NHANVIEN 
-- query22
update V_nhanvien set Dia_chi ='Liên Chiểu' where id_employee = 'HC003'
-- query23
DELIMITER $$
CREATE PROCEDURE `Sp_1` (id_customer varchar(10))
BEGIN
delete from customer where customer.id_customer = id_customer
END
DELIMITER ;
call Sp_1(9);

