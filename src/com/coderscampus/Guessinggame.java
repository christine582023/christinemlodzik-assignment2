package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
	
	public static void main(String[] args) {

	final String WHITE_SPACE = " ";
	
		Random random = new Random();
		
		int randomNumber = random.nextInt(100) + 1;

		int playerTries = 0; 
		
		Scanner scanner = new Scanner(System.in);
		
//		below is for testing purposes only 
//		System.out.println(randomNumber);
//		System.out.println("**************");
		
		int playerGuess = 0;
	
		while (playerTries < 5) {	
			System.out.println("Pick a number between 1 and 100:" + WHITE_SPACE);
			playerGuess = scanner.nextInt();
			
			if (playerGuess < 1 || playerGuess > 100) { 
				System.out.println("Your guess is not between 1 and 100, please try again.");
				System.out.println("----------------------------");
				
			} else {  
				playerTries++;
					
			if (playerGuess == randomNumber) {
				System.out.println("YOU WIN!!!!");
				break;
					
			} else if (playerGuess < randomNumber) {
				System.out.println("Please pick a higher number.");
				System.out.println("----------------------------");
				
			} else {
				System.out.println("Please pick a lower number.");
				System.out.println("----------------------------");
			}
			
			if (playerTries == 5) {
				System.out.println("You lose. The number to guess was" + WHITE_SPACE + randomNumber + ".");
	
				scanner.close();
		}

	}			
//			if (playerTries == 5 && playerGuess != randomNumber) {
//				System.out.println("You lose. The number to guess was" + WHITE_SPACE + randomNumber + ".");
	
			}
		}
	}


