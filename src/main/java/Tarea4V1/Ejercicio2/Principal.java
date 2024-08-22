
package Tarea4V1.Ejercicio2;

import java.util.Scanner;


public class Principal {


    public static void main(String[] args) {
       
        
        int num1 = 0;
        int num2 = 0;
        int numDivisiones = 0;
        double resultado = 0;
        
        
        Scanner entrada = new Scanner(System.in);
        
        while(num1 != -1 && num2!= -1){
            
            try {
                
                System.out.println("Introduce numero el dividendo: ");
                num1 = entrada.nextInt();

                System.out.println("Introduce numero el divisor: ");
                num2 = entrada.nextInt();

                if(num1 != -1 && num2 != -1){

                    resultado = num1 /num2;
                    System.out.println("Resultado: "+resultado);
                    numDivisiones++;  
                
                }  
            } catch (ArithmeticException e) {
                System.out.println("No se puede dividir entre 0");
            }
        
        System.out.println("Numero de divisiones = " +numDivisiones );
        

        }
    
    }
}
