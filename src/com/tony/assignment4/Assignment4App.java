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
    
    String searchQuery1 = "APMTH";
    String inputFile1 = "student-master-list.csv";
    String outputFile1 = "course2.txt";

    fileService.writeToFile(searchQuery1, inputFile1, outputFile1);
    
    String searchQuery2 = "STAT";
    String inputFile2 = "student-master-list.csv";
    String outputFile2 = "course3.txt";

    fileService.writeToFile(searchQuery2, inputFile2, outputFile2);
    
    //Please be patient
    //Might need to run app a couple times

    	
        Student[] students = fileService.readStudentData(inputFile);
        System.out.println(Arrays.toString(students));
        
        //Making sure it works
        

    }

}



    


