package javaapplication16;

import java.util.Scanner;
public class UseCOurse  {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        System.out.println("Escriba el tipo de curso que desea: \nBIO, CHE, CIS y PHY son espec�ficamente para laboratorio.");
        System.out.println("Otro departamento");
        String dep=in.next();
        if((dep.equals("BIO")) || (dep.equals("CHE"))  || (dep.equals("CIS"))  || (dep.equals("PHY")) ){
            LabCourse c1=new LabCourse(dep,108,3);
            System.out.println("Informaci�n del curso");
            c1.display();
        }else{
            CollegeCourse c2=new CollegeCourse(dep, 302, 5);
            System.out.println("Informaci�n del curso");
            c2.display();
        }
    
    }
    
}