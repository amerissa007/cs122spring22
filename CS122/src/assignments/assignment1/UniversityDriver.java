package assignments.assignment1;

public class UniversityDriver {

	public static void main(String[] args) {
		
		Student student = new Student("Amer", "123 street", "718-718-7181", "amer@email.com", "Freshman");
		System.out.println(student);
		Person person = new Person("John", "456 Street", "929-424-9242", "jonh@email.com");
		System.out.println(person);
		Employee employee = new Employee("Brandon", "789 Street", "347-347-7434", "brandon@email.com", "404", 30,
				"2/18/22");
		System.out.println(employee);
		Faculty faculty = new Faculty("Jake", "321 street", "646-646-4564", "jake@email.com", "400", 34, "2/17/22",
				"5 - 7", "rank");
		System.out.println(faculty);
		Staff staff = new Staff("Liam", "654 street", "718-347-9290", "liam@email.com", "500", 341, "2/16/22",
				"Principal");
		System.out.println(staff);
	}
}
	

