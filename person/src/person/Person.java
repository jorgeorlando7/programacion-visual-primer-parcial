/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author JOHDLS
 */
public class Person{
    private String nombre;
    private String paterno;
    private String materno;
    
    public void setnombre(String name){
        nombre=name;
    }
    public void setpaterno(String pat){
        paterno=pat;
    }
    public void setmaterno(String mat){
        materno=mat;
    }
    
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre+" "+paterno+" "+materno);
    }
}