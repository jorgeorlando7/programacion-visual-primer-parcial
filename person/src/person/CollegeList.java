package person;

import java.util.Scanner;
public class CollegeList {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        
        
        
        Faculty[] faac= new Faculty[3];
        Boolean bandera=false;
        for (int i = 0; i < 3; i++) {
            faac[i]=new Faculty();
        }
        
         for (int i = 0; i < 3; i++) {
        System.out.println("Ingrese su nombre y dos apellidos");
            String apellido=in.next();
            String nombre=in.next();
            String materno=in.next();
            faac[i].setnombre(nombre);
            faac[i].setpaterno(apellido);
            faac[i].setmaterno(materno);
            
             System.out.println("Desea que se visualice su número de seguro, salario y el departamento al que pertenece? a)Sí b)No");
             String resp=in.next();
                if(resp.equals("a")){
                    bandera=true;
                    faac[i].setpermiso(bandera);
                    System.out.println("Ingrese su número de seguro, el salario que recibe, y el departamento al que pertenece");
                    String nuseguro=in.next();
                    Integer salario=in.nextInt();
                    String dep=in.next();
                faac[i].setSalario(salario);
                faac[i].setnumeroSeguro(nuseguro);
                faac[i].setdepartamento(dep);
                    
                }else{
                    bandera=false;
                    faac[i].setpermiso(bandera);
                }
            
                
         }
          
        Student1[] stu=new Student1[3];
        for (int i = 0; i < 3; i++) {
            stu[i]=new Student1();
        }
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su nombre y dos apellidos");
            String apellido=in.next();
            String nombre=in.next();
            String materno=in.next();
            stu[i].setnombre(nombre);
            stu[i].setpaterno(apellido);
            stu[i].setmaterno(materno);
            
                System.out.println("¿Desea mostrar su carrera y promedio? a)Sí b)No");
                String resp=in.next();
                if(resp.equals("a")){
                    bandera=true;
                    stu[i].setpermiso(bandera);
                    System.out.println("Ingrese su carrera y promedio");
                String carrera=in.next();
                Double promedio=in.nextDouble();
                stu[i].setCarrera(carrera);
                stu[i].setPromedio(promedio);
            
                }else{
                    bandera=false;
                    stu[i].setpermiso(bandera);
                }
        }
        for (int i = 0; i < faac.length; i++) {
            stu[i].mostrarInformacion();
        }
        for (int i = 0; i < faac.length; i++) {
            faac[i].mostrarInformacion();
        }
        
    
    }
}