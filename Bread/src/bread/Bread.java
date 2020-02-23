package sandwich;

public class Bread {

private String breadType;

private double caloriesPerSclice;

public static final String SLOGAN = "The Way A Sandwich Should Be.";

public Bread(String breadType, double caloriesPerSclice) {

this.breadType = breadType;

this.caloriesPerSclice = caloriesPerSclice;

}

public String getBreadType() {

return breadType;

}

public double getCaloriesPerSclice() {

return caloriesPerSclice;

}

}