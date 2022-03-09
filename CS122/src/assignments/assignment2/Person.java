package assignments.assignment2;

public class Person implements Speaker {
	public void speak() {
		System.out.println("Hello!");
	}
	
	public void announce(String str) {
		str = "My name is Amer.";
		System.out.println(str);
	}

}
