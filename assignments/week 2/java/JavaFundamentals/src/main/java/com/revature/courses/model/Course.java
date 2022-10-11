package com.revature.courses.model;

import java.util.Objects;

public class Course {

    private String courseNum;

    private String title;

   // private int teacherId;

    private Teacher teacher;

    public Course(String courseNum, String title, Teacher teacher) {
        this.courseNum = courseNum;
        this.title = title;
        this.teacher = teacher;
    }

    public Course() {
    }

    public String getCourseNum() {
        return courseNum;
    }

    public void setCourseNum(String courseNum) {
        this.courseNum = courseNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseNum='" + courseNum + '\'' +
                ", title='" + title + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseNum, course.courseNum) && Objects.equals(title, course.title) && Objects.equals(teacher, course.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseNum, title, teacher);
    }
}
