
public class LogManager {
	public void Log(int logType) {
		if(logType==1) {
			System.out.println("Veritaban�na logland�");
		}else if(logType==2) {
			System.out.println("Dosyaya logland�");
		}else if(logType==3) {
			System.out.println("Emaile logland�");
		}
	
		
	}

}
//1 - Database
//2 - File 
//3 - Email
