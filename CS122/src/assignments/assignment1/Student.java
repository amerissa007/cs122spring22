package assignments.assignment1;

public class Student extends Person {
	public static final String freshman = "Freshman";
	public static final String sophomore = "Sophomore";
	public static final String junior = "Junior";
	public static final String senior = "Senior";
	public String status;

	public Student(String name, String address, String phone, String email, String status) {
		super(name, address, phone, email);
		this.status = status;
	}

	public String toString() {
		return "Name: " + this.name + " Class: Student";
	}

}