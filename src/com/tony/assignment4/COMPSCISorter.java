package com.tony.assignment4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class COMPSCISorter {


	
	    public static void searchAndWriteToFile(String searchQuery, String inputFile, String outputFile) {
	        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
	             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

	            String line;
	            while ((line = reader.readLine()) != null) {
	                if (line.contains(searchQuery)) {
	                    writer.write(line);
	                    writer.newLine();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        String searchQuery = "COMPSCI";
	        String inputFile = "student-master-list.csv";
	        String outputFile = "course1.txt";

	        searchAndWriteToFile(searchQuery, inputFile, outputFile);

	        System.out.println("Search and write operation completed.");
	    }
	}

	
