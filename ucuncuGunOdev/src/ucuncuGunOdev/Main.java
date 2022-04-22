package ucuncuGunOdev;

public class Main {

	public static void main(String[] args) {
		Student student1 = new Student("Süleyman", "Açıkgöz", "123456789", "123456");
		Instructor instructor = new Instructor("Engin Demirog","engirdemirdog@gmail.com","123456", "yazılım geliştirme kampı (JAVA+React)");
		
		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		userManager.signIn(instructor);
		userManager.signIn(student1);
		
		instructorManager.addCourse(instructor);;
		studentManager.kayit(student1);	}

}
