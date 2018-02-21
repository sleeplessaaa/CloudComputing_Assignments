package org.lixing.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class StudentService {
	private Map<Integer, Student> students;
	private HashSet<String > courses;
	
	public StudentService() {
		students = new HashMap<>();
		
		Student s1 = new Student();
		s1.setName("Rose");
		s1.setStudentId(1);
		s1.setStudentImage("rose.jpg");
		s1.setProgramName("Information System");
		courses = new HashSet<String>();
		courses.add("Cloud Computing");
		courses.add("Smart Phone");
		s1.setCourses(courses);

		
		Student s2 = new Student();
		s2.setName("Lee");
		s2.setStudentId(2);
		s2.setStudentImage("Lee.jpg");
		s2.setProgramName("Information System");
		courses = new HashSet<String>();
		courses.add("Cloud Computing");
		courses.add("Data Science");
		s2.setCourses(courses);
		
		
		Student s3 = new Student();
		s3.setName("David");
		s3.setStudentId(3);
		s3.setStudentImage("David.jpg");
		s3.setProgramName("Computer Sience");
		courses = new HashSet<String>();
		courses.add("Maching Learning");
		courses.add("Algorithm");
		s3.setCourses(courses);
		
		students.put(s1.getStudentId(), s1);
		students.put(s2.getStudentId(), s2);
		students.put(s3.getStudentId(), s3);
	}
	
	public Collection<Student> getAllStudents(){
		return students.values();
	}
	
	
	public Student getStudent(int studentId) {
		for(Student s : students.values()) {
			if(s.getStudentId() == studentId) {
				return s;
			}	
		}
		return new Student();
	}
	
	public void addStudent(Student student) {
		students.put(student.getStudentId(), student);
	}
	public void updateStudent(Student student) {
		if(students.containsKey(student.getStudentId())) {
			students.put(student.getStudentId(), student);
			System.out.println("Students data updated");
		}
		students.put(student.getStudentId(), student);
		System.out.println("Students data created");		
	}
	
	public void removeStudent(Student student) {
		System.out.println(students.remove(student.getStudentId()));
	}	
	
}
