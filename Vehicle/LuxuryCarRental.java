package javaapplication16;

public class LuxuryCarRental extends CarRental{
    private Double total1;
    
    public LuxuryCarRental(String n, String zc, String s, Integer d, String chofer){
        super(n,zc,s,d);
        super.settotal(279.99);
        
    }
    
    public LuxuryCarRental(String n, String zc, String s, Integer d){
        super(n,zc,s,d);
        super.settotal(79.99);
    }
    
    public void display(){
        super.display();
        System.out.println("Costo del chofer: $200");
    }
    
}