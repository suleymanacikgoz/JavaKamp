package ikinciGunOdevi;

public class CourseManager {
	public void kursKay�t(Course course,User user) {
		
		System.out.println("Tebrikler "+user.name+" "+course.name+" adl� kursa kayd�n tamamland�.");
	}
	
public void kursSilme(Course course,User user) {
		
		System.out.println(course.name+" adl� kursa olan kayd�n�z silinmi�tir.");
	}

}
