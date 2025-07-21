package com.oracle.entities;

import java.io.Serializable;
import jakarta.persistence.*;
import java.math.BigDecimal;


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
	@SequenceGenerator(name="MARKS_MARKSID_GENERATOR", sequenceName="STUDENT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MARKS_MARKSID_GENERATOR")
	private long marksid;

	private BigDecimal chemistry;

	private BigDecimal maths;

	private BigDecimal physics;

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

	public BigDecimal getChemistry() {
		return this.chemistry;
	}

	public void setChemistry(BigDecimal chemistry) {
		this.chemistry = chemistry;
	}

	public BigDecimal getMaths() {
		return this.maths;
	}

	public void setMaths(BigDecimal maths) {
		this.maths = maths;
	}

	public BigDecimal getPhysics() {
		return this.physics;
	}

	public void setPhysics(BigDecimal physics) {
		this.physics = physics;
	}

	public Student getStudent() {
		return this.student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}