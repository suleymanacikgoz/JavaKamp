package ucuncuGunOdev;

public class User {
	
	private String name;
	private String eMail;
	private String password;
	
	public User(String name, String eMail, String password) {
		
		this.name = name;
		this.eMail = eMail;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
