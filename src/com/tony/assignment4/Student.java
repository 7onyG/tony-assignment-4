package com.tony.assignment4;

public class Student implements Comparable<Student> {
	
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
		public int compareTo(Student o) {
			return this.grade.compareTo(o.grade);
		}
	}


