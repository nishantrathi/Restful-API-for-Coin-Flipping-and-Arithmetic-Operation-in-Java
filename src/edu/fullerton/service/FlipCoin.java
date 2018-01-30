package edu.fullerton.service;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

	public static void main (String[] args) {
		int toss;
		int counter;
		int heads, tails;
		counter = 0;
		heads = 0;
		tails = 0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter amount of times you want the coin to be tossed :");
		toss=input.nextInt(); 
		Random coinToss = new Random();
		int random = coinToss.nextInt(1);
		System.out.println(random);
		while (counter < toss){
			if (random > 0.5) {
				heads = heads + 1;
				//System.out.print("Head ");
			}
			else {
				tails = tails + 1;
				//System.out.print("Tail");
			}
			counter++;
			System.out.println("r1-"+random);
			random = coinToss.nextInt(2);
			//System.out.println("r2-"+random);
		}
		//System.out.println("");
		System.out.println("For your tosses you got \n" + "-------------------\n" + "Heads: " + heads + "\nTails: " + tails);



	} // end main


}

