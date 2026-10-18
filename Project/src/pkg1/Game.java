package pkg1;
import java.util.Scanner;
import java.util.Random;
import java.util.function.Function;


//Work on the system for calculating a trips total value
//Create a fish vendor to sell to
//Make a backpack system
//Make set values for all the fish in the game

public class Game {
	public static String fishingProcess() {
		Scanner inputDevice = new Scanner(System.in);
		Random random = new Random();
		
		//Fish and their Chances
		String [] fish = {"Your line snapped!", "Cod", "Trout", "Salmon"};
		double [] fishChance = {20.0, 45.0, 25.0, 10.0};
				
		System.out.println("Enter 'catch' to catch a fish.");
		String choice = inputDevice.nextLine();
				
		//Fishing command that returns a string
		double randomValue = random.nextDouble() * 100;
		double catchChance = 0;
		String caughtFish = null;
		
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
					}else{
						System.out.println("Throw your line to catch fish you can sell to the vendor!");
						}
		return caughtFish;
				}
			
			
			
			public static void main(String[] args) {
				//The bags and the counter to know when it's filled
				String[] bag = new String [5];
				Scanner inputDevice = new Scanner(System.in);
				String choice;
				fishingProcess();
				
				while(true) {
					String caughtFish = fishingProcess();
				System.out.println("Continue fishing? 'YES' or 'NO'.");
				choice = inputDevice.nextLine();
				if (choice.equals("YES")) {
					fishingProcess();
				} else if (choice.equals("NO")) {
					System.out.print("Done fishing!");
					break;
				}
				}
			}		
			}