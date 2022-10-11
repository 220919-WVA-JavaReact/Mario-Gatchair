package com.revature.courses.dao;

import com.revature.courses.model.Teacher;
import com.revature.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TeacherDAOImplPostgres implements TeacherDAO{
    @Override
    public Teacher getByUsername(String username) {
        //To get by username we are going to use a prepared statement to help us prevent against SQL injection

        //Let's first create a teacher object to store the information I pull back

        Teacher teach  = new Teacher();

        // I'm going to use a try-with-resources block to make sure I close my connection once done
        try (Connection conn = ConnectionUtil.getConnection()){
            // Let's write the SQL statment we want to use to get our Teacher back
            String sql = "SELECT * FROM teachers where username = ?";
            // I put a ? anywhere I want to enter information

            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set the individual values for the ?s
            stmt.setString(1, username);

            // Things are slightly different for receiving one value vs a whole set of values
            ResultSet rs;

            // Since I'm only expecting one result I will handle it slightly different
            if ((rs = stmt.executeQuery()) != null){
                // If the resultset is NOT BLANK we found our user

                // Move the cursor forward
                rs.next();

                // Now we can pull the information out and store it in the teacher object


                int id = rs.getInt("teacher_id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String password = rs.getString("password");

                // Now that I have my fields we create a teacher object
                teach = new Teacher(id,first,last,username,password);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teach;
    }

    @Override
    public Teacher createTeacher(String first, String last, String username, String password) {

        Teacher teacher = new Teacher();

        try(Connection conn = ConnectionUtil.getConnection()){

            String sql = "INSERT INTO teachers (first, last, username, password) VALUES (?,?,?,?) RETURNING *";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, first);
            stmt.setString(2, last);
            stmt.setString(3, username);
            stmt.setString(4, password);

            ResultSet rs;

            if ((rs = stmt.executeQuery()) != null) {

                rs.next();

                int id = rs.getInt("teacher_id");
                String receivedFirst = rs.getString("first");
                String receivedLast = rs.getString("last");
                String receivedUsername = rs.getString("username");
                String receivedPassword = rs.getString("password");

                teacher = new Teacher(id, receivedFirst, receivedLast, receivedUsername, receivedPassword);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Couldn't register user to the database");
        }
        return teacher;
    }

    @Override
    public List<Teacher> getAllTeachers() {

        // We'll start here with this method to execute a simple query to get ALL of the teachers back
        // SQL statement = "SELECT * FROM teachers"

        // Create a connection object
        Connection conn = ConnectionUtil.getConnection();

        // To store all of our teachers, I plan to create an empty list of teachers and I will store the info inside it
        List<Teacher> teachers = new ArrayList<>();

        // Create a statment
        try {
            Statement stmt = conn.createStatement();
            // My Logic should go inside here
            String sql = "SELECT * FROM teachers";

            // Run the statement
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()){

                int id = rs.getInt("teacher_id");
                String first = rs.getString("first");
                String last = rs.getString("last");
                String username = rs.getString("username");
                String password = rs.getString("password");

                // Create a teacher object every loop to store the info
                Teacher teach = new Teacher(id, first, last, username, password);

                // Add the resulting item to the list of teachers
                teachers.add(teach);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return teachers;
    }
}
