package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("S�leyman", "A��kg�z", "123456789", "123456");
		Instructor instructor = new Instructor("Engin Demirog","engirdemirdog@gmail.com","123456", "yaz�l�m geli�tirme kamp� (JAVA+React)");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.signIn(instructor);
		userManager.signIn(student1);
		
		instructorManager.addCourse(instructor);;
		studentManager.kayit(student1);	}

}
