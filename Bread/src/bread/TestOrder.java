package sandwich;

import java.util.Scanner;

public class TestOrder {

public static void main(String[] args) {

//Scanner object to read the input from the console

Scanner scanner = new Scanner(System.in);

//Prompts user to enter customer name

System.out.println("Enter Customer Name: ");

String customerName = scanner.nextLine();

//Prompts user to enter number of orders

System.out.println("Number of sandwiches: ");

int noOfSandwiches=scanner.nextInt();

Bread bread1 = new Bread("Rye", 94);

SandwichFilling filling1 = new SandwichFilling("Egg salad", 100);

Sandwich sandwich1 = new Sandwich(bread1, filling1);

Bread bread2 = new Bread("Bun", 80);

SandwichFilling filling2 = new SandwichFilling("Sausage", 95);

Sandwich sandwich2 = new Sandwich(bread2, filling2);

Bread bread3 = new Bread("Toast", 90);

SandwichFilling filling3 = new SandwichFilling("Tuna & Cucumber", 110);

Sandwich sandwich3 = new Sandwich(bread3, filling3);

Bread bread4 = new Bread("Brown Bread", 60);

SandwichFilling filling4 = new SandwichFilling("Turkey Salad", 180);

Sandwich sandwich4 = new Sandwich(bread4, filling4);

// create array of sandwiches to store the sandwiches data

Sandwich[] sandwiches = new Sandwich[4];

sandwiches[0] = sandwich1;

sandwiches[1] = sandwich2;

sandwiches[2] = sandwich3;

sandwiches[3] = sandwich4;

//Create order object to set sandwich type ordered and number of orders

Order order1=new Order(customerName, sandwich1,2);

// iterate through loop and print all the Sandwich objects data

System.out.println("Customer Name: "+customerName);

System.out.printf("%-15s %-20s %-15s \n", "Bread Type", "Filling Type", "Total Calories");

System.out.println("----------------------------------------------------");

for (int i=0;i<noOfSandwiches;i++) {

double totalCalories = (order1.getSandwich().getBread().getCaloriesPerSclice() * 2)

+ order1.getSandwich().getFilling().getCaloriesInServing();

System.out.printf("%-15s %-20s %-15s \n", order1.getSandwich().getBread().getBreadType(),

order1.getSandwich().getFilling().getFillingType(), totalCalories);

}

scanner.close();

}

}