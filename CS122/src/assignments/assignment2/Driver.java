package assignments.assignment2;

public class Driver {

	public static void main(String[] args) {
		
		Speaker person = new Person();
		Speaker dog = new Dog();
		Speaker cat = new Cat();

		person.speak();
		person.announce(null);
		
		dog.speak();
		dog.announce(null);
		
		cat.speak();
		cat.announce(null);
	}

}
