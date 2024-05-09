package com.calculator.in;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int targetNumber = random
			.nextInt(100);
		Scanner scanner = new Scanner(System.in);
		
		int guess;
		boolean guessedCorrectly = false;
		while(!guessedCorrectly) {
			System.out.println("Guess a number between 1 and 100:" );
			guess = scanner.nextInt();
			if (guess==targetNumber) {
				
				System.out.println("Guessed the correct number" );
				guessedCorrectly=true;
				
			} else if (guess<targetNumber) {
				System.out.println("Guessed the low number" );
			} else if (guess>targetNumber) {
				System.out.println("Guessed the high number" );
			}
		}
		scanner.close();
	}

}
