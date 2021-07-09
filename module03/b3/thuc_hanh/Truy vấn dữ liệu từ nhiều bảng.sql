select customers.customerNumber, customerName, phone, paymentDate, amount from classicmodels.customers
inner join classicmodels.payments
on customers.customerNumber = payments.customerNumber
where city = 'Las Vegas';


select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from classicmodels.customers
left join classicmodels.orders
on customers.customerNumber = orders.customerNumber;

select customers.customerNumber, customers.customerName, orders.orderNumber, orders.status
from classicmodels.customers LEFT JOIN classicmodels.orders
on customers.customerNumber = orders.customerNumber
where orderNumber is null