package com.tns.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int StudentId;

	private String Name;

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		this.StudentId = studentId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

}
