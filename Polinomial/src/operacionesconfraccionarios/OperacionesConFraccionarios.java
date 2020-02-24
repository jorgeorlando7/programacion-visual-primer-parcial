package operacionesconfraccionarios;

public class OperacionesConFraccionarios {

    public static void main(String[] args) {

        fraccion F1 = new fraccion(1, 2);
        fraccion F2 = new fraccion(-3, 2);
        
        System.out.println(F1.sumar(F2));
        System.out.println(F1.restar(F2));
        System.out.println(F1.multiplicar(F2));
        System.out.println(F1.dividir(F2));                        
        
    }
    
}
