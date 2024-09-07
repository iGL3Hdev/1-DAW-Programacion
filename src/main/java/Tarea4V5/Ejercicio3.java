
package Tarea4V5;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio3 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        
        System.out.println("Introduce la nota del examen: ");
        double nota = entrada.nextDouble();
        
        if(nota >= 0 && nota < 3){
            System.out.println("Muy deficiente");
        }else if(nota >=3 && nota < 5){
            System.out.println("Insuficiente");
        }else if(nota >= 5 && nota < 6.5){
            System.out.println("Bien");
        }else if(nota >= 6.5 && nota < 9){
            System.out.println("Notable");
        }else if(nota >= 9 && nota <= 10){
            System.out.println("Sobresaliente");
        }else{
            System.out.println("Debes introducir un valor entre 0 y 10");
        }
        
    }
    
}
