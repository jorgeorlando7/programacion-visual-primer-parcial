package person;

public class Faculty extends CollegeEmployee{
    private Boolean permiso;
    
    
    
    public void setpermiso(Boolean p){
        permiso=p;
    }
    public void mostrarInformacion(){
        if(permiso){
            super.mostrarInformacion();
        }
        
        
    }
    
    
}