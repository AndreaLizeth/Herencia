/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author ESFOT
 */
public class Profesor extends Empleado{
    private int anioExperiencia;
    private String profesion;
    
    public Profesor (String nombre, String apellido){
        super(nombre, apellido);
        this.nombre ="Ing." + this.nombre;
        this.anioExperiencia =5;
    }
    
    @Override
    public String getNombre(){
        return "El profesor se llama: "+ nombre;
    }
    
    
    
    
 
}