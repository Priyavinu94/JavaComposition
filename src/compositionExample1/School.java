package compositionExample1;

public class School {

	String schoolName;

	Student[] students = new Student[5]; // declaring object reference of type Student as instance variable
											// of class School

	public School(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void giveAdmissionToSchool(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

//	public void setStudents(Student[] students) {
//		this.students = students;
//	}
//	
	public String checkStudentEnrollment(Student student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != (null) && students[i].equals(student)) {
				return "This student is enrolled in this school";
			}
		}
		return "This student is not enrolled in this School";
	}

	public String getStudentInfo(String studentName) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != (null) && students[i].getStudentName().equals(studentName)) {
				return students[i].getStudentName() + " is enrolled to Grade " + students[i].getGrade();
			}
		}
		return studentName + " is not enrolled in this School";
	}

	public void getAllStudents() {
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				students[i].printStudentDetails();
			}
		}
	}

}
