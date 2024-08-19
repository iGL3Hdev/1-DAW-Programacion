
package Tarea3V5;

import Tarea3V5.Numeros.Complejo;


public class Trabajador1 {

  
    public static void main(String[] args) {
        
        Trabajador t = new Trabajador();
        
        //t.principal();
        
        //System.out.println(t.consulta_Nombre());
        //System.out.println(t.consulta_Altura());
        //System.out.println(t.consulta_Edad());
        
        Trabajador t2 = new Trabajador("Carlos", 51, 1.69f);
        
        System.out.println(t2.consulta_Nombre());
        System.out.println(t2.consulta_Altura());
        System.out.println(t2.consulta_Edad());
        

        
        
    }
    
}
