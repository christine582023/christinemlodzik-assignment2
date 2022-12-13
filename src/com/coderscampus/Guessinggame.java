package com.coderscampus;

import java.util.Random;

import java.util.Scanner;

public class Guessinggame {
	
	final String WHITE_SPACE = " ";
	
	void guessinggame() {
	
		Random random = new Random();
		
		Scanner scanner = new Scanner(System.in);
		
		int randomNumber = random.nextInt(100) + 1;
				
		int playerTries = 1;
				
		//below is for testing purposes only 
//		System.out.println(randomNumber);
//		System.out.println("**************");
	
		while(true) {	
			System.out.println("Pick a number between 1 and 100:" + WHITE_SPACE);
			
			int playerGuess = scanner.nextInt();
			
			if (playerTries < 5)
			{
				if (playerGuess == randomNumber) {
					System.out.println("YOU WIN!!!!");
					break;
				} 
				else if (playerGuess < 1 || playerGuess > 100) {
					System.out.println("Your guess is not between 1 and 100, please try again.");
					System.out.println("----------------------------");
				}
				else if(randomNumber > playerGuess) {
					System.out.println("Please pick a higher number.");
					System.out.println("----------------------------");
				} 
				else {
					System.out.println("Please pick a lower number.");
					System.out.println("----------------------------");
				}
			}
			else if (playerTries != randomNumber) 
				{
				System.out.println("You lose. The number to guess was" + WHITE_SPACE + randomNumber + ".");
				break;
				}
			playerTries = playerTries + 1;
		}
	}
}
