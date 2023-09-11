package com.andresCastillo.cruddemo.dao;

import com.andresCastillo.cruddemo.entity.Course;
import com.andresCastillo.cruddemo.entity.Instructor;
import com.andresCastillo.cruddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
    
    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theID);

    void deleteIntructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);

    Instructor findIntructorByIdJoinFetch(int theId);

    void update(Instructor tempIntructor);

    void update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);

}
