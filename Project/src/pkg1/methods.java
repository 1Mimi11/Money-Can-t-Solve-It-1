package pkg1;

import java.util.Random;
import java.util.Scanner;

public class methods {
	String caughtFish;
	public static String fishingProcess(Scanner inputDevice) {
		
		Random random = new Random();
		
		//Fish and their Chances
		String [] fish = {"Your line snapped!", "Cod", "Trout", "Salmon"};
		double [] fishChance = {20.0, 45.0, 25.0, 10.0};
				
		//System.out.println("Enter 'catch' to catch a fish or 'exit' to stop fishing.");
		String choice = inputDevice.nextLine();
				
		//Fishing command that returns a string
		double randomValue = random.nextDouble() * 100;
		double catchChance = 0;
		Fish caughtFishs;
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
	
	
	
	public static String fishingLoop() {
		//The bags and the counter to know when it's filled
		String[] bag = new String [5];
		int bagIndex = 0;
		Scanner inputDevice = new Scanner(System.in);
		String choice;
		StringBuilder allFish = new StringBuilder();
		boolean fish = true;
		System.out.println("Enter 'catch' to catch a fish or 'exit' to stop fishing.");
		
		while(true) {
			String caughtFish = methods.fishingProcess(inputDevice);
			
			//Saving fish too backpack
			if (caughtFish != null && !caughtFish.equals("Your line snapped") && !caughtFish.equals("No fish took the bait. :<")) {
				if (bagIndex < bag.length) {
					bag[bagIndex] = caughtFish;
					bagIndex++;
				System.out.println("Saved " + caughtFish + " to backpack\n");
				System.out.println("You have " + bagIndex + " fish out of " + bag.length + " fish in your backpack.");
				//Add fish in to caughtFish.
				if (fish) {
					allFish.append(caughtFish);
					fish = false;				
				}else {
					allFish.append(", ").append(caughtFish);
				}
				
				} else {
					System.out.println("Your bag is full, sell to the vendor to make space.");
				}
			}
			
			//Fishing Loop
		System.out.println("\nAre you done fishing? Hit the enter key, then type 'catch' to keep fishing or type 'exit' to stop fishing.\n");
		choice = inputDevice.nextLine();
		
		if (choice.equals("exit")) {
			System.out.print("Done fishing!\n\n");
			return allFish.toString();
			
		}
		}
		

	}
	
	
	
	public static void vendor(Scanner inputDevice){
		
		boolean leaving = false;
		
		while (!leaving) {
		
		System.out.print("Fish Vendor: Hello, I'm Pete! Would you like to sell your fish to me? \nSell fish.[1] \nAsk about the game.[2] \nLeave the vendor.[3]\n");
		int choice = inputDevice.nextInt();
		
		if(choice == 1) {
			System.out.println("You have " + Game.bagIndex + " fish in your bag.");
			if (Game.bagIndex > 0) {
				System.out.println("\nYou sold your fish to me!\n");
				Game.bagIndex = 0;
				break;
			} else if (Game.bagIndex == 0) {
				System.out.println("Your bag is empty.");
			}else {
				System.out.println("Error.");
			}


		}else if (choice == 2) {
			System.out.println("\nThis is a fishing game where you can fish and sell fish for upgrades.\n");
		}else if (choice == 3) {
				System.out.println("\nThanks for visiting!\n");
				leaving = true;
		}else{
			System.out.print("\nlease a command from the given list.\n");
		}
		

	}

		
		
		
	
	}
}
