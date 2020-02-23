package sandwich;

public class TestSandwichFilling {

public static void main(String[] args) {

SandwichFilling[] fillings = new SandwichFilling[3];

SandwichFilling filling1 = new SandwichFilling("egg salad", 100);

fillings[0] = filling1;

SandwichFilling filling2 = new SandwichFilling("Sausage", 95);

fillings[1] = filling2;

SandwichFilling filling3 = new SandwichFilling("Tuna & Cucumber", 110);

fillings[2] = filling3;

for (SandwichFilling filling : fillings) {

System.out.println("Filling Type: " + filling.getFillingType() + " Calories In a Serving: "

+ filling.getCaloriesInServing());

}

}

}