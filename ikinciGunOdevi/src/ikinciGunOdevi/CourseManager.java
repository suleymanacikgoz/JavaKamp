package ikinciGunOdevi;

public class CourseManager {
	public void kursKayıt(Course course,User user) {
		
		System.out.println("Tebrikler "+user.name+" "+course.name+" adlı kursa kaydın tamamlandı.");
	}
	
public void kursSilme(Course course,User user) {
		
		System.out.println(course.name+" adlı kursa olan kaydınız silinmiştir.");
	}

}
