/*This is Robert Gross's Heads or Tails Game project written on June 27th, 2023. The intention of the project is to
 * is to allow two players to play a game of heads or tails against one another, in which they gain 2 points
 * for picking correctly and -1 point for picking wrong. It uses a class constructor to determine the coin,
 * as well as a while loop to determine when the players score is less than 10 points.
*/
package GrossHeadsOrTails; //package declaration

import java.util.Scanner;

public class GrossHeadsOrTailsGame { // class declaration

	public static void main(String[] args) { // main method

		GrossCoin gc = new GrossCoin(); //import new class gc using constructor
		int userChoice;
		int userScore1 = 0;
		int userScore2 = 0;
		int userFlips1 = 0;
		int userFlips2 = 0;
		boolean player1Turn = true;
		Scanner scan = new Scanner(System.in); // create scanner
		System.out.println("Welcome to the heads or tails game!");// greet user
		while (userScore1 < 10 && userScore2 < 10) { //while userscores are both less than 10
			if (player1Turn == true) { //if its player 1's turn
				System.out.print("Player 1: ");
			} else { //if its player 2's turn
				System.out.print("Player 2: ");
			}
			System.out.println("Please enter 1 for heads or 2 for tails: ");// greet user
			userChoice = Integer.parseInt(scan.nextLine());// read user choice
			if (userChoice == 1 || userChoice == 2) { // if userChoice = 1 or 2 run game
				if (userChoice == gc.toss()) { // if their choice is correct
					if (player1Turn == true) { //if its player 1, give them points
						userFlips1++;
						userScore1+=2;
					} else { //if not, give player 2 points
						userFlips2++;
						userScore2+=2;
					}
				} else {//if their choice is incorrect
					if (player1Turn == true) {//give player one -1 points
						userFlips1++;
						userScore1--;
					} else {//give playe 2 -1 points
						userFlips2++;
						userScore2--;
					}
				}
			player1Turn = !player1Turn;	 // swap players turn
			
			System.out.println("Player 1: "+ userScore1 + "\tPlayer 2: " + userScore2 + "\n");					
			} else { // if user choice isnt 1 or 2, make them try again
				System.out.println("Incorrect value. Please try again.");
			}
		}
		System.out.println("Player 1 total flips: " + userFlips1 + "\nPlayer 2 total flips: "+ userFlips2);
		scan.close();
	}

}
