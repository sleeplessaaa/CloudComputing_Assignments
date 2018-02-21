package org.lixing.demo2;

import java.util.*;


public class Student {
	private String StudentName;
	private int StudentId;
	private String StudentImage; 
	private String ProgramName;
	private HashSet<String> Courses;
	
	public String getProgramName() {
		return ProgramName;
	}
	
	public void setProgramName(String programName) {
		ProgramName = programName;
	}
	
	public HashSet<String> getCourses() {
		return Courses;
	}
	
	public void setCourses(HashSet<String> courses) {
		Courses = courses;
	}
	
	public String getStudentImage() {
		return StudentImage;
	}
	
	public void setStudentImage(String url) {
		StudentImage = url;
	}
	
	public String getName() {
		return StudentName;
	}
	
	public void setName(String name) {
		StudentName = name;
	}
	
	public int getStudentId() {
		return StudentId;
	}
	
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	
}
