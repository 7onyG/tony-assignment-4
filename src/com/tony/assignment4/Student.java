package com.tony.assignment4;

public class Student implements Comparable<Student> {
	
	    private String studentName;
	    public String course;
	    private String grade;
	    private int studentID;
	    public int getStudentID()
	    {
			return studentID;
		}
	    
	    public Student() {
	    	
	    }

		public void setStudentID(int studentID) {
			this.studentID = studentID;
		}

		
		
	    public Student(int studentID, String studentName, String course, String grade) {
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

	    public String getGrade() {
	        return grade;
	    }

		@Override
		public int compareTo(Student that) {
			// TODO Auto-generated method stub
			return that.grade.compareTo(this.grade);
			
			
		}
	}


