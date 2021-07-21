-- thông tin của Julie King (mã số 175)
SELECT * FROM customers WHERE customerNumber = 175;
-- kiểm tra index
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;

-- index cho nhiều cột
ALTER TABLE customers ADD INDEX idx_full_name(contactFirstName, contactLastName);
EXPLAIN SELECT * FROM customers WHERE contactFirstName = 'Jean' or contactFirstName = 'King';
-- xóa index
ALTER TABLE customers DROP INDEX idx_full_name;