
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio6 {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int resultado;
        
        System.out.println("Introduzca la base A: ");
        int base = entrada.nextInt();
        
        System.out.println("Introduzca el exponente B:");
        int exponente = entrada.nextInt();
        
        resultado = base;

        for (int i = 0; i < exponente; i++) {
            
            resultado = (resultado * base);
            
        }
        
        System.out.println("El resulado de la potencia es: "+resultado);
        

    }
    
}
