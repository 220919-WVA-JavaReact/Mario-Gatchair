CREATE TABLE countries (
	CountryName varchar(40),
	CountryAbbreviation char(3),
	Population int,
	GDP money,
	Capital varchar (60),
	Currency char (3),
	"Area in square miles" int,
	Democratic bool,
	"Language" varchar (36)
);

INSERT INTO countries VALUES ('Afghanistan', 'AFG', 40218234, 72911000000,'Kabul', 'AFN', 252073, FALSE, 'Pashto');
INSERT INTO countries VALUES ('Algeria', 'DZA', 447000000, 581189000000,'Algiers', 'DZD', 919595, TRUE, 'Arabic');
INSERT INTO countries VALUES ('Australia', 'AUS', 25972400, 1605000000000,'Canberra', 'AUD', 2969907, TRUE, 'English');
INSERT INTO	countries VALUES ('Brazil', 'BRA', 217240060, 3585000000000,'Brasilia', 'BRL', 3287956, TRUE, 'Portuguese');
INSERT INTO countries VALUES ('Myanmar', 'MMR', 51486253, 243,420,000,000,'Naypyidaw', 'MMK', 261327, TRUE, 'Burmese');
INSERT INTO countries VALUES ('Saudi Arabia', 'SAU', 38401000, 2000000000000,'Riyadh', 'SAR', 830000, FALSE, 'Arabic');