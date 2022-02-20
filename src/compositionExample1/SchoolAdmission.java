package compositionExample1;

public class SchoolAdmission {

	public static void main(String[] args) {

		School school = new School("AEMHSS");

		Student student1 = new Student("Remya", 8);
		Student student2 = new Student("Hari", 9);
		Student student3 = new Student("Aami", 10);
		Student student4 = new Student("Surya", 11);

		school.giveAdmissionToSchool(student1);
		school.giveAdmissionToSchool(student2);
		school.giveAdmissionToSchool(student3);
		// school.giveAdmissionToSchool(student4);

		System.out.println("The New admissions in " + school.getSchoolName() + " are :");
		school.getAllStudents(); // Prints all the students enrolled into the school

		// Pass by reference - Checking if a student is enrolled in the school by
		// passing student object as input parameter
		System.out.println("\nChecking if a student is enrolled in the school :");
		System.out.println("Student3 : " + school.checkStudentEnrollment(student3));
		System.out.println("Student4 : " + school.checkStudentEnrollment(student4));

		// Pass by value - retrieving the information of a student by taking name as
		// input argument
		System.out.println("\nProvides information of a student, by asking student name :");
		System.out.println(school.getStudentInfo("Hari"));
		System.out.println(school.getStudentInfo("Priya"));

	}

}
