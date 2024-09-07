
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio1 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int num = 0;
        
        do {
            
            System.out.println("Introduce un número: ");
            num = entrada.nextInt();
            
            if(num < 0){
                System.out.println("Debes introducir un número positivo");
            }
            
        } while (num < 0);
        
        
        System.out.println("El factorial es: " + factorial(num));
        
    }
    
    public static int factorial(int n){
        
        int factorial = n;
        
        for (int i = n-1; i > 1; i--) {
            factorial *= i;
            
        }
        return factorial;
    }
    
    public static int factorialRec(int n){
        
        if (n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }
    
}