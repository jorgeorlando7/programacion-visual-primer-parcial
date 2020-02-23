package javaapplication16;

public class CarRental {
    private String name;
    private String zipcode;
    private String size;
    private Double daily;
    private Integer numDays;
    private Double total;
    
    public CarRental(String n, String zc, String s, Integer d){
        name=n;zipcode=zc;
        size=s;
        numDays=d;
        
        
    }
    
    public void display(){
        System.out.println(name);
        System.out.println(zipcode);
        System.out.println(size);
        System.out.println(total);
    }
    
    
    public Double  getdaily(){
        if(size=="E"){
            daily=29.99;
        }if(size=="M"){
            daily=38.99;
        }else{
            daily=43.5;
        }
        return daily;
        
    }
    public void settotal(Double n){
        total=n;
    }
    public Double gettotal(){
        return numDays*getdaily();
    }
    
}