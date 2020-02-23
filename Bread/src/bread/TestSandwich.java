package sandwich;

public class TestSandwich {

public static void main(String[] args) {

//Create Bread and SandwichFilling objects and set to Sandwich object

Bread bread1 = new Bread("Rye", 94);

SandwichFilling filling1 = new SandwichFilling("Egg salad", 100);

Sandwich sandwich1 = new Sandwich(bread1, filling1);

Bread bread2 = new Bread("Bun", 80);

SandwichFilling filling2 = new SandwichFilling("Sausage", 95);

Sandwich sandwich2 = new Sandwich(bread2, filling2);

Bread bread3 = new Bread("Toast", 90);

SandwichFilling filling3 = new SandwichFilling("Tuna & Cucumber", 110);

Sandwich sandwich3 = new Sandwich(bread3, filling3);

//create array of sandwiches to store the sandwiches data

Sandwich[] sandwiches = new Sandwich[3];

sandwiches[0] = sandwich1;

sandwiches[1] = sandwich2;

sandwiches[2] = sandwich3;

// iterate through loop and print all the Sandwich objects data

System.out.printf("%-15s %-20s %-15s \n", "Bread Type", "Filling Type", "Total Calories");

System.out.println("----------------------------------------------------");

for (Sandwich sandwich : sandwiches) {

double totalCalories = (sandwich.getBread().getCaloriesPerSclice() * 2)

+ sandwich.getFilling().getCaloriesInServing();

System.out.printf("%-15s %-20s %-15s \n", sandwich.getBread().getBreadType(),

sandwich.getFilling().getFillingType(), totalCalories);

}

}

}