package javaapplication16;

public class CollegeCourse {
    private String departamento;
    private Integer numCurso;
    private Integer creditos;
    private Double precio;
    
    
    public CollegeCourse(String dep, Integer num, Integer ced){
        departamento=dep;
        numCurso=num;
        creditos=ced;
        precio=getprecio();
    }
    
    public Double getprecio(){
        return 120.0*creditos;
    }
    
    
    
    public void display(){
        System.out.println(departamento);
        System.out.println(numCurso);
        System.out.println(creditos);
        System.out.println(precio);
    }
}