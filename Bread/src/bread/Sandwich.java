package sandwich;

public class Sandwich {

private Bread bread;

private SandwichFilling filling;

public Sandwich(Bread bread, SandwichFilling filling) {

this.bread = bread;

this.filling = filling;

}

public Bread getBread() {

return bread;

}

public SandwichFilling getFilling() {

return filling;

}

}