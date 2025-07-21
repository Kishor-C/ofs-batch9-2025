package com.oracle.entities.two;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the STUDENT database table.
 * 
 */
@Entity
@NamedQuery(name="Student.findAll", query="SELECT s FROM Student s")
public class Student implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="STUDENT_ROLLNO_GENERATOR", sequenceName="STUDENT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENT_ROLLNO_GENERATOR")
	private int rollno;

	//@Temporal(TemporalType.DATE)
	private LocalDate dob;

	private String name;

	//bi-directional many-to-one association to Mark
	@OneToMany(mappedBy="student", fetch = FetchType.EAGER)
	private List<Mark> marks;

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

	public List<Mark> getMarks() {
		return this.marks;
	}

	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}

	public Mark addMark(Mark mark) {
		getMarks().add(mark);
		mark.setStudent(this);

		return mark;
	}

	public Mark removeMark(Mark mark) {
		getMarks().remove(mark);
		mark.setStudent(null);

		return mark;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", dob=" + dob + ", name=" + name + ", marks=" + marks + "]";
	}

}