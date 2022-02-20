package compositionExample1;

public class Student {
	
	String studentName;
	int grade;	//representing in which grade does the student study
	
	public Student(String studentName, int grade) {
		this.studentName = studentName;
		this.grade = grade;
	}
	
	public String getStudentName() {
		return studentName;
	}
	public int getGrade() {
		return grade;
	}
	
	public void printStudentDetails() {
		System.out.println(studentName + " : Grade "+ grade);		
	}
	
	
}
