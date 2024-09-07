
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio10 {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int numAcertar = 49;
        
        int numUsuario = 0;
        
        while(numUsuario != numAcertar) {
            
            System.out.println("Introduce un número: ");
            numUsuario = entrada.nextInt();
            
            if(numUsuario > numAcertar){
                System.out.println("menos");
            }else if(numUsuario < numAcertar){
                System.out.println("mayor");
            }else{
                System.out.println("Has acertado!!!");
            }
        }
        
    }
    
}
