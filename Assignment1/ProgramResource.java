package org.lixing.demo2;

import java.util.Collection;
import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("programs")
public class ProgramResource {

	private static ProgramService programs = new ProgramService();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Collection<Program> get(){
		System.out.println("get");
		return programs.getPrograms();
	}
	
	@GET
	@Path("programResource")
	@Produces(MediaType.APPLICATION_JSON)
	public Program getProgram(@QueryParam("ProgramName") String programName ){	
		return programs.getProgram(programName);
	}

	
	@Path("InformationSystem/Course")
	public CourseResource getCourseList() {
		 return new CourseResource();
	}

	@Path("student")
	public StudentResource getAllStudent() {
		return new StudentResource();
	}
	
	
}
