package operacionesconfraccionarios;

public class fraccion {
    
    int numerador, denominador;

    public fraccion (int num, int den){
    
        numerador=num;
        denominador=den;
    
    }
    
    public int getNumerador(){
        return numerador;
    }
    
    public int getDenominador(){
        return denominador;
    }
    
    
    public fraccion sumar(fraccion f1){
    
        try{
        fraccion aux = new fraccion(numerador*f1.denominador+denominador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
        
    }

    
    public fraccion restar(fraccion f1){
    
        try{
        fraccion aux = new fraccion(numerador*f1.denominador-(denominador*f1.numerador), denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
        
    
    }
    
    public fraccion multiplicar(fraccion f1){
    
        try{
        fraccion aux = new fraccion(numerador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }        
    
    }
    
 
    public fraccion dividir(fraccion f1){
    
        try{
        fraccion aux = new fraccion(numerador*f1.denominador, denominador*f1.numerador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }          
    
    }
    
    
    public int mcd(){
    
        int num=numerador, den=denominador;
        
        if(num==0){
            return 1;
        }else{
            
            if(num<0){
                num=num*-1; 
            }

            if(den<0){
                den = den * -1; 
            }
            
            
            if(den>num){
                int aux = num;
                num=den;
                den=aux;
            }
            
            int mcd=1;
                           
            while(den!=0){
                
                mcd=den;   
                den = num % den;  
                num = mcd;  
            
            }

            return mcd;
            
        }
         
    }
    
    
    public void simplificar(){
    
        int mcd = mcd();
        
        numerador = numerador / mcd;
        denominador = denominador / mcd;        
        int numeradornum = 0;
                
        if(numeradornum<0 && denominador<0){
        
            numerador=numerador*-1;         
            denominador=denominador*-1;            
        
        }else if (numerador >=0 && denominador>0){
            
            numerador=numerador*-1;         
            denominador=denominador*-1;              
        
        }
        
    
    }
    
    
    
    @Override
    public String toString(){
        
        if(denominador!=0){
        
                simplificar();
                if(denominador!=1){        
                    return numerador+"/"+denominador;
                }else{
                    return numerador+"";
                }
        }else{
            
            return "El denominador debe ser distinto de 0";
        
        }
        
    }
    
    
    
}
