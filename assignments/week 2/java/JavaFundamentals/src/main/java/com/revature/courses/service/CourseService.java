package com.revature.courses.service;

import com.revature.courses.dao.CourseDAO;
import com.revature.courses.dao.CourseDAOImpl;
import com.revature.courses.model.Course;
import com.revature.courses.model.Teacher;

import java.util.Scanner;

public class CourseService {

    //Inside this class we will create our menu logic for the course interactions and call upon the DAO to persist data

    Scanner sc = new Scanner(System.in);

    // To call upon the dao I need an instance here at the class level
    CourseDAO cd = new CourseDAOImpl();

    public void createCourse(Teacher teacher){
        //Menu logic to take in the user input
        System.out.println("Enter course Number (e.x. MTH2048): ");
        String courseNum = sc.nextLine();

        System.out.println("Enter course Title: ");
        String title = sc.nextLine();

        //System.out.println("Enter Teacher Id: ");
        //int teacherId = Integer.parseInt(sc.nextLine());

        // Call upon the DAO to make sure it is handled and persisted to the database
        boolean successful = cd.createCourse(courseNum,title,teacher);

        if (successful){
            System.out.println("You created a course!");
        } else {
            System.out.println("Something went wrong");
        }
    }

    // Let's work on assigning a course method but how do we assign a course without a teacher?
    // So we need a course at least by name, and we need to get some teacher info

    // So we need to refactor and store the logged in user information somewhere

    //Now that we stored our login info we can use it to assign ourselves a course

    public void assignCourse(int teacherId){

        System.out.println("Enter course Number (e.x. MTH2048): ");
        String courseNum = sc.nextLine();

        //Course enroll = new Course(courseNum, teacherId);

        // Now
        // Now
        cd.updateCourse(enroll);
    }

}
