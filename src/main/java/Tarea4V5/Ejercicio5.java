
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio5 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Introduzca un número: ");
        int numero = entrada.nextInt();
        
        
        for (int numeroEspacios = numero, numeroAsteriscos = 1;
                numeroEspacios > 0;
                numeroEspacios--, numeroAsteriscos += 2){
            
            for (int i = 0; i < numeroEspacios; i++) {
                System.out.print(" ");
                
            }
            
            for (int i = 0; i < numeroAsteriscos; i++) {
                System.out.print("*");
                
            }
            
            System.out.println(" ");
            
        }
       
    }
    
}
