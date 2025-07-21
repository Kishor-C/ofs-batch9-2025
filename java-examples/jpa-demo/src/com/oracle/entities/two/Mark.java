package com.oracle.entities.two;

import java.io.Serializable;
import jakarta.persistence.*;


/**
 * The persistent class for the MARKS database table.
 * 
 */
@Entity
@Table(name="MARKS")
@NamedQuery(name="Mark.findAll", query="SELECT m FROM Mark m")
public class Mark implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="MARKS_MARKSID_GENERATOR", sequenceName="MARKS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MARKS_MARKSID_GENERATOR")
	private long marksid;

	private double chemistry;

	private double maths;

	private double physics;

	//bi-directional many-to-one association to Student
	@ManyToOne
	@JoinColumn(name="ROLL_NO")
	private Student student;

	public Mark() {
	}

	public long getMarksid() {
		return this.marksid;
	}

	public void setMarksid(long marksid) {
		this.marksid = marksid;
	}

	public double getChemistry() {
		return this.chemistry;
	}

	public void setChemistry(double chemistry) {
		this.chemistry = chemistry;
	}

	public double getMaths() {
		return this.maths;
	}

	public void setMaths(double maths) {
		this.maths = maths;
	}

	public double getPhysics() {
		return this.physics;
	}

	public void setPhysics(double physics) {
		this.physics = physics;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Mark [marksid=" + marksid + ", chemistry=" + chemistry + ", maths=" + maths + ", physics=" + physics
				+ "]";
	}

}