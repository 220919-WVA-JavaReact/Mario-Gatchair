package com.revature.courses;
import com .revature.courses.model.Teacher;
import com.revature.courses.service.TeacherService;

import java.util.Scanner;

public class App {

    // Inside of my App class is all of the information and logic to start and run the application
    // Menu logic

    //public static TeacherService ts = new TeacherService();

    public static void main(String[] args) {
        // In this app this will be the ONLY main method I have

        //Teachers teach = new Teachers(1, "Mario", "Gatchair","margat", "shin22");

        //Teachers teach1 = new Teachers(1, "Mario", "Gatchair","margat", "shin22");

        //tring teacher = teach.toString();

        //System.out.println(teacher);

        //System.out.println(teach == teach1);

        //System.out.println(teach.equals(teach1));



        /*
        Coming down here we can actually start the application with some sort of menu and loop
         */

        // We'll want to prompt the user to either login or register

        System.out.println("Press 1 to Login. Press 2 to register");
        TeacherService ts = new TeacherService();
        Scanner sc = new Scanner(System.in);

        String choice = sc.nextLine();

        //Now we use some control flow to map options to their choices

        if (choice.equals("1")) {
            //This is where we get login credentials

            // We need to get the username and password
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();

            // Just for testing let's print it out
            //System.out.println("Username: " + username + ", Password: " + password);

            //At this point we would call our TeacherService class to handle the logic for signing in!
        ts.login(username, password);

        } else if (choice.equals("2")) {
            // This where we get registration information
            System.out.println("Please enter your First Name");
            String first = sc.nextLine();
            System.out.println("Please enter your Last name");
            String last = sc.nextLine();
            System.out.println("Please enter your username");
            String username = sc.nextLine();
            System.out.println("Please enter your password");
            String password = sc.nextLine();

            // Now that we have all the information we need we can start talking to our TeacherService class to handle this info
        }
    }
}
