package game;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {

	private String userName = "";
	Scanner scanner;

	{
		scanner = new Scanner(System.in);
		System.out.println("enter your name");
		userName = scanner.next();
		System.out.println("Welcome, " + userName + "! This is a simple and awesome game.");
		System.out.println("Type 0 for rock, 1 for paper, or 2 for scissor.");
	}

	private String[] var = { "rock", "paper", "scissor" };
	private int rand;
	private int userInp;

	public void start() {
		Random random = new Random();
		rand = random.nextInt(3);
		
		userInp = getUserInput() ;
		
		if (var[rand].equals(var[userInp])) {
			System.out.println("game draw!");
		} else if (var[rand].equals("rock") && var[userInp].equals("paper")) {
			System.out.println("Sorry, " + userName + ". You lost. Better luck next time!");
		} else if (var[rand].equals("rock") && var[userInp].equals("scissor")) {
			System.out.println("Sorry, " + userName + ". You lost. Better luck next time!");
		} else {
			System.out.println("congratulations...you won the game!");
		}

		scanner.close();
	}
	  private int getUserInput() {
	        int choice;
	        while (true) {
	            try {
	                System.out.println("Enter your choice:");
	                choice = scanner.nextInt();
	                if (choice >= 0 && choice <= 2) {
	                    break;
	                } else {
	                    System.out.println("Invalid input! Please enter a number between 0 and 2.");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Invalid input! Please enter a number.");
	                scanner.next(); 
	            }
	        }
	        return choice;
	    }
}
