package com.tns.jpacrud.client;

import com.tns.jpacrud.entities.Student;
import com.tns.jpacrud.service.StudentService;
import com.tns.jpacrud.service.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		// Debug this program a Debug -->Debug as Java Application

		StudentService service = new StudentServiceImpl();

		Student student = new Student();

		// Create Operation
		student.setStudentId(100);
		student.setName("Nilesh");
		service.addStudent(student);

		// At this breakpoint, we have added one record to table
		// Retrieve Operation
		student = service.findStudentbyId(100);
		System.out.println("ID:" + student.getStudentId());
		System.out.println("Name:" + student.getName());

		// Update Operation
		student = service.findStudentbyId(100);
		student.setName("Nilesh Rathod");
		service.updateStudent(student);

		// At this breakpoint, we have updated record added in first section
		student = service.findStudentbyId(100);
		System.out.println("ID:" + student.getStudentId());
		System.out.println("Name:" + student.getName());

		// At this breakpoint, record is removed from table
		// Delete Operation
//		student = service.findStudentbyId(100);
//		service.removeStudent(student);
//		System.out.println("End of program / Life cycle completed.....");

	}
}
