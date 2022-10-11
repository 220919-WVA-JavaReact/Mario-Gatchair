package com.revature.courses.model;

import java.util.Objects;

public class Teacher {

    // My fields should match what I have in the database with a similar datatype

    // We'll want to ENCAPSULATE these fields here to help better protect them faulty input or really whatever else
    private int  teacherId;

    private String first;

    private String last;

    private String username;

    private String password;


    public Teacher(int teacherId, String first, String last, String username, String password) {
        this.teacherId = teacherId;
        this.first = first;
        this.last = last;
        this.username = username;
        this.password = password;
    }

    public Teacher() {
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherId=" + teacherId +
                ", first='" + first + '\'' +
                ", last='" + last + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return teacherId == teacher.teacherId && Objects.equals(first, teacher.first) && Objects.equals(last, teacher.last) && Objects.equals(username, teacher.username) && Objects.equals(password, teacher.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherId, first, last, username, password);
    }
}
