-- Tạo Mysql Stored Procedure đầu tiên
DELIMITER //
CREATE PROCEDURE findAllCustomers()
BEGIN
  SELECT * FROM customers;
END //
DELIMITER ;
call findAllCustomers();

-- drop procedure rồi tạo mới
DELIMITER //
DROP PROCEDURE IF EXISTS `findAllCustomers`//
CREATE PROCEDURE findAllCustomers()
BEGIN
   SELECT *  FROM customers where customerNumber = 175;
END; //
DELIMITER //