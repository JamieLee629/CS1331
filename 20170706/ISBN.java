//CONVENTION: Put all classes in separate files!

public class ISBN {
	//Not just a string, we want ISBN to be 4 three-random-digit parts separated by "-".
	private int part1;
	private int part2;
	private int part3;
	private int part4;


	public ISBN () {
		//constructor!
		this.part1 = (int)(Math.random()*889) + 111; // number between 111 and 999
		this.part2 = (int)(Math.random()*889) + 111;
		this.part3 = (int)(Math.random()*889) + 111;
		this.part4 = (int)(Math.random()*889) + 111;
		
		//We should probably provide getters and setters,
		//but if we don't want to ever set or get, we don't need to define
		//getters and setters.
	}
	public String toString() {
		return this.part1 + "-" + this.part2 + "-" + this.part3 + "-" + this.part4;
	}

		//ISBN is ISBN type, it is not of the String type.
	
}