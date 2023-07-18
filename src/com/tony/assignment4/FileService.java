package com.tony.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class FileService {
	
	public Student[] readStudentData(String inputFile) {
	    Student[] students = new Student[100];

	        try (BufferedReader reader = new BufferedReader(new FileReader("student-master-list.csv"))) {
	            String line;
	
	            reader.readLine();
	            int i = 0;       	  
	            while ((line = reader.readLine()) != null) {
	            	
	                String[] fields = line.split(",");
	               
	                    Integer studentID = Integer.parseInt(fields[0]);
	                    String studentName = fields[1];
	                    String course = fields[2];
	                    Integer grade = Integer.parseInt(fields[3]);
	                     

	                    Student student = new Student(studentID, studentName, course, grade);
	               
	                    students[i] = student;
	                    i++;
	                    
	                 
	            }                       
	           
	            Arrays.sort(students);
	            
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        } 
	        
	        return students;	        	        
	        
	}  
	        	    
	public void writeToFile(String searchQuery, String outputFile, Student[] students) throws IOException {
		
		try(FileWriter writer = new FileWriter(outputFile)) {
			writer.write("Student ID,Student Name,Course,Grade \n");
			for (int i = 0; i < students.length; i++) {
				if (students[i].getCourse().contains(searchQuery)) {
				writer.write
				(students[i].getStudentID() + "," + students[i].getStudentName() + "," + students[i].getCourse() + "," + students[i].getGrade() + "\n");
				}
			} 
		
		}
		
	}
}
	

		