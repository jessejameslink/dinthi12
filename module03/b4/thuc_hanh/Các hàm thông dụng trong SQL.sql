SELECT *
FROM fake_apps;


SELECT count(*) 
FROM fake_apps
WHERE price = 0;	

SELECT sum(downloads)
FROM fake_apps;
SELECT min(downloads)
FROM fake_apps;
SELECT max(price)
FROM fake_apps;

SELECT avg(downloads)
FROM fake_apps;
 SELECT AVG(price)
 FROM fake_apps;
 
 SELECT ROUND(AVG(price), 2)
FROM fake_apps;
SELECT price, COUNT(*) 
FROM fake_apps
GROUP BY price;

SELECT price, COUNT(*) 
FROM fake_apps
WHERE downloads > 20000
GROUP BY price;

SELECT category, SUM(downloads)
FROM fake_apps
GROUP BY category;	

SELECT category, 
   price,
   AVG(downloads)
FROM fake_apps
GROUP BY 1, 2;

SELECT price, 
   ROUND(AVG(downloads)),
   COUNT(*)
FROM fake_apps
GROUP BY price
HAVING COUNT(*) > 10;