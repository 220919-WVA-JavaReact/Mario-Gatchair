CREATE TABLE Students(
	Studentid serial PRIMARY KEY UNIQUE,
	"first name" varchar(25),
	"last name" varchar(25),
	email varchar(35) NOT NULL,
	"phone number" int
);

CREATE TABLE Courses(
	Courseid serial PRIMARY KEY UNIQUE,
	"Course title" varchar(45) NOT NULL,
	Mandatory bool,
	"Area of study" varchar(225),
	teachersid REFERENCES Teachers UNIQUE
);

CREATE TABLE Teachers(
	Teacherid serial PRIMARY KEY UNIQUE,
	"first name" varchar(25),
	"last name" varchar(25),
	email varchar(35) NOT NULL,
	"phone number" int NOT NULL
);

CREATE TABLE Topics(
	Topicid serial PRIMARY KEY UNIQUE,
	Mandatory bool,
	"Area" varchar(25)
);

CREATE TABLE student_enrollment(
	courseid int REFERENCES Courses,
	studentid int REFERENCES Students,
	topicsid int REFERENCES Topics
);


CREATE TABLE topics_studies(
	coursesid int REFERENCES Courses,
	topicid int REFERENCES Topics
);
