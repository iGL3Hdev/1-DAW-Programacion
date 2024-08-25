
package Tarea4V3;

import java.util.Scanner;


public class Ejercicio2 {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numPares = 0; 
        int numMult3 = 0;
        int num;
        
        String respuesta = "";
        
        
        while(!respuesta.equalsIgnoreCase("Y")){
            
            System.out.println("Introduzca un número: ");
            num = entrada.nextInt();
            
            if(num % 2 == 0){
                numPares++;
            }
            
            if(num % 3 == 0){
                numMult3++;
            }
            
            System.out.println("¿Quieres terminar? Escribe Y para finalizar");
            respuesta = entrada.next();
        }
        
        System.out.println("Numero de pares: "+numPares);
        System.out.println("Numero de múltiplos de 3: "+numMult3);
        
        
        if(numPares == numMult3){
            System.out.println("Hay tantos pares como multiplos de 3");
        }else if(numPares > numMult3){
            System.out.println("Hay más pares que múltiplos de 3");
        }else{
            System.out.println("Hya mas múltiplos de 3 que pares");
        }
                
    }
    
}
