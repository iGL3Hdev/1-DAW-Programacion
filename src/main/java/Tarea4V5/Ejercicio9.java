
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio9 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int cantidad;
        
        do {
            
            System.out.println("Introduce la cantidad multiplo de 5: ");
            cantidad = entrada.nextInt();
            
            if(cantidad %5 != 0){
                System.out.println("La cantidad debe ser múltiplo de 5");
            }
            
        } while (cantidad % 5 != 0);
        
        int[] billetes = {500, 200, 100, 50, 20, 10, 5};
        
        for (int i = 0; i < billetes.length && cantidad > 0; i++) {
            
            if(cantidad / billetes[i] > 0){
                System.out.println((cantidad/billetes[i]) + " billetes/de "+ billetes[i]+ " €");
                cantidad = cantidad % billetes[i];
                
            }
            
        }
        
        
    }
    
}
