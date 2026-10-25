package pkg1;
import java.util.Scanner;
import java.util.Random;



//Work on the system for calculating a trips total value
//Create a fish vendor to sell to
//Make a backpack system
//Make set values for all the fish in the game


public class Game {
	
	public static Fish[] fishTypes = {
			new Fish("Cod", 2),
			new Fish("Trout", 7),
			new Fish("Salmon", 35)

	};
	
	public static String [] bag = new String [5];
	public static int bagIndex = 0;
	
	public static void main(String[] args) {
		int answer;
		Scanner inputDevice = new Scanner(System.in);
				
		while (true) {
			System.out.print("~~~ Money Can't Solve It ~~~\n");
			System.out.println("\nDo you want to visit the vendor[1] or go fish[2]?");
			answer = inputDevice.nextInt();
			inputDevice.nextLine();
			
				
				
			switch(answer) {
				case 1:
					methods.vendor(inputDevice);
					break;
				case 2:
					String allFish = methods.fishingLoop();
					if (allFish != null && allFish != "Your line snapped") {
						String[] fishArray = allFish.split(", ");
						for (String fish : fishArray) {
						if (bagIndex < bag.length) {
							bag[bagIndex] = fish;
							bagIndex++;
							System.out.println(fish + " has been added to your bag.");
						//I don't think this code is correctly updating the index, bag is stuck at 1.
							}
						}
					}	
					break;
				case 3:
					System.out.println("You've quit the game.");
					return;
				default:
					System.out.println("Error, please reload the program and choose from one of the given options.");
					break;
				}
				
			}
		}		
	}