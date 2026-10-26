package pkg1;

public class Fish {
	public String name;
	public double price;

	public Fish(String name, double price) {
		this.name = name;
		this.price = price;
					
}
	
	@Override
	public String toString() {
		return name;
	} 
}
