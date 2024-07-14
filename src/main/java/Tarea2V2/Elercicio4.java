/* Diseña un programa Java que dada la edad de una persona, muestre un mensaje 
indicando si es mayor de edad. No se puede utilizar el operador if
*/

package Tarea2V2;

import java.util.Scanner;


public class Elercicio4 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la edad: ");
        int edad = entrada.nextInt();
        
        System.out.println(edad >= 18? "Es mayor de edad" : "No es mayor de edad");
        
    }
}
