package javaapplication16;

public class Package {
    private Double peso;
    private Double costo;
    private char metodo;
    
    public Package(Double f, char t){
        peso=f;
        metodo=t;
        
        calculateCost();
    }
    
    public Double calculateCost(){
        if(metodo=='A'){
            if(peso>0 && peso<9){
                costo=2.0;
            }if(peso>=10 && peso<=16){
                costo=3.0;
            }if(peso>17){
                costo=4.5;
            }
        }if(metodo=='T'){
            if(peso>0 && peso<9){
                costo=1.5;
            }if(peso>=10 && peso<=16){
                costo=2.35;
            }if(peso>17){
                costo=3.25;
            }
            
        }else{
            if(peso>0 && peso<9){
                costo=0.5;
            }if(peso>=10 && peso<=16){
                costo=1.5;
            }if(peso>17){
                costo=2.15;
            }
        }
        return costo;
    }
    
    public void display(){
        System.out.println("Peso: "+peso);
        System.out.println("Método: "+metodo);
        System.out.println("Costo :"+costo);
    }
    
}