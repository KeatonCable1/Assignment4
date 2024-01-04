package com.coderscampus;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
	
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
			Arrays.sort(course1List);
		}
		if (course2Count > 0) {
			Arrays.sort(course2List);
		}
		if (course3Count > 0) {
			Arrays.sort(course3List);
		}
	   
		
		writeToFile("course1.csv", course1List, course1Count);
        writeToFile("course2.csv", course2List, course2Count);
        writeToFile("course3.csv", course3List, course3Count);
	
	}

	public static String[] readStudentMasterList(String filename) {
		 String[] lines = new String[1000];
		
		 int lineCount = 0;
	

	  try (BufferedReader br = new BufferedReader(new FileReader("studentmasterlist.csv"))) {
          String line;
          while ((line = br.readLine()) != null) {
              lines[lineCount++] = line;
          }
      } catch (IOException e) {
          e.printStackTrace();
      }

  
      return Arrays.copyOf(lines, lineCount);
  }

  public static void writeToFile(String filename, String[] studentArray, int count) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
          writer.write("Student ID,Student Name,Course,Grade\n");
          for (int i = 0; i < count; i++) {
              writer.write(studentArray[i] + "\n");
          }
      } catch (IOException e) {
          e.printStackTrace();
      }
  }
}

	


	

