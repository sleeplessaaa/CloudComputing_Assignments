package org.lixing.demo2;

import java.util.Map;


public class Course {

	private String courseId;
	private Map<Integer, String> roster;
	private Map<Integer, Student> enrolledStudent;
	private Lecture lectures;
	private Map<Integer, Lecture> board;
	
	public Course() {
		
	}
	
	public Course(String id, Map<Integer, String> roster, Map<Integer, Student> enrolledStudent, Lecture lectures, Map<Integer, Lecture> board) {
		this.courseId = id;
		this.roster = roster;
		this.enrolledStudent = enrolledStudent;
		this.lectures = lectures;
		this.board = board;
	}
	

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Map<Integer, String> getRoster() {
		return roster;
	}

	public void setRoster(Map<Integer, String> roster) {
		this.roster = roster;
	}

	public Map<Integer, Student> getEnrolledStudent() {
		return enrolledStudent;
	}

	public void setEnrolledStudent(Map<Integer, Student> enrolledStudent) {
		this.enrolledStudent = enrolledStudent;
	}

	public Lecture getLectures() {
		return lectures;
	}

	public void setLectures(Lecture lectures) {
		this.lectures = lectures;
	}

	public Map<Integer, Lecture> getBoard() {
		return board;
	}

	public void setBoard(Map<Integer, Lecture> board) {
		this.board = board;
	}
	
	
}