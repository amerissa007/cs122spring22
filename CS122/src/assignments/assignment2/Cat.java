package assignments.assignment2;

public class Cat implements Speaker{
	public void speak() {
		System.out.println("Meow.");
	}
	
	public void announce(String str) {
		str = "I am hungry.";
		System.out.println(str);
	}

	

}
