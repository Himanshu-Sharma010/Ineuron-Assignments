package com.ineuronlearn.main.Assignment;

import java.io.IOException;
import java.util.Scanner;

//In this game 3 player guess the number and those numbers will compare to guesser guessed number (It is system generated number) if match found then winner will be announced
class Guesser{
	int guessNum;//this is for showing has part of class Guesser , actual it is declare in guessnum() method. so it is a local variable.
	int guessNum() {
		
		guessNum =(int) (Math.random() * 100) + 1;
		System.out.println();
		System.out.println("Guesser has Guessed the number");
		return guessNum;
	}
}



class Player{
	int playerNum;
	int playerNum(int i) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("player "+i+" enter the number:");
		playerNum = sc.nextInt();
		return playerNum;
	}
}

class Umpire{
	int numOfGuesser;
    int numOfPlayer1;
    int numOfPlayer2;
    int numOfPlayer3;
    
    int collectNumOfGuesser() {
    	Guesser g = new Guesser();
    	numOfGuesser = g.guessNum();
  return numOfGuesser;
    	
    }
   
    
    void collectNumOfPlayer() {
    	Player p1 = new Player();
    	numOfPlayer1 = p1.playerNum(1);
    	Player p2 = new Player();
    	numOfPlayer2 = p2.playerNum(2);
    	Player p3 = new Player();
    	numOfPlayer3 = p3.playerNum(3);
    
    }
    
    void compare() {
    	if(numOfGuesser==numOfPlayer1) {
    		if(numOfGuesser==numOfPlayer2 && numOfGuesser==numOfPlayer3)
    		{
    			System.out.println("All players won");
    		}
    		else if(numOfGuesser==numOfPlayer2) {
    			System.out.println("Player1 and Player2 won the game");
    		}
    		else if(numOfGuesser==numOfPlayer3) {
    			System.out.println("Player1 and Player3 won the game");
    		}
    		else {
    			System.out.println("Player1 won the game");
    		}
          }
    	
    	else if(numOfGuesser==numOfPlayer2) {
    		if(numOfGuesser==numOfPlayer3) {
    			System.out.println("Player2 and Player3 won the game");
    		}
    		else {
    			System.out.println("Player2 won the game");
    		}
    	  }
    	
    	else if(numOfGuesser==numOfPlayer3) {
    		System.out.println("Player3 won the game");
    	}
          
    	else {
    		System.out.println("All lose the game");
    	}
      }
}


public class Assignment3 {

	public static  void main(String[] args) throws Exception {
		Umpire u = new Umpire();
		Scanner in =new Scanner(System.in);
		System.out.println("Welcome to our game!!");
		
		int press;
		do {
			
			
			System.out.println();
		System.out.println("Enter 1 To start the game");
		System.out.println("Enter 2 to exit");
		 press = in.nextInt();
		switch(press) {
		case 1:
			int guessernumber = u.collectNumOfGuesser();
			u.collectNumOfPlayer();
			System.out.println();
			System.out.println("Guesser guessed number is:: "+guessernumber);
			u.compare();
			break;
		case 2:	System.out.println("Thanks for playing...");
		         System.exit(0);
		         
		default: System.out.println("Please enter right number...");
		         break;
		}
			
		} while (press!=2);
		

	}

}
