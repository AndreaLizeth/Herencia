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
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e = new Estudiante("Juan ", "Perez");
        Profesor p = new Profesor("Edwin ","Salvador");
        
        System.out.println("Nombre Estudiante: "+ e.getNombre() + e.getApellido());
        System.out.println("Nombre Profesor: " + p.getNombre()+ p.getApellido());
        
        
        
        
    }
    
}
