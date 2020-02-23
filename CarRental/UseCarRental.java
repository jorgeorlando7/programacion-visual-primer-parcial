package javaapplication16;

public class UseCarRental {
    public static void main(String[]args){
        CarRental c1=new CarRental("Carro1","qwefqwe4","M",7);
        LuxuryCarRental c2=new LuxuryCarRental("carro2","dfw453w4f","E",3,"S");
        LuxuryCarRental c3=new LuxuryCarRental("carro3","453T4f","E",8);
        
        c1.display();
        c2.display();
        c3.display();
    }
    
}