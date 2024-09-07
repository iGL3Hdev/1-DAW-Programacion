
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio8 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int n = 0;
        
        do {
            
            try {
                
                System.out.println("Introduce un número (entre 0 y 20)");
                n = entrada.nextInt();
                
                if(!(n >= 0 && n <= 20)){
                    throw new Exception();
                }  
                
            } catch (Exception e) {
                System.out.println("El valor debe estar entre 0 y 20");
            }
             
        } while (!(n >= 0 && n <= 20));
        
        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j < i; j++) {
                System.out.println(i);
            }
            System.out.println("");
        }
        
        
     

    }
    
}
