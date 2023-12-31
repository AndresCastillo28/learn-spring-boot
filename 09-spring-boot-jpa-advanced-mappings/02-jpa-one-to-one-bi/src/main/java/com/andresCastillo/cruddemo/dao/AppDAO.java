package com.andresCastillo.cruddemo.dao;

import com.andresCastillo.cruddemo.entity.Instructor;
import com.andresCastillo.cruddemo.entity.InstructorDetail;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
    
    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theID);

    void deleteIntructorDetailById(int theId);

}
