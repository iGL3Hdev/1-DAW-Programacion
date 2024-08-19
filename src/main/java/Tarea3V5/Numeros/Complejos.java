
package Tarea3V5.Numeros;

public class Complejos {


    public static void main(String[] args) {
        
        Complejo c1 = new Complejo(3,4);
        Complejo c2 = new Complejo(1,7);
        
        c1.cambia_Real(5);
        c2.cambia_Imag(6);
        
        c1.sumar(c2);
        
        System.out.println(c1.toString());
        System.out.println(c2.toString());
       
    }
    
}
