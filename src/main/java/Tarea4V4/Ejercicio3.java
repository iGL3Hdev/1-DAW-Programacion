
package Tarea4V4;

import java.util.Scanner;

public class Ejercicio3 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            
            System.out.println("Introduce un capital: ");
            long capital = entrada.nextLong();
            
            System.out.println("Introduce un porcentaje de rentabilidad");
            double porc = entrada.nextDouble();
            
            double rentabilidad = (porc / 100) * capital;
            double rentabilidad12m = rentabilidad * 12;
            
            double capitalFinal = capital + rentabilidad12m;
            
            System.out.println("El capital final es de: " + capitalFinal);
            
        } catch (Exception e) {
            System.out.println("Debes escribir un número");
        }
        
        
        
    }
    
}
