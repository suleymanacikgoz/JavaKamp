package ikinciGunOdevi;


public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# + Angular Kursu", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�" , "Engin Demirog");
		Course course2 = new Course(1, "Java + React Kursu", "2 ay s�recek yaz�l�m geli�tirici yeti�tirme kamp�" , "Engin Demirog");
		Course course3 = new Course(1, "Programlamaya Giri� ��in Temel Kurs", "PYTHON,JAVA,C# gibi t�m programlama dilleri i�in temel programlama mant��� anla��l�r" , "Engin Demirog");
		User user1 = new User(1, "S�leyman", "123456798","suleymanacikgoz3437@gmail.com");
		
		Course[] courses= {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		
	}
		
		CourseManager courseManager=new CourseManager();
		courseManager.kursKay�t(course3,user1 );
		courseManager.kursSilme(course3, user1);
		
	}

}
