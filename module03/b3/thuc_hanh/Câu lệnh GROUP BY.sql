select status from classicmodels.orders 
group by status;


select status, COUNT(*) as 'So luong status'
from classicmodels.orders 
group by status;

select year(orderDate) as year, sum(quantityOrdered * priceEach) as total
from classicmodels.orders 
inner join classicmodels.orderdetails on orders.orderNumber = orderdetails.orderNumber
where status = 'shipped'
group by year
having year > 2003;

select orderNumber, sum(quantityOrdered * priceEach) as total
from classicmodels.orderdetails
group by orderNumber;