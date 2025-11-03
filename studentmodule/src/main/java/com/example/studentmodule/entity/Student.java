package com.example.studentmodule.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Long roll;
    private String qualification;
    private String course;
    private int year;
    private Long hallTicketNo;

    private String collegeName;
    private String certificateName;

  
    public Student() {}

    public Student(Long id, String name, Long roll, String qualification, String course, int year, Long hallTicketNo, String collegeName, String certificateName) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.qualification = qualification;
        this.course = course;
        this.year = year;
        this.hallTicketNo = hallTicketNo;
        this.collegeName = collegeName;
        this.certificateName = certificateName;
    }

    // Getters and Setters
    public Long getId() {
    	return id;
    	}
    public void setId(Long id) {
    	this.id = id;
    	}

    public String getName() {
    	return name;
    	}
    public void setName(String name) {
    	this.name = name;
    	}

    public Long getRoll() {
    	return roll;
    	}
    public void setRoll(Long roll) {
    	this.roll = roll;
    	}

    public String getQualification() {
    	return qualification;
    	}
    public void setQualification(String qualification) {
    	this.qualification = qualification;
    	}

    public String getCourse() {
    	return course;
    	}
    public void setCourse(String course) {
    	this.course = course;
    	}

    public int getYear() {
    	return year;
    	}
    public void setYear(int year) {
    	this.year = year;
    	}

    public Long getHallTicketNo() {
    	return hallTicketNo;
    	}
    public void setHallTicketNo(Long hallTicketNo) {
    	this.hallTicketNo = hallTicketNo;
    	}

    public String getCollegeName() {
    	return collegeName;
    	}
    public void setCollegeName(String collegeName) {
    	this.collegeName = collegeName;
    	}

    public String getCertificateName() {
    	return certificateName; }
    public void setCertificateName(String certificateName) {
    	this.certificateName = certificateName;
    	}
}

