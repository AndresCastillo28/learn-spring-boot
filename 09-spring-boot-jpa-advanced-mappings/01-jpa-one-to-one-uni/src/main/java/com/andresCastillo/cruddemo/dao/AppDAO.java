package com.andresCastillo.cruddemo.dao;

import com.andresCastillo.cruddemo.entity.Instructor;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
    
    void deleteInstructorById(int theId);

}
