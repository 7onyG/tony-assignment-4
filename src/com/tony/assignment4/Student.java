package com.tony.assignment4;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	    private String studentName;
	    private String course;
	    private Integer grade;
	    private Integer studentID;
	    public Integer getStudentID()
	    
	    {
			return studentID;
		}
	    
	    public Student() {
	    	
	    }

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		
		
	    public Student(Integer studentID, String studentName, String course, Integer grade) {
	    	this.studentID = studentID;
	        this.studentName = studentName;
	        this.course = course;
	        this.grade = grade;
	    }

	    @Override
		public String toString() {
			return "Student [studentName=" + studentName + ", course=" + course + ", studentID=" + studentID
					+ ", grade=" + grade + "]";
		}

		public String getStudentName() {
	        return studentName;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public Integer getGrade() {
	        return grade;
	    }


		@Override
		public int compare(Student o1, Student o2) {
			
			if (o1.grade == o2.grade) {
				
				return 0;
				
			} else if(o1.grade > o2.grade) {
				
				return -1;
				
			} else {
				
				return 1;
				
			}
			
		}
	}


