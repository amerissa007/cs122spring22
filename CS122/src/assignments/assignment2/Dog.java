package assignments.assignment2;

public class Dog implements Speaker {
	public void speak() {
		System.out.println("WOOF WOOF!");
	}
	
	public void announce(String str) {
		str = "I pooped on the sidewalk.";
		System.out.println(str);
	}

}
