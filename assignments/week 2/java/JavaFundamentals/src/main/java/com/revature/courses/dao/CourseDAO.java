package com.revature.courses.dao;

import com.revature.courses.model.Course;
import com.revature.courses.model.Teacher;

import java.util.List;

public interface CourseDAO {

    // This is where I define the methods I want the dao to use to interacte with some database

    //Create a course method

    boolean createCourse(String courseNum, String title, Teacher teacher);

    //Read a course methods
    // To read all the information, we don't necessarly need to take in any arguements to perform this action
    List<Course> getAllCourse();

    // Let's add an extra method just in case we want it, which will be a get course by teacher
    List<Course> getCoursesByTeacherId(int id);

    //Update some course
    // So we probably want ot send in a course object, and have it update based off the values
    boolean updateCourse(Course course);
}
