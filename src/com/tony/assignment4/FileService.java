package com.tony.assignment4;

import java.io.FileWriter;
import java.io.IOException;

public class FileService {
	

	public void writeToFile(Student[] students, String searchQuery) throws IOException {
		
		FileWriter writer = new FileWriter(searchQuery);
		
		writer.write("Student ID, Student Name, Course,  Grade \n");
		
		
		
	}
}
		