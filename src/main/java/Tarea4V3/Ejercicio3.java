
package Tarea4V3;

import java.util.Scanner;


public class Ejercicio3 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número en el intervalo mínimo: ");
        int min = entrada.nextInt();
        
        System.out.println("Introduce un número en el intervalo máximo: ");
        int max = entrada.nextInt();
        
        if(min > max){
            int aux = max;
            max = min;
            min = aux;
        }
        
        final int NUM_INT = 10;
        final String NOMBRE = "CARLOS";
        
        int numOculto = (int)Math.floor(Math.random()*(max-min+1)+(min));
        int numIntentos = 1;
        int numJugador = 0;
        boolean acertado = false;
        
        while(numIntentos <= NUM_INT && !acertado){
            
            System.out.println(NOMBRE + " , introduce tu intento "+numIntentos+ " para adivinar el número del intervalo [" +min + " , "+max+ "]");
            numJugador = entrada.nextInt();
            
            if(numJugador == numOculto){
                acertado = true;
                System.out.println("Has ganado, has necesitado "+numIntentos+ "intentos");
            }else{
                if(numJugador > numOculto){
                    System.out.println("El número oculto es menor");
                }else{
                    System.out.println("El número oculto es mayor");
                }

                System.out.println("Te quedan "+(NUM_INT - numIntentos)+ " intentos");
                numIntentos++;
            }
        }
        if(!acertado){
            System.out.println("Has perdido, te has quedado sin intentos");
        }
        
        
        
        
        
        
        

    }
    
}
