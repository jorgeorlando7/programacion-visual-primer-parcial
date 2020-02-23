package person;

public class CollegeEmployee extends Person {
    private String numeroSeguro;
    private Integer salario;
    private String departamento;
    
    public void setnumeroSeguro(String name){
        numeroSeguro=name;
    }
    public void setSalario(Integer sal){
        salario=sal;
    }
    public void setdepartamento(String dep){
        departamento=dep;
    }
    
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Numero de seguro :"+numeroSeguro+"\nSalario $"+salario+"\nDepartamento: "+departamento);
    }
    
}