package ikinciGunOdevi;


public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1, "C# + Angular Kursu", "2 ay sürecek yazýlým geliþtirici yetiþtirme kampý" , "Engin Demirog");
		Course course2 = new Course(1, "Java + React Kursu", "2 ay sürecek yazýlým geliþtirici yetiþtirme kampý" , "Engin Demirog");
		Course course3 = new Course(1, "Programlamaya Giriþ Ýçin Temel Kurs", "PYTHON,JAVA,C# gibi tüm programlama dilleri için temel programlama mantýðý anlaþýlýr" , "Engin Demirog");
		User user1 = new User(1, "Süleyman", "123456798","suleymanacikgoz3437@gmail.com");
		
		Course[] courses= {course1,course2,course3};
		
		for (Course course : courses) {
			System.out.println(course.name);
		
	}
		
		CourseManager courseManager=new CourseManager();
		courseManager.kursKayýt(course3,user1 );
		courseManager.kursSilme(course3, user1);
		
	}

}
