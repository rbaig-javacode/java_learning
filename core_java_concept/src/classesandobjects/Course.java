package classesandobjects;

public class Course {
	
	String courseName;
	
	int enrollments;
	
	static int maxCapacity =100;
	
	String[] enrollStudents;
	
	static void setMaxCapacity(int maxCapacity) {
		Course.maxCapacity = maxCapacity;
    }
	
	void enrollStudent(String studentName) {
		enrollStudents[enrollments] = studentName;
		enrollments++;
	}
	
	

	public Course(String courseName) {
		this.courseName = courseName;
		this.enrollments = 0;
		this.enrollStudents = new String[maxCapacity];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
