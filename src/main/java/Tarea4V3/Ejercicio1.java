
package Tarea4V3;

import java.util.Scanner;


public class Ejercicio1 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        
        for (int i = 0; i < 5; i++) {
            
            System.out.println("Introduzca un número: ");
            int num = entrada.nextInt();
            
            if(num < 0){
                System.out.println("El número es negativo");
            }else{
                
                boolean esPrimo = true;
                
                
                for (int j = (int) Math.sqrt(num); j > 1 && esPrimo; j--) {
                    if(num % j == 0){
                        esPrimo = false;
                    }
                    
                }
                
                if(esPrimo){
                    System.out.println("El número es primo");
                }else{
                    System.out.println("El número no es primo");
            }
            }
        }  
    }
}
