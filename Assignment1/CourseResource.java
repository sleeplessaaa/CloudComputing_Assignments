package org.lixing.demo2;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class CourseResource {

	private static CourseService courses = new CourseService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Course> getAllCourses(){	
		return courses.getAllCourses();
	}
	
	@GET
	@Path("courseResource")
	@Produces(MediaType.APPLICATION_JSON)
	public Course getCourse(@QueryParam("courseId") String courseId){	
		return courses.getCourse(courseId);
	}
	
	@POST
	public Course createCourse(Course course) {
		courses.addCourse(course);
		return course;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Course putCourse(Course course) {
		courses.updateCourse(course);
		return course;
	}
	
	@DELETE
	public Course deleteCourse(Course course) {
		courses.removeCourse(course);
		return course;
	}
	
	@Path("lectures")
	public LectureResource getLecture() {
		return new LectureResource();
	}
}