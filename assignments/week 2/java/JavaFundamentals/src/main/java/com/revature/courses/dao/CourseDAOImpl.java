package com.revature.courses.dao;

import com.revature.courses.model.Course;
import com.revature.courses.model.Teacher;
import com.revature.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class CourseDAOImpl implements CourseDAO{

    @Override
    public boolean createCourse(String courseNum, String title, Teacher teacher) {
        System.out.println("Course created");

        // Let's create a basic course object to store our results
        Course course = new Course();

        // We can start making our prepared statment
        try(Connection conn = ConnectionUtil.getConnection()){

            // Write out sql statement
            String sql = "INSERT INTO courses VALUES (?,?,?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set the values in the ?s
            stmt.setString(1, courseNum);
            stmt.setString(2, title);
            stmt.setInt(3, teacher.getTeacherId());

            // We'll look to count the number of updated rows
            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated == 1){
                return true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Unable to add course!");
        }
        return false;
    }

    @Override
    public List<Course> getAllCourse() {
        System.out.println("All courses pulled");
        return null;
    }

    @Override
    public List<Course> getCoursesByTeacherId(int id) {
        System.out.println("Found teacher");
        return null;
    }

    @Override
    public boolean updateCourse(Course course) {
        System.out.println("updated course");
        return false;
    }
}
