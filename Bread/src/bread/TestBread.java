package sandwich;

public class TestBread {

public static void main(String[] args) {

//Create Array of Bread objects of size 3

Bread[] breads=new Bread[3];

//Create each Bread object and set to array

Bread bread1=new Bread("rye", 94);

breads[0]=bread1;

Bread bread2=new Bread("Bun",80);

breads[1]=bread2;

Bread bread3=new Bread("Toat",90);

breads[2]=bread3;

for (Bread bread : breads) {

System.out.println(Bread.SLOGAN+" Bread Type: "+bread.getBreadType()+" Calories Per Slice: "+bread.getCaloriesPerSclice());

}

}

}