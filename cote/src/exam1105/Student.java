package exam1105;

public class Student {
	private String name;
	private String email;
	private String id;
	
	public Student() {
	}
	public Student(String name, String email, String id) {
		this.name = name;
		this.email = email;
		this.id = id;
	}
	
	String sss(String name, String id) {
		System.out.println(name+id);
		return name;
	}
}
