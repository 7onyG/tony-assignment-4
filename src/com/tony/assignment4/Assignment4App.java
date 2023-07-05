package com.tony.assignment4;

import java.io.*;
import java.util.*;

public class Assignment4App {
    public static void main(String[] args) throws IOException {
    	
    FileService fileService = new FileService();	
    	
    String searchQuery = "COMPSCI";
    String inputFile = "student-master-list.csv";
    String outputFile = "course1.txt";

    fileService.writeToFile(searchQuery, inputFile, outputFile);

    	
        // Read the student data from the input CSV file
        Student[] students = fileService.readStudentData(inputFile);
        System.out.println(Arrays.toString(students));
        

    }

}



    


