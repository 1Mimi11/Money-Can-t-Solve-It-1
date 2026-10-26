package pkg1;

public class Reggie {
public double money;
public Rod rodType;
public Bag bagType;

public Reggie() {
	this.money = 0.0;
	this.rodType = new Rod ("Basic Rod", 0.0);
	this.bagType = new Bag("Tiny Bag", 5, 0.0);
}

// Add money method
public void addMoney(double amount) {
	this.money += amount;
}

// Player stats method
public void playerStats() {
	System.out.println("\nPlayer Stats:");
	System.out.println("Money: $" + money);
	System.out.println("Fishing Rod: " + rodType.name);
	System.out.println("Bag Type: " + bagType.name + ", capacity: " + bagType.capacity + "\n\n");
}
	
}
