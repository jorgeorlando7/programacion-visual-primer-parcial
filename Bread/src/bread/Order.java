package sandwich;

public class Order {

private String customerName;

private Sandwich sandwich;

private int noOfSandwiches;

public Order(String customerName, Sandwich sandwich, int noOfSandwiches) {

this.customerName = customerName;

this.sandwich = sandwich;

this.noOfSandwiches = noOfSandwiches;

}

public String getCustomerName() {

return customerName;

}

public Sandwich getSandwich() {

return sandwich;

}

public int getNoOfSandwiches() {

return noOfSandwiches;

}

}