package ucuncuGunOdev;

public class Student extends User {
	private String studentNumber;

	public Student(String name, String eMail, String password, String studentNumber) {
		super(name, eMail, password);
		this.studentNumber=studentNumber;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
