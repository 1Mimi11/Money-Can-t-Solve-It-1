package pkg1;
import java.util.Scanner;
import java.util.Random;



//Work on the system for calculating a trips total value
//Create a fish vendor to sell to
//Make a backpack system
//Make set values for all the fish in the game


public class Game {
	
	public static String [] bag = new String [5];
	public static int bagIndex =0;
	
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
					methods.vendor();
					break;
				case 2:
					methods.fishingLoop();
					break;
				case 3:
					System.out.println("Game quited.");
					return;
				default:
					System.out.println("Error, please reload the program and choose from one of the given options.");
					break;
				}
				
			}
		}		
	}