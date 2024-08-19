

package Tarea3V5;

import java.util.Locale;
import java.util.Scanner;


public class Trabajador {
    
    String nombre;
    int edad;
    float altura;
    
    public Trabajador (){
        nombre = "Alberto Garcia";
        altura = 1.79f;
        edad = 29;
    }
    
    public Trabajador(String nombre, int edad, float altura){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;   
    }
    
    
    String consulta_Nombre(){
        return nombre;
    }
    
    void cambia_Nombre(String nom){
        nombre = nom;
    }
    
    int consulta_Edad(){
        return edad;
    }
    
    void cambia_Edad(int e){
        edad = e;
    }
    
    float consulta_Altura(){
        return altura;
    }
    
    void cambia_Altura(float a){
        altura = a;
    }
    

    public void principal(){
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        
        System.out.println("Introduce un nombre: ");
        nombre = entrada.next();
     

        System.out.println("Introduce una edad: ");
        edad = entrada.nextInt();
             
        
        System.out.println("Introduce una altura: ");
        altura = entrada.nextFloat();

        
        
        System.out.println(nombre);
        System.out.println(altura);
        System.out.println(edad);
    }
    
    
    
}
