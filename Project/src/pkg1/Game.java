package pkg1;
import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		String choice;
		Scanner inputDevice = new Scanner(System.in);
		Random random = new Random();
		
		//Fish and their Chances
		String [] fish = {"Your line snapped!", "Cod", "Trout", "Salmon"};
		double [] fishChance = {20.0, 45.0, 25.0, 10.0};
		double randomValue = random.nextDouble() * 100;
		double catchChance = 0;
		String caughtFish = null;
		
		//Work on the system for calculating a trips total value
		//Create a fish vendor to sell to



	 //Process of Fishing: You 'throw' the rod, and catch a fish based on your rod type, or catch no fish at all
		System.out.println("Enter 'catch' to catch a fish.");
		choice = inputDevice.nextLine();

		if (choice.equals("catch")) {
			for (int i = 0; i < fish.length; i++) {
				catchChance += fishChance[i];
				if (randomValue > fishChance [0] && randomValue < catchChance) {
					caughtFish = fish[i];
					System.out.println("You caught a " + caughtFish + "!");
					break;
				} else if (randomValue < fishChance [0]) {
					System.out.println("Your line snapped!");
					break;
					} 
			} 
			if (caughtFish == null && randomValue >= fishChance [0]) {
				System.out.println("No fish took the bait. :<");
			}
		}	else {
			System.out.println("Throw your line to catch fish you can sell to the vendor!");
		}	
	
		
	}
}