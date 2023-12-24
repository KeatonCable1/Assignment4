package com.coderscampus;

	import java.io.FileReader;
	
public class Assignment4 {

	public static void main(String[] args) {
		
		String[] lines = readStudentMasterList("studentmasterlist.csv");
		
		String[] course1List = new String[lines.length];
		String[] course2List = new String[lines.length];
		String[] course3List = new String[lines.length];
		
		int course1Count = 0;
		int course2Count = 0;
		int course3Count = 0;
		
		for (String line : lines) {
			String[] data = line.split(",");
			String course = data[2];
			
			if (course.startsWith("COMPSCI")) {
				course1List[course1Count++] = line;
			} else if (course.startsWith("APMTH")) {
				course2List[course2Count++] = line;
			} else if (course.startsWith("STAT")) {
				course3List[course3Count++] = line;
			}
		}
		
		if (course1Count > 0) {
			sortArrayByGrade(course1List, course1Count);
		}
		if (course2Count > 0) {
			sortArrayByGrade(course2List, course2Count);
		}
		if (course3Count > 0) {
			sortArrayByGrade(course3List, course3Count);
		}
		
	}

	private static void sortArrayByGrade(String[] studentArray, int count) {
		
		
	}

	


	
}
