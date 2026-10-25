package pkg1;

public class Reggie {
public double money;
public String rodType;
public String bagType;

public Reggie() {
	this.money = 0.0;
	this.rodType = "Basic Rod";
	this.bagType = "Tiny Bag";
}

// Add money method
public void addMoney(double amount) {
	this.money += amount;
}

// Player stats method
public void playerStats() {
	System.out.println("\nPlayer Stats:");
	System.out.println("Money: $" + money);
	System.out.println("Fishing Rod: " + rodType);
	System.out.println("Bag Type: " + bagType + "\n\n");
}
	
}
