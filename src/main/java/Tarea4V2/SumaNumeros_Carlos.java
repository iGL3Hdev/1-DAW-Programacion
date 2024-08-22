
package Tarea4V2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SumaNumeros_Carlos {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
      
        int numero = 0;
        int suma = 0;
        
        do {
            
            try {
                
                System.out.println("Introduce un número, -1 para salir");
                numero = entrada.nextInt();
                
                if(numero != -1){
                    suma += numero;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número correcto");
                entrada.next();
            }
       
        } while (numero != -1 );
        
        System.out.println("Suma: "+ suma);

    }
    
}
