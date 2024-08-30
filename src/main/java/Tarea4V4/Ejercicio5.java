
package Tarea4V4;

import java.util.Scanner;


public class Ejercicio5 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        String clave = "eureka";
                
                
        
        System.out.println("Escribe una clave: ");
        String claveUsuario = entrada.next();
        
        if(clave.equals(claveUsuario)){
            System.out.println("Has acertado");
        }else{
            System.out.println("No has acertado");
        }
       
    }
    
}
