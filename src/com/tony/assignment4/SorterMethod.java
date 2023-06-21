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

//    private static Student[] groupStudentsByCourse (Student[] students) {
//        Student[] studentsByCourse = new Student[100]

//        for (Student student : students) {
//            String course = student.getCourse();
//           Student[] courseStudents = studentsByCourse.getOrDefault(course, new ArrayList<>());
//            courseStudents.add(student);
//            studentsByCourse.put(course, courseStudents);
//        }
//
//        return studentsByCourse;
//    }

//    private static void writeStudentsToCSV(Map<String, List<Student>> studentsByCourse) {
//    	
//    	Student student = new Student();
//    	
//        for (String course : studentsByCourse.keySet()) {
//            Student[]students = studentsByCourse.get(course);
//
//            // Sort students by grade in descending order
////            students.sort(Comparator.comparingInt(Student::getGrade).reversed());
//            
//
//            // Create the output CSV file for the current course
//            String outputFilename = "course" + student.getStudentID() + ".csv";
//
//            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilename))) {
//                // Write the header line
//                writer.write("Student Name,Grade\n");
//
//                // Write the sorted students to the CSV file
//                for (Student stu : students) {
//                    writer.write(stu.getStudentName() + "," + stu.getGrade() + "\n");
//                }
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}


    
}

