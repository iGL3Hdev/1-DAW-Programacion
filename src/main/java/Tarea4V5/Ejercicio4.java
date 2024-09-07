
package Tarea4V5;

import java.util.Scanner;


public class Ejercicio4 {

 
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce el año");
        int anio = entrada.nextInt();
        
        if(anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0){
            System.out.println("El año es bisiesto");
        }else{
            System.out.println("El año no es bisiesto");
        }
    }
    
}
