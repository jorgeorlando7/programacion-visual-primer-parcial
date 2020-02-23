package formletterwrite;

public class FormLetterWrite{
    public String displaysolution(String lastname){
        String S1 = "Nombre"; 
        int length = S1.length();       
        System.out.println("Su nombre es:" + name); 
    }
    public String displaysolution(String lastname, String name){
        String S1 = "Apellido"; 
        int length = S1.length();       
        System.out.println("Su apellido es es:" + lastname); 
    }
}

public class Principal{
    public static void main(String [] args){
        FormLetterWrite flw = new FormLetterWrite();
        flw.displaysolution(lastname);
        flw.displaysoluton("Estidamo Sr. o Sra. %s %s" lastname, name);
    }
}