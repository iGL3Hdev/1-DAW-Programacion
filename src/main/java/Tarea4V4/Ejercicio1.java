
package Tarea4V4;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio1 {

  
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        
        try {
            
            System.out.println("Introduzca un número mayor que 0: ");
            num = entrada.nextInt();
        
            
            if(num <= 0){
                System.out.println("El número debe ser mayor que 0");
            }else{
                double cuadrado = Math.pow(num, 2);
                double raiz = Math.sqrt(num);
                
                System.out.println("Cuadrado =  " + cuadrado);
                System.out.println("Raiz = " + raiz);
                
            }
               
            
        } catch (InputMismatchException e) {
            
            System.out.println("Debes excribir un número");
        }
        

    }
    
}
