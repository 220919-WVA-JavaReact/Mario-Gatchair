

CREATE TABLE teachers(
teacher_id serial PRIMARY KEY,
"first" varchar (25),
"last" varchar (25),
username varchar (25) NOT NULL UNIQUE,
"password" varchar(25)
);

CREATE TABLE courses(
course_num varchar (10),
title varchar(50),
teacher_id int REFERENCES teachers
);

INSERT INTO teachers ("first", "last", "username", "password")
VALUES ('Bryan', 'Serfozo', 'bserfozo', 'password'),
		('Billy', 'Bob', 'bb01', 'password'),
		('James', 'Smith', 'js1', 'password');
		
INSERT INTO courses
VALUES	('MAC2311','Calculus 1', NULL),
		('PROG2048','Intro to Java', NULL),
		('SCI101','Intro to Biology', NULL),
		('READ102','Intermediate Reading', NULL);
		
	
SELECT * FROM TEACHERS:
