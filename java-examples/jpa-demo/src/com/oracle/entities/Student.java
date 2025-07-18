package com.oracle.entities;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import java.util.Date;


/**
 * The persistent class for the STUDENT database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUDENT_ROLLNO_GENERATOR", 
	sequenceName="STUDENT_SEQ", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ROLLNO_GENERATOR")
	private int rollno;

	//@Temporal(TemporalType.DATE)
	private LocalDate dob; // make sure to remove & re-create getters
							// and setters, comment @Temporal

	private String name;

	public Student() {
	}

	public int getRollno() {
		return this.rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public LocalDate getDob() {
		return this.dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", dob=" + dob + ", name=" + name + "]";
	}
	

}