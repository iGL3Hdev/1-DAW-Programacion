
package Tarea4V2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class SumaNaturalesConWhile_Carlos {

 
    public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
        
        int n = 0;
        int suma = 0;
        boolean correcto = false;
        
        do{
            try {
                
                System.out.println("Introduce un número natural: ");
                n = entrada.nextInt();

                if(n > 0){
                    correcto = true;
                }else{
                    System.out.println("Deves introducir un número natural");
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un número: ");
                entrada.next();
            }
            
        }while(!correcto);
        
        int i = 1;
        
        while(i <= n){
            
            suma += i;
            i++;
        
        }
        
        System.out.println("Suma: " + suma);

    }
    
}
