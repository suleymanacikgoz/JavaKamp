package ucuncuGunOdev;

public class Instructor extends User {
	
	private String courseName;

	public Instructor(String name, String eMail, String password, String courseName) {
		super(name, eMail, password);
		this.courseName=courseName;
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	

}
