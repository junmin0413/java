package exam1013;

public class Student {
	//필드
	private String name;
	private String email;
	private String id;
	
	//생성자
	public Student() {}
	public Student(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
