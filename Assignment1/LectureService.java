package org.lixing.demo2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LectureService {

		private Map<Integer, Lecture> lectures;
		
		
		public LectureService() {
			lectures = new HashMap<>();
			
			Lecture week1 = new Lecture();
			week1.setLectureId(1);
			week1.setAssignmentId(1);
			week1.setLectureNotes("Hello World");
			
			Lecture week2 = new Lecture();
			week2.setLectureId(2);
			week2.setAssignmentId(2);
			week2.setLectureNotes("Hello Jersey");
			
			Lecture week3 = new Lecture();
			week3.setLectureId(3);
			week3.setAssignmentId(3);
			week3.setLectureNotes("Hello Maven");
			
			lectures.put(week1.getLectureId(), week1);
			lectures.put(week2.getLectureId(), week2);
			lectures.put(week3.getLectureId(), week3);

		}
		
		public Collection<Lecture> getLectures(){
			return lectures.values();
		}
		
		
		public Lecture getLecture(int lectureId) {
			return lectures.get(lectureId);
		}
		
		public void addLecture(Lecture lecture) {
			lectures.put(lecture.getLectureId(), lecture);
		}
		
		public void updateLecture(Lecture lecture) {
			if(lectures.containsKey(lecture.getLectureId())) {
				lectures.put(lecture.getLectureId(), lecture);
			}
			lectures.put(lecture.getLectureId(), lecture);	
		}
		
		public void removeLecture(Lecture lecture) {
			lectures.remove(lecture.getLectureId());

		}	
		
}

