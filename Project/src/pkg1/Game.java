package pkg1;
import java.util.Scanner;
import java.util.Random;


//Work on the system for calculating a trips total value
//Create a fish vendor to sell to
//Make a backpack system
//Make set values for all the fish in the game


public class Game {
	//Create Player
	public static Reggie player = new Reggie();
	public static Scanner inputDevice = new Scanner(System.in);
	
	//Create Fish Types
	public static Fish[] fishTypes = {
			new Fish("Cod", 2),
			new Fish("Trout", 7),
			new Fish("Salmon", 35)
	};
	
	//Create Bag
	public static Fish[] bag = new Fish [5];
	public static int bagIndex = 0;
	
	
	
	public static void main(String[] args) {
				
		while (true) {
			System.out.println("~~~ Money Can't Solve It ~~~");
			System.out.print("\nDo you want to visit the vendor[1], go fish[2], or check your stats[3]?\nEnter choice: ");
			int answer = inputDevice.nextInt();
			inputDevice.nextLine();
			
				
				
			switch(answer) {
				case 1:
					methods.vendor(player, inputDevice);
					break;
				case 2:
					methods.fishingLoop(player, inputDevice);
					break;
				case 3:
					player.playerStats();
					break;
				case 4:
					System.out.println("You've quit the game.");
					return;
				default:
					System.out.println("Error, please reload the program and choose from one of the given options.");
					break;
				}
				
			}
		}		
	}