
package Tarea4V3;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Ejercicio4 {
    
    public int pedirEdad(){
        
        Scanner entrada = new Scanner(System.in);
        
        int edad = 0;
        
        do {
            
            try {
                
                System.out.println("Introduce una edad mayor que 0");
                edad = entrada.nextInt();
            
                if(edad < 0){
                System.out.println("Debes introducir una edad mayor que 0");
                }
  
            } catch (InputMismatchException e) {
                entrada.next();
                System.out.println("Debes introducir un número entero");
                edad = -1;
            }

            
        } while (edad < 0);
        
        return edad;
        
    }
    
    public void classificarEdad(String nombre, int edad){
        
        String rango = " ";
        
        if(edad >= 0 && edad <= 25){
            rango = "A";
        }else if(edad > 26 && edad <= 50){
            rango ="B";
        }else{
            rango = "C";
        }
        
        int decada = edad + 10;
        
        System.out.println(nombre + ", estás clasificado como: "+rango+ " y dentro de una decada tendrás "+decada+ " años");
    }


    public static void main(String[] args) {

        int edad;
        String nombre; 
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        
        System.out.println("Introduce el nombre: ");
        nombre = entrada.next();
        
        Ejercicio4 p = new Ejercicio4();
        
        
        edad = p.pedirEdad();
        p.classificarEdad(nombre, edad);
    }
    
}
