-- query2
select * from nhan_vien nv
where Ten like 'h%' or Ten like 't%' or Ten like 'k%'  and length(ten) < 15;
-- query3
select * from khach_hang 
where ((year(now())-year(ngay_sinh)) between 18 and 50)
and
 Dia_chi = 'Đà Nẵng' or Dia_chi = 'Quảng Trị';
-- query4
select Ho,Ten,Ngay_sinh,CMND,SDT,Email,Dia_chi,lk.Ten_loai_khach,count(hd.idhop_dong) as 'SoLan'  from hop_dong hd
inner join khach_hang kh on kh.idkhach_hang = hd.idkhach_hang
inner join loai_khach lk on lk.idloai_khach = kh.idloai_khach
where Ten_loai_khach = 'Diamond'
group by kh.idkhach_hang
order by SoLan;
-- query5
select kh.idkhach_hang,Ho,Ten,Ngay_bat_dau,Ngay_ket_thuc, (dvdk.Gia*hdct.So_luong+kt.Gia) as 'Tong tien',hd.idhop_dong,dv.Ten_dich_vu from hop_dong hd
inner join hop_dong_chi_tiet hdct on hdct.idhop_dong = hd.idhop_dong
left join dich_vu_di_kem dvdk on hdct.iddich_vu_di_kem = hdct.iddich_vu_di_kem
left join dich_vu dv on dv.iddich_vu = hd.iddich_vu
left join kieu_thue kt on kt.idkieu_thue = dv.idkieu_thue
left join khach_hang kh on kh.idkhach_hang = hd.idkhach_hang
group by idhop_dong;
-- query6
select dv.iddich_vu,dv.Ten_dich_vu,dv.Dien_tich,kt.Gia,ldv.Ten_loai_dich_vu,month(Ngay_bat_dau) 'month',year(Ngay_bat_dau) 'year' from hop_dong hd
inner join dich_vu dv on hd.iddich_vu = dv.iddich_vu
inner join kieu_thue kt on kt.idkieu_thue = dv.idkieu_thue
left join loai_dich_vu ldv on dv.idloai_dich_vu =  ldv.idloai_dich_vu
where Ngay_bat_dau between '2019-01-01' and '2019-03-31';
-- query7
select dv.iddich_vu,dv.Ten_dich_vu,dv.Dien_tich,ldv.Ten_loai_dich_vu,dv.So_nguoi_toi_da,kt.Gia from dich_vu dv
inner join loai_dich_vu ldv on dv.idloai_dich_vu =  ldv.idloai_dich_vu
left join kieu_thue kt on kt.idkieu_thue = dv.idkieu_thue
where not exists (
	select hop_dong.idhop_dong
    from hop_dong 
    where year(hop_dong.Ngay_bat_dau) = '2019' and hop_dong.iddich_vu=dv.iddich_vu
)and exists (
	select hop_dong.idhop_dong
    from hop_dong 
    where year(hop_dong.Ngay_bat_dau) = '2018' and hop_dong.iddich_vu=dv.iddich_vu);

-- query8
select distinct khach_hang.ho,khach_hang.Ten from khach_hang;
select khach_hang.Ho,khach_hang.Ten from khach_hang
group by khach_hang.Ho;
select khach_hang.Ho,khach_hang.Ten
from khach_hang 
union
select khach_hang.Ho,khach_hang.Ten
from khach_hang;
-- query9
select temp.month,count(hop_dong.Ngay_bat_dau) as 'khach hang dk',sum(hop_dong.Tong_tien) as 'Tong_tien' from
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
left join hop_dong on month(hop_dong.Ngay_bat_dau)=temp.month
left join khach_hang on khach_hang.idkhach_hang=hop_dong.idkhach_hang
where year(hop_dong.Ngay_bat_dau)='2019' or year(hop_dong.Ngay_bat_dau) is null or month (hop_dong.Ngay_bat_dau) is null
group by temp.month
order by temp.month;
-- query10
select hop_dong.idhop_dong,count(hdct.iddich_vu_di_kem) as 'So luong' from hop_dong 
inner join hop_dong_chi_tiet hdct on hdct.idhop_dong = hop_dong.idhop_dong
group by hop_dong.idhop_dong;
-- query11
select dvdk.iddich_vu_di_kem,dvdk.Ten_dich_vu,dvdk.Gia,dvdk.Don_vi,dvdk.Trang_thai_kha_dung from khach_hang kh
inner join hop_dong on hop_dong.idkhach_hang = kh.idkhach_hang
inner join loai_khach lk on lk.idloai_khach = kh.idloai_khach 
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.idhop_dong = hop_dong.idhop_dong 
inner join dich_vu_di_kem dvdk on dvdk.iddich_vu_di_kem = hop_dong_chi_tiet.iddich_vu_di_kem
where (Ten_loai_khach = 'Diamond' and (Dia_chi = 'Vinh' or Dia_chi = 'Quãng Ngãi'));
-- query12
select hd.idhop_dong,nv.Ten as 'Ten NV',kh.Ten as 'Ten KH',kh.SDT,dv.Ten_dich_vu,count(hop_dong_chi_tiet.idhop_dong_chi_tiet) as'SoLuongDichVuDikem',hd.Tong_tien from hop_dong hd
inner join khach_hang kh on kh.idkhach_hang = hd.idkhach_hang
inner join nhan_vien nv on nv.idnhan_vien = hd.idnhan_vien
inner join dich_vu dv on dv.iddich_vu = hd.iddich_vu
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.idhop_dong = hd.idhop_dong
inner join dich_vu_di_kem on dich_vu_di_kem.iddich_vu_di_kem = hop_dong_chi_tiet.iddich_vu_di_kem
where
 exists(
	select hd.idhop_dong
    where hd.Ngay_bat_dau between "2019-09-01" and "2019-12-31"
)
and not exists (
	select hd.idhop_dong
    where hd.Ngay_bat_dau between "2019-01-01" and "2019-06-30"
);
-- query13 (coi lại)

select dich_vu_di_kem.*, count(hop_dong_chi_tiet.iddich_vu_di_kem) as 'Solan'
from hop_dong_chi_tiet 
inner join dich_vu_di_kem  on dich_vu_di_kem.iddich_vu_di_kem = hop_dong_chi_tiet.iddich_vu_di_kem
group by dich_vu_di_kem.Ten_dich_vu
having count(hop_dong_chi_tiet.iddich_vu_di_kem) = (
select  count(hop_dong_chi_tiet.iddich_vu_di_kem) 
from hop_dong_chi_tiet 
inner join dich_vu_di_kem  on dich_vu_di_kem.iddich_vu_di_kem = hop_dong_chi_tiet.iddich_vu_di_kem
group by dich_vu_di_kem.Ten_dich_vu
order by count(hop_dong_chi_tiet.iddich_vu_di_kem) desc
limit 1
);
-- query14
select hop_dong.idhop_dong,loai_dich_vu.Ten_loai_dich_vu,dich_vu_di_kem.Ten_dich_vu,count(hop_dong_chi_tiet.iddich_vu_di_kem) as 'SoLanSuDung' from hop_dong
inner join hop_dong_chi_tiet on hop_dong_chi_tiet.idhop_dong = hop_dong.idhop_dong
inner join dich_vu_di_kem on hop_dong_chi_tiet.iddich_vu_di_kem = dich_vu_di_kem.iddich_vu_di_kem
inner join dich_vu on dich_vu.iddich_vu = hop_dong.iddich_vu
inner join loai_dich_vu on loai_dich_vu.idloai_dich_vu = dich_vu.idloai_dich_vu
group by dich_vu_di_kem.Ten_dich_vu
having SoLanSuDung =3;
-- query15
select nhan_vien.idnhan_vien,Ho,Ten,SDT,Dia_chi,trinh_do.Trinh_do,bo_phan.Ten_bo_phan, count(hop_dong.idnhan_vien) as 'soLan' from nhan_vien 
inner join hop_dong on hop_dong.idnhan_vien = nhan_vien.idnhan_vien
inner join trinh_do on Trinh_do.idtrinh_do = nhan_vien.idtrinh_do
inner join bo_phan on bo_phan.idbo_phan = nhan_vien.idbo_phan
 where hop_dong.Ngay_bat_dau between "2018-01-01" and "2019-12-31"
 group by nhan_vien.idnhan_vien
 having soLan >=4;
 -- query16
  delete from nhan_vien where exists(
	select nhan_vien.idnhan_vien
    from hop_dong
    inner join nhan_vien on nhan_vien.idnhan_vien = hop_dong.idnhan_vien
where hop_dong.Ngay_bat_dau between "2017-01-01" and "2019-12-31"  and nhan_vien.idvi_tri = 'Lễ tân'
 );
  -- query17
  update khach_hang
inner join loai_khach LK on LK.idloai_khach= khach_hang.idloai_khach
inner join hop_dong HD on HD.idkhach_hang = khach_hang.idkhach_hang
set khach_hang.idloai_khach="Diamond"
where (LK.Ten_loai_khach ="Platinium") and (year(HD.Ngay_bat_dau)=2019) and (HD.tong_tien>10000);
  -- query18
delete from khach_hang
where idloai_khach in (
select idloai_khach
from hop_dong
where year(Ngay_bat_dau) <= 2016);
  -- query19
update dich_vu_di_kem
set dich_vu_di_kem.gia=dich_vu_di_kem.gia*2
where exists (
select dich_vu_di_kem.ten_dich_vu_di_kem from hop_dong_chi_tiet
inner join hop_dong_chi_tiet HDCT on HDCT.id_dich_vu_di_kem = dich_vu_di_kem.id_dich_vu_di_kem
inner join hop_dong on hop_dong.id_hop_dong = HDCT.id_hop_dong
where hop_dong_chi_tiet.iddich_vu_di_kem = dich_vu_di_kem.iddich_vu_di_kem and year(hop_dong.Ngay_bat_dau)=2019
group by dich_vu_di_kem.iddich_vu_di_kem
having count(hop_dong_chi_tiet.iddich_vu_di_kem) >1
);
-- in
update dich_vu_di_kem
set dich_vu_di_kem.gia=dich_vu_di_kem.gia*2
where dich_vu_di_kem.iddich_vu_di_kem in (
	select hop_dong_chi_tiet.iddich_vu_di_kem from hop_dong_chi_tiet 
    inner join hop_dong on hop_dong.idhop_dong = hop_dong_chi_tiet.idhop_dong
    where year(hop_dong.Ngay_bat_dau)=2019
    group by hop_dong_chi_tiet.iddich_vu_di_kem
    having count(hop_dong_chi_tiet.iddich_vu_di_kem) > 1
);
  -- query20
select nv.idnhan_vien,nv.Ho,nv.Ten, nv.email, nv.sdt, nv.ngay_sinh, nv.dia_chi, "nhanvien" as FromTable
from nhan_vien nv
union all
select KH.idkhach_hang,KH.Ho,KH.Ten, KH.email, KH.sdt, KH.ngay_sinh, KH.dia_chi, "khachhang" asFromTable
from khach_hang KH;
 -- query21
 create view V_nhanvien as
select hop_dong.Ngay_bat_dau,nhan_vien.idnhan_vien,Ho,Ten,ngay_sinh,CMND,Luong,Email,sdt from hop_dong
inner join nhan_vien on nhan_vien.idnhan_vien = hop_dong.idnhan_vien
where 
exists(
	select hop_dong.idhop_dong
  where  Ngay_bat_dau = '2019-12-12' and Dia_chi = 'Quãng Ngãi'
);
select * from v_nhanvien;
 -- query22
update v_nhanvien set Dia_chi ='Đà Nẵng' where nhan_vien.idnhan_vien = 'HC001';
 -- query23
 ALTER TABLE khach_hang ADD INDEX IX_KHACHHANG(idkhach_hang);
 -- query25
DELIMITER $$
CREATE PROCEDURE `Sp_1` (in id varchar(10))
BEGIN
delete from khach_hang where khach_hang.id_customer = id;
END; $$
DELIMITER ;
call Sp_1(9);

