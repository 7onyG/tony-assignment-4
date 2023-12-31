package com.tony.assignment4;

public class Student implements Comparable<Student> {
	
	    private String studentName;
	    private String course;
	    private Integer grade;
	    private Integer studentID;
	   
	    
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
			return "Student [Name = " + studentName + ", Course = " + course + ", ID = " + studentID
					+ ", Grade = " + grade + "]";
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
	    public Integer getStudentID() {
	    	return studentID;
	    }
		

		@Override
		public int compareTo(Student that) {
			
				 return that.grade.compareTo(this.grade);
				 
	}

}
