package com.tony.assignment4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileService {
	
	public Student[] readStudentData(String inputFile) {
	    Student[] students = new Student[100];


	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
	            String line;
	            // Skip the header line
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

	

	public void writeToFile(Student[] students, String searchQuery) throws IOException {
		
		FileWriter writer = new FileWriter(searchQuery);
		
		writer.write("Student ID, Student Name, Course,  Grade \n");
		
		
		
	}
}
		