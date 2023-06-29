package com.tony.assignment4;

import java.io.*;
import java.util.*;

public class Assignment4App {
    public static void main(String[] args) throws IOException {
    	
    FileService fileService = new FileService();	
    	
    	
        String inputFile = "student-master-list.csv";
        SorterMethod sorterMethod = new SorterMethod();
        // Read the student data from the input CSV file
        Student[] students = sorterMethod.readStudentData(inputFile);
        System.out.println(Arrays.toString(students));
        
        fileService.writeToFile(students, inputFile);
        

    }
}



    


