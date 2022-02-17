package classSamples.polymorphism.SearchingAndSorting;

public class Sports implements Comparable<Sports>{
	private final String name;
	private final int players;
	
	//create a constructor initializing name and players
	public Sports(String name, int players) {
		this.name = name;
		this.players = players;
	}
	//create getter methods for name and players
	public String getName() {
		return name;
	}
	
	public int getPlayers() {
		return players;
	}
	//create a toString method
	public String toString() {
		return name + " -- " + players;
	}
	
	//override equals method
	public boolean equals(Object other) {
		return name.equals(((Sports) other) .getName());
		
	}
	
	//finish overriding compareTo method
	@Override
	public int compareTo(Sports o) {
		return 0;
		
		
		
	}
}
