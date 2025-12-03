package exam1105;

public class Course {
	private String courseName;
	private String instructor;
	private int credits;
	
	public Course() {
	}
	public Course(String courseName, String instructor, int credits) {
		this.courseName = courseName;
		this.instructor = instructor;
		this.credits = credits;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	void printCourseInfo() {
	    System.out.println("과목명: " + courseName);
	    System.out.println("강사명: " + instructor);
	    if (credits >= 0 && credits <= 6) {
	        System.out.println("학점: " + credits);
	    } else {
	        System.out.println("학점 오류");
	    }
	}

}
