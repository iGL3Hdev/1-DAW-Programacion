/* Diseña un programa en Java que dado un número de segundos, muestre en pantalla
cuantos minutos, horas y días contine*/ 


package Tarea2V2;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de segundos: ");
        int segundos = entrada.nextInt();
        
        int dias = segundos/86400;
        
        int seg_restantes = segundos % 86400;
        
        int horas = seg_restantes /3600;
        
        seg_restantes = seg_restantes % 3600;
        
        int minutos = seg_restantes % 60;
        
        System.out.println("Dias: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);
       
        
        
    }

}