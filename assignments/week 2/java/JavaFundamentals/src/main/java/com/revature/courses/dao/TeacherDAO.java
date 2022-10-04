package com.revature.courses.dao;

import com.revature.courses.model.Teacher;

public interface TeacherDAO {

    // Inside here we are providing the basic requirement we want our DAO to have
    // THis will essentially be a list of methods that will be implemented for a specific kind of database

    // We could have these implemented for working with files or SQL database or whatever

    Teacher getByUsername(String username);

}
