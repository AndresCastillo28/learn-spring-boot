package com.andresCastillo.cruddemo;

import com.andresCastillo.cruddemo.dao.AppDAO;
import com.andresCastillo.cruddemo.entity.Instructor;
import com.andresCastillo.cruddemo.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			// creataInstructor(appDAO);

			//findInstructor(appDAO);

			// deleteInstructor(appDAO);

			// findInstructorDetail(appDAO);

			deleteInstructorDetail(appDAO);
		};
	}

	private void deleteInstructorDetail(AppDAO appDAO) {

		int theId = 2;
		System.out.println("Deleting instructor detail id: " + theId);

		appDAO.deleteIntructorDetailById(theId);

		System.out.println("Done!");
	}

	private void findInstructorDetail(AppDAO appDAO) {

		// get the instructor detail object
		int theId = 2;
		InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);

		// print the instructor detail
		System.out.println("tempInstructorDetail: " + tempInstructorDetail);

		// print the associted instructor
		System.out.println("the associated instructor: " + tempInstructorDetail.getInstructor());

		System.out.println("Done!");
	}

	private void deleteInstructor(AppDAO appDAO) {
		int theId = 1;
		System.out.println("Deleting instructor id: " + theId);

		appDAO.deleteInstructorById(theId);

		System.out.println("Done!");
	}

	private void findInstructor(AppDAO appDAO) {

		int theId = 2;
		System.out.println("Finding instrcutor id: " + theId);

		Instructor tempInstructor = appDAO.findInstructorById(theId);

		System.out.println("tempInstructor: " + tempInstructor);
		System.out.println("the associate instructor only: " + tempInstructor.getInstructorDetail());
	}

	private void creataInstructor(AppDAO appDAO) {

		/*
		// create the instructor
		Instructor tempInstructor =
				new Instructor("Chad", "Darby", "darby@gogle.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.andres.castillo/youtube",
				"Soccer!!");
		*/
		// create the instructor
		Instructor tempInstructor =
				new Instructor("Madhu", "Patel", "madhu@gogle.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail = new InstructorDetail(
				"http://www.andres.castillo/youtube",
				"Guitar!!");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		//
		// NOTE: this will ALSO save the details object
		// because of CascadeType.ALL
		//
		System.out.println("Saving instructor " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");

	}
}
