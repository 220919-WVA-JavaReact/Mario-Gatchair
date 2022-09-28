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
	"Area of study" varchar(225)
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
	course serial REFERENCES Courses,
	student serial REFERENCES Students,
	topics serial REFERENCES topics
);

CREATE TABLE teacher_assignment(
	teacher serial REFERENCES Teachers,
	course serial REFERENCES Courses
);

CREATE TABLE topics_studies(
	courses serial REFERENCES courses
);
