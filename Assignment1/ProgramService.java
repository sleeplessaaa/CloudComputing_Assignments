package org.lixing.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProgramService {

	private Map<String, Program> Programs;
	
	public ProgramService(){
		Programs = new HashMap<String, Program>();
		
		Program program1 = new Program();
		program1.setProgramName("Information System");
		
		Program program2 = new Program();
		program2.setProgramName("Computer Science");
		
		Programs.put(program1.getProgramName(), program1);
		Programs.put(program2.getProgramName(), program2);
	}
	
	public Collection<Program> getPrograms(){
		return Programs.values();
	}
	public Program getProgram(String programName) {
		return Programs.get(programName);
	}
}

