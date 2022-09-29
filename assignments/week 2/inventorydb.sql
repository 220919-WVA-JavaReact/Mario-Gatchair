-- Created our inventory table
CREATE TABLE inventory(
	ID serial PRIMARY KEY,
	"name" varchar(25),
	price NUMERIC,
	description varchar(60),
	quantity int
);
-- inserted the actual inventory
INSERT INTO inventory
VALUES
	(1001,'Hershey Bar', 3.45,'A small chocolate bar', 50),
	(1002,'Skittles', 3.05,'A bag of rainbow colored candies', 100),
	(2003,'Gummy Bears', 5.55,'A large bag of chewy fruit-flavored bears', 48),
	(2005,'Sour Gummy Worms', 9.55,'A very large bag of gelatin worms', 20),
	(3008,'Lolipop', 2.25,'A hard candy atop a stick', 268),
	(9007,'M&Ms', 1.95,'A bag of small chocolate candies', 58);
	
--updating inventory
UPDATE inventory
SET quantity = 48
WHERE ID = 1001;

-- Running query for candy description
SELECT description FROM inventory;

-- running query for candy prices and names
SELECT name, price FROM inventory;

-- Updating description for sour gummy worms
UPDATE inventory
SET description ='A very large, delicious bag of worms'
WHERE ID = 2005;

-- Updating the M&M stocks
UPDATE inventory
SET quantity = 100
WHERE ID = 9007

-- updating lolipops