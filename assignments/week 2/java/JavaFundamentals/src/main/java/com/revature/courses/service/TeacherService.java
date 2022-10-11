package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.dao.TeacherDAOImplPostgres;
import com.revature.courses.model.Teacher;

import java.util.List;
import java.util.Scanner;

public class TeacherService {

    // So the role of this class is to provide the logic for options and eventually call upon the DAO to persist the
    //information we request

    // We have logic for logging in and registering so we should have methods to handle that

    // Whenever we want to make a call to the database we need to provide a TeacherDao implementaion so I'll create
    // one at the class level
    TeacherDAO td = new TeacherDAOImplPostgres(); // <--- Can change the implementation whenever I want
    Scanner sc = new Scanner(System.in);
    //Need to add in a new scanner
    public Teacher login(){
        // The object of this method is to call upon the DAO to get the account associate with out username, then
        // We'lll verify the password and "log" the user in
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();
        // Step 1.
        // Call the database and find info based off the submitted username
        Teacher teach = td.getByUsername(username);


        // Step 2
        // Check the returned password of the username and verify it matches the entered password
        if (teach.getPassword().equals(password)){
            System.out.println("Congratulations after everything you've been logged in!");
            System.out.println(teach);

            //we need to refactor and be able to store the user in the main class

            return teach;
        } else{
            System.out.println("Invalid Login");

            return null;
        }
    }

    public Teacher register(){
        System.out.println("Please enter your First Name");
        String first = sc.nextLine();
        System.out.println("Please enter your Last name");
        String last = sc.nextLine();
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();

        Teacher teacher = td.createTeacher(first,last,username,password);
        return teacher;
    }

    public void getAllTeachers(){
        System.out.println("Using the database to return all of our teacher objects");

        List<Teacher> teacherList = td.getAllTeachers();

        for(Teacher teacher: teacherList){
            System.out.println(teacher);
        }

    }
}
