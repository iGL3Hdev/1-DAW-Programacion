
package Tarea3V3;

import java.util.Scanner;


public class Personaje {
    
    final int MAX_FUERZA = 100;
    final int MAX_INTELIGENCIA = 100;
    
    static int numeroPersonajes;
    
    String nombre;
    int edad;
    int altura;
    int inteligencia;
    int fuerza;
    
    String consultaNombre(){
        return this.nombre;
    }
    
    void cambiaNombre(String nombre){
        this.nombre = nombre;
    }
    
    int consultaEdad(){
        return this.edad;
    }
    
    void cambiaEdad(int edad){
        this.edad = edad;
    }
    
    int consultaAltura(){
        return this.altura;
    }
    
    void cambiaAltura(int altura){
        this.altura = altura;
    }
    
    int consultaInteligencia(){
        return this.inteligencia;
    }
    
    void cambiaInteligencia(int inteligencia){
        this.inteligencia = inteligencia;
    }
    
    int consultafuerza(){
        return this.fuerza;
    }
    
    void cambiafuerza(int fuerza){
        this.fuerza = fuerza;
    }
    
    
    
    
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("Introduce un nombre: ");
        String nombre = entrada.next();
        
        Personaje p1 = new Personaje();
        p1.cambiaNombre(nombre);
        
        System.out.println("Nombre: " +p1.consultaNombre());
        
        p1.cambiaEdad(50);
        p1.cambiaAltura(100);
        p1.cambiafuerza(40);
        p1.cambiaInteligencia(60);
        
        System.out.println("Edad: " +p1.consultaEdad() );
        System.out.println("Altura: " +p1.consultaAltura());
        System.out.println("Fuerza: " +p1.consultafuerza());
        System.out.println("Inteligencia: " +p1.consultaInteligencia());
        
  }
    
  
            

}
