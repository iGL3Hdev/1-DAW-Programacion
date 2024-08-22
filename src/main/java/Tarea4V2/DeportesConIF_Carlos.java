
package Tarea4V2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DeportesConIF_Carlos {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        boolean correcto = false;
        int temperatura = 0;
        
        
        do{
            try {
                
                System.out.println("Introduce la temperatura: ");
                temperatura = entrada.nextInt();
                correcto = true;
                
            } catch (InputMismatchException e) {
                System.out.println("Debe introducir un valor correcto");
                correcto = false;
                entrada.next();
            }

            
        }while(!correcto);

    
        
        if(temperatura > 30){
            System.out.println("Se puede realizar natación");
        }else if(temperatura > 15 && temperatura <= 30){
            System.out.println("Se puede practicar golf");
        }else if(temperatura > 5 && temperatura <= 15){
            System.out.println("Se puede practicar tenis");
        }else if(temperatura > -10 && temperatura <= 5){
            System.out.println("Se puede esquiar");
        }else if(temperatura < -10){
            System.out.println("Se puede jugar a las damas");
        }
    }
    
}
