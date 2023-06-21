package com.tony.assignment4;

import java.io.*;
import java.util.*;

public class SorterMethod implements Comparable<Student>{
    public static void main(String[] args) {
        String inputFile = "student-master-list.csv";

        // Read the student data from the input CSV file
        Student[] students = readStudentData(inputFile);
        

        // Group students by course
        Student[] studentsByCourse = groupStudentsByCourse(students);

        // Sort and write students to separate CSV files for each course
        writeStudentsToCSV(studentsByCourse);
    }

    private static Student[] groupStudentsByCourse(Student[] students) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void writeStudentsToCSV(Student[] studentsByCourse) {
		// TODO Auto-generated method stub
		
	}

	private static Student[] readStudentData(String inputFile) {
       Student[] students = new Student[100];

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            // Skip the header line
            reader.readLine();
            
            int i = 0;
            
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
//               System.out.println(Arrays.toString(fields));

               
                    int studentID = Integer.parseInt(fields[0]);
                    String studentName = fields[1];
                    String course = fields[2];
                    String grade = (fields[3]);
                     

                    Student student = new Student(studentID, studentName, course, grade);
                    
                    students[i] = student;
                    i++;
                   
//                    Arrays.sort(students);
                    
                    System.out.println(fields[2]);
                   
                
            }
            
            Arrays.sort(students);
            
            for (int j = 0; j < students.length; j++){
            	System.out.println(students[j]);
            }
            
            return students;
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return students;
        
 
    
        
    }

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


    
}

