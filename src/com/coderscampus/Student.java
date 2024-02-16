package com.coderscampus;

public class Student  implements Comparable<Student>{
	
	private Integer studentID;
	private String name;
	private String courseName;
	private Integer grade;
	
	
	
	
	public Student(int studentID, String name, String courseName, int grade) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.courseName = courseName;
		this.grade = grade;
	}
	public String toString() {
		return studentID + "," + name + "," + courseName + "," + grade;
		
	}
	
	
	
	
	public Integer getStudentID() {
		return studentID;
	}
	
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	public Integer getGrade() {
		return grade;
	}
	
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	
	
	
	
	
	public int compareTo(Student that) {
		
		if (that == null) {
			return 1;
			
		}
		if (this.grade > that.grade) {
			return -1;
		}
		else if (this.grade <that.grade) {
			return 1;
		}
		else if (this.grade == that.grade) {
			return 0;
		}
		return this.grade;
	}

}
