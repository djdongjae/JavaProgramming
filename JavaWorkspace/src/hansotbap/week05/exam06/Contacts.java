package hansotbap.week05.exam06;

public class Contacts {

	private String name;
	private String tel;
	private String email;
	static int count = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Contacts(String name, String tel, String email) {
		this.name = name;
		this.tel = tel;
		this.email = email;
		count++;
	}
	

}
