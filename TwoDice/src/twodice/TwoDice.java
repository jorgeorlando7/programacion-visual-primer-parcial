package TwoDice;

import java.util.*;

public class TwoDice{
	static final int HIGHEST_DIE_VALUE = 6;
	static final int LOWEST_DIE_VALUE = 1;
	int randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +	LOWEST_DIE_VALUE);
                
	public int getDieValue() {
		return randomValue;
	}
	
	int value;
}