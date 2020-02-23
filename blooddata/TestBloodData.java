package BloodData;

import java.util.Scanner;

public class TestBloodData {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
	BloodData test1 = new BloodData();
	BloodData test2 = new BloodData();
	BloodData test3 = new BloodData("AB", "-");
        
	System.out.println(">> Enter blood type: ");
	test1.set.BloodType(sc.next());
	System.out.println(">> Enter Rh factor: ");
	test1.set.RhFactor(sc.next());
	System.out.println();
        
	System.out.println("test1 object - from user input");
	System.out.println("Blood type: " + test1.getBloodType());
	System.out.println("Rh factor: " + test1.getRhFactor());
	System.out.println();
		
	System.out.println("test2 object - default values");
	System.out.println("Blood type: " + test2.getBloodType());
	System.out.println("Rh factor: " + test2.getRhFactor());
	System.out.println();
		
	System.out.println("test3 object - constructor with parameters");
	System.out.println("Blood type: " + test3.getBloodType());
	System.out.println("Rh factor: " + test3.getRhFactor());		
	}
        
}