package com.bridgelabz;

public class SnakeLadder {
public void SnakeLadder() {
System.out.println("the player rolls dice from number 1 to 6:");
	int diceRoll=(int)(Math.random()*6+1);
	
	System.out.println("The Dice is rolled "+diceRoll+" No of Times");
}
public static void main(String[] args) {
	SnakeLadder obj=new SnakeLadder();
	obj.SnakeLadder();
}
	
}

