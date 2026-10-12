package pkg1;
import java.util.Scanner;
import java.util.Random;
import java.util.function.Function;


//Work on the system for calculating a trips total value
//Create a fish vendor to sell to

public class Game {
	public static void main(String[] args) {
		String choice;
		Scanner inputDevice = new Scanner(System.in);
		Random random = new Random();
		
		//Fish and their Chances
		String [] fish = {"Your line snapped!", "Cod", "Trout", "Salmon"};
		double [] fishChance = {20.0, 45.0, 25.0, 10.0};
		
		
		
		 //Process of Fishing: You 'throw' the rod, and catch a fish based on your rod type, or catch no fish at all
		//Fishing function that returns string message
		double randomValue = random.nextDouble() * 100;
		double catchChance = 0;
		String caughtFish = null;
		

		//System.out.println("Enter 'catch' to catch a fish.");
		//choice = inputDevice.nextLine();

		if (cmd.equals("catch")) {
			for (int i = 0; i < fish.length; i++) {
				catchChance += fishChance[i];
				if (randomValue > fishChance [0] && randomValue < catchChance) {
					caughtFish = fish[i];
					return "You caught a " + caughtFish + "!";
					}
			}
				 if (randomValue < fishChance [0]) {
					return "Your line snapped!";
					}else{
			if (caughtFish == null && randomValue >= fishChance [0]) {
				return "No fish took the bait. :<";
			}else{
			return"Throw your line to catch fish you can sell to the vendor!";
			}
					}
		}
		
	}
}