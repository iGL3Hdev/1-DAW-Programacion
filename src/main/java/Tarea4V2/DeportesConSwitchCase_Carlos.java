
package Tarea4V2;

import java.util.InputMismatchException;
import java.util.Scanner;


public class DeportesConSwitchCase_Carlos {
    
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
        
        System.out.println("El deporte más apropiado es: ");
        
        if(temperatura > 30){
            System.out.println("Natación");
        }else{      
        switch(temperatura){
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
                System.out.println("Golf");
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                System.out.println("Tenis");
                break;
            case -9:
            case -8:
            case -7:
            case -6:
            case -5:
            case -4:
            case -3:
            case -2:
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Esquí");
                break;
            default:
                System.out.println("Damas");
        }
        }
    
    }
      
}
