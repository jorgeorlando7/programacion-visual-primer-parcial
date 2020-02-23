package sandwich;

public class SandwichFilling {

private String fillingType;

private double caloriesInServing;

public SandwichFilling(String fillingType, double caloriesInServing) {

this.fillingType = fillingType;

this.caloriesInServing = caloriesInServing;

}

public String getFillingType() {

return fillingType;

}

public double getCaloriesInServing() {

return caloriesInServing;

}

}