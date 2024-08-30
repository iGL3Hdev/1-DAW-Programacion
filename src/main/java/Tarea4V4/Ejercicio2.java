
package Tarea4V4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio2 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        try {
            
            System.out.println("Escribe el número de niños: ");
            int ninos = entrada.nextInt();
        
            System.out.println("Escribe el número de niñas: ");
            int ninas = entrada.nextInt();
        
            int total = ninos + ninas;
            
            double porcNinos = ninos * 100/total;
            double porcNinas = ninas * 100/total;
            
            System.out.println("El porcentaje de niños sería: " + porcNinos + " y el porcentaje de niñas sería: "+ porcNinas);
            
            
            
            
        } catch (InputMismatchException e) {
            System.out.println("Debes escribir un número");
        }
                
  
        
    }
    
}
