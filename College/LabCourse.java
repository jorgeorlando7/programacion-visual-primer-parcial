package javaapplication16;

public class LabCourse extends CollegeCourse{
    
    public LabCourse(String dep, Integer num, Integer ced){
        super(dep,num,ced);
    }
    
    public Double getprecio(){
        return 50+ super.getprecio();
    }
    
    
    public void display(){
        System.out.println("Este curso es de Laboratorio");
        super.display();
    }
    
    
    
}