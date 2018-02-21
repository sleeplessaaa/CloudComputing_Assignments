package org.lixing.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CourseService {

	private Map<String, Course> courses;
	
	public CourseService() {
		courses = new HashMap<String, Course>();
		
		Map<Integer, String> roster = new HashMap<>();
		roster.put(1, "Rose");
		roster.put(2, "Melody");
		roster.put(3, "David");
		
		Map<Integer, Student> students = new HashMap<>();
		Student s1 = new Student();
		s1.setName("Rose");
		s1.setStudentId(1);
		s1.setStudentImage("Rose.jpg");
		s1.setProgramName("Information System");
		Student s2 = new Student();
		s2.setName("Lee");
		s2.setStudentId(2);
		s2.setStudentImage("Lee.jpg");
		s2.setProgramName("Information System");
		students.put(1, s1);
		students.put(2, s2);
		
		Map<Integer, Lecture> boards = new HashMap<>();
		Lecture week1 = new Lecture();
		week1.setLectureId(1);
		week1.setAssignmentId(1);
		week1.setLectureNotes("Hello World");
		boards.put(1, week1);
		
		Course course1 = new Course();
		course1.setCourseId("INFO9263");
		course1.setRoster(roster);
		course1.setEnrolledStudent(students);
		course1.setLectures(week1);
		course1.setBoard(boards);
		
		courses.put("INFO9263", course1);

	}
	
	public Collection<Course> getAllCourses(){
		return courses.values();
	}
	
	public Course getCourse(String id) {
		return courses.get(id);
	}
	
	public Course addCourse(Course course) {
		courses.put(course.getCourseId(), course);
		return course;
	}
	
	public Course updateCourse(Course course) {
		courses.put(course.getCourseId(), course);
		return course;
	}
	
	public Course removeCourse(Course course) {
		return courses.remove(course.getCourseId());
	}
}