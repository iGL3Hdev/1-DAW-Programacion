
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio7 {


    public static void main(String[] args) {
  
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        boolean acertado = true;
        
        
        do {
            
                    System.out.println("Introduzca el login: ");
        String login = entrada.next();
        
        System.out.println("Introduce el password: ");
        String password = entrada.next();
        
        if(login.equals("admin") && password.equals("1234")){
            acertado = true;
        }else{
            System.out.println("No es correcto");
        }
            
        } while (!acertado);
        
        System.out.println("Es correcto");
        
    }
    
}
