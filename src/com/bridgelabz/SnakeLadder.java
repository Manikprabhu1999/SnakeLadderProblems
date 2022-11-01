package com.bridgelabz;
import java.util.Scanner;
public class SnakeLadder {
public void SnakeLadder() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter 1:No Play");
	System.out.println("Enter 2:Player Climbs Ladder");
	System.out.println("Enter 3:Player falls from Ladder" );
	int condition=scanner.nextInt();
	   int diceRoll =(int) (Math.random()*6+1);
	  System.out.println("The Dice is Rolled:"+ diceRoll);
	int position=0;
	switch(condition)
	{
	case 1:
		    System.out.println("The player Will be at the Same Position (No Play):"+ position);
		   break;
	case 2:
		    System.out.println("The player climbs the Ladder:" + diceRoll + position);
		   break;
	case 3:
		    System.out.println("The player fall from Ladder:" + diceRoll +position);
	}

		}
		
		public static void main(String[] args) {
			SnakeLadder obj=new SnakeLadder();
			obj.SnakeLadder();
		}
		
	}