package pkg1;

import java.util.Random;
import java.util.Scanner;

public class methods {
	public static Random random = new Random();
	
	//String caughtFish;
	public static Fish fishingProcess(Scanner inputDevice, Random random) {

		//Fish and their Chances
		String [] fishNames = {"Your line snapped!", "Cod", "Trout", "Salmon"};
		double [] fishChance = {20.0, 45.0, 25.0, 10.0};
		
		String choice = inputDevice.nextLine();
		double randomValue = random.nextDouble() * 100;
		double catchChance = 0;
		String caughtFishName = null;
		
		if (choice.equals("catch")) {
			for (int i = 0; i < fishNames.length; i++) {
				catchChance += fishChance[i];
				if (i == 0) {
					//Line snapped, no fish
					if (randomValue < fishChance [i]) {
						System.out.println("Your line snapped!");
						return null;
						}
					
					}else {
						if (randomValue >= catchChance - fishChance[i] && randomValue < catchChance) {
							caughtFishName = fishNames[i];
							System.out.println("You caught a " + caughtFishName + "!");
							for (Fish f : Game.fishTypes) {
								if (f.name.equals(caughtFishName)) {
									return f;
								}
							}
						}
					}
				}
				if (caughtFishName == null) {
					System.out.println("No fish took the bait. :<");
					return null;
					}
				} else {
					System.out.println("Throw your line to catch fish, that you can sell to the vendor!");
					return null;
				}
		return null;
	}

	 
	 
	public static void fishingLoop(Reggie player, Scanner inputDevice) {
		System.out.println("Enter 'catch' to catch a fish or 'exit' to stop fishing.");
		
		while(true) {
		Fish caughtFish = fishingProcess(inputDevice, methods.random);
			
		//Saving fish too backpack
			if (caughtFish != null) {
				if (Game.bagIndex < Game.bag.length) {
					Game.bag[Game.bagIndex] = caughtFish;
					Game.bagIndex++;
					System.out.println("A \"" + caughtFish + "\" has been added to your bag.");
					System.out.println("You have " + Game.bagIndex + " fish out of " + Game.bag.length + " fish in your backpack.");		
				} else {
					System.out.println("Your bag is full, sell to the vendor to make space.");
				}
			}
			
			//Fishing Loop
		System.out.println("\nAre you done fishing? Hit the enter key, then type 'catch' to keep fishing or type 'exit' to stop fishing.\n");
		String choice = inputDevice.nextLine();
		if (choice.equals("exit")) {
			System.out.print("Done fishing!\n\n\n");
			break;
			}
		}
	}
	
	
	
	public static void vendor(Reggie player, Scanner inputDevice){
		
		boolean leaving = false;
		
		while (!leaving) {
		
		System.out.print("\nFish Vendor: Hello, I'm Pete! Would you like to sell your fish to me? \nSell fish.[1] \nAsk about the game.[2] \nLeave the vendor.[3]\n\n");
		int choice = inputDevice.nextInt();
		inputDevice.nextLine();
		
		if(choice == 1) {
			System.out.println("You have " + Game.bagIndex + " fish in your bag.");
			if (Game.bagIndex > 0) {
				double totalValue = 0;
				for (int i = 0; i < Game.bagIndex; i++) {
					totalValue += Game.bag[i].price;
				}
				player.addMoney(totalValue);
				System.out.println("\nYou sold your fish for $" + totalValue + "!\n");
				Game.bagIndex = 0;
			} else if (Game.bagIndex == 0) {
				System.out.println("Your bag is empty.");
			}else {
				System.out.println("Error.");
			}


		}else if (choice == 2) {
			System.out.println("\nThis is a fishing game where you can fish and sell fish for upgrades.\n");
		}else if (choice == 3) {
				System.out.println("\nThanks for visiting!\n\n");
				leaving = true;
		}else{
			System.out.print("\nPlease choose a command from the given list.\n");
		}
		

	}

		
		
		
	
	}
}
