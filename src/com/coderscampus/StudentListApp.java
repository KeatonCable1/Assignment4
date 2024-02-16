package com.coderscampus;

public class StudentListApp {
    public static void main(String[] args) {
    	FileService fileservice = new FileService();
    	Student[] students = fileservice.getStudentsFromFile();
    	
    	StudentService studentService = new StudentService();
    	studentService.work(students);
    	
    	
    }
}
    