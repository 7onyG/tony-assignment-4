package com.tony.assignment4;

import java.io.*;
import java.util.*;

public class Assignment4App {
    public static void main(String[] args) throws IOException {
    	
    FileService fileService = new FileService();	
        	
    String inputFile = "student-master-list.csv";
    String searchQuery = "COMPSCI";  
    String outputFile = "course1.csv";
    Student[] students = new Student[100];
 	students = fileService.readStudentData(inputFile);

    fileService.writeToFile(searchQuery, outputFile, students);
    
    String searchQuery1 = "APMTH";
    String outputFile1 = "course2.csv";

    fileService.writeToFile(searchQuery1, outputFile1, students);
    
    String searchQuery2 = "STAT";
    String outputFile2 = "course3.csv";

    fileService.writeToFile(searchQuery2, outputFile2, students);   
        System.out.println(Arrays.toString(students));
        
    }
}


    


