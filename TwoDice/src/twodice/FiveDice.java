package TwoDice;

import java.util.ArrayList;

public class FiveDice {	
	
	public static void main(String[] args) {
		final int NUM_DIE = 5;
		int i = 0;
		int compScore = 0;
		int dieValue = 0;
		Die[] compDie = new Die[NUM_DIE];
		
		for (i=0; i<NUM_DIE; i++) {			
			compDie[i] = new Die();			
			dieValue = compDie[i].getDieValue();
			compScore += dieValue;
			compDie[i].value = dieValue;
		}
		
		Die[] playerDie = new Die[NUM_DIE];
		int playerScore = 0;
		
		for (i=0; i<NUM_DIE; i++) {
			playerDie[i] = new Die();
			dieValue = playerDie[i].getDieValue();
			playerScore += dieValue;
			playerDie[i].value = dieValue;
		}		

                System.out.print("Computer dice values: ");
		for (i=0; i < NUM_DIE; i++) {
			System.out.print(compDie[i].value + " ");
		}
		System.out.println();
		System.out.print("Player dice values: ");
		for (i=0; i < NUM_DIE; i++) {
			System.out.print(playerDie[i].value + " ");
		}

	}

}