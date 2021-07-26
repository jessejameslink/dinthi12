create database demo;

create table products(
id int not null auto_increment primary key,
productCode int not null,
productName varchar(20) not null,
productPrice int not null,
productAmount int not null,
productDescription varchar(20),
productStatus varchar(20)
);
SELECT * FROM demo.products;
insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0011,'Baked goods',100,20,'','');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0012,'Beverages',120,12,'Ruby red with purple hues, golden with green tones, and pale straw with hints of silver.','I love you to the fridge and back');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0013,'Nutritional Drinks',223,25,'Mention the depth of color in red wine: Deep, rich, concentrated, opaque.','Everything tastes good when you are hungry');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0014,'Biscuits',134,45,'fills the room with…','');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0015,'Breakfast foods',60,6,'ry non-fruit aromas like undergrowth, mushrooms, leather, cured meat, or wildflowers','');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0016,'Cakes',157,34,'Oak-aged wines often have spice aromas including cinnamon, vanilla, cloves, allspice, Chinese five-spice, or baking spices','');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0017,'Chips',233,21,'','Count memories, not calories');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0018,'Corn snacks',322,50,' Red wines have gritty particles called tannins; you should describe them as round, angular, coating, powdered, or silky','');
 insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus)
 values
 (0019,'Nuts and seeds',150,20,'','Donut worry, be happy');
 -- -------------------------------------------------------------------------------------
 CREATE UNIQUE INDEX uidx_productCode
ON Products  (productCode );

CREATE INDEX index_productName_productPrice
ON Products (productName,productPrice);

EXPLAIN SELECT * FROM Products;
-- -------------------------------------------------------------------------------------
create view getInforProduct as
select productCode, productName, productPrice, productStatus from products;

select * from getInforProduct;

DROP VIEW customer_views;
-- -------------------------------------------------------------------------------------

create or replace view getInforProduct as
select * from products
where productName = 'Chips';
-- -------------------------------------------------------------------------------------
DELIMITER //
CREATE PROCEDURE findAllProduct()
BEGIN
  SELECT * FROM products;
END //
DELIMITER ;
call findAllProduct();

DELIMITER //
CREATE PROCEDURE addProduct(in productCode_p int,in productName_p varchar(20),in productPrice_p int,in productAmount_p int,in productDescription_p mediumtext,in productStatus_p mediumtext)
BEGIN
  insert into products (productCode,productName,productPrice,productAmount,productDescription,productStatus) values (productCode_p,productName_p,productPrice_p,productAmount_p,productDescription_p,productStatus_p);
END //
DELIMITER ;
call demo.addProduct(20, 'pizza', 200, 20, 'abc', ''); 

DELIMITER //
CREATE PROCEDURE editProduct(in productCode_p int,in productName_p varchar(20))
BEGIN
update products
set 
productName = productName_p where productCode = productCode_p;
END //
DELIMITER ;
call editProduct(20, 'oero');

DELIMITER //
CREATE PROCEDURE deleteProduct(in productCode_p int)
BEGIN
delete from products
where productCode = productCode_p;
END //
DELIMITER ;
call deleteProduct(20);