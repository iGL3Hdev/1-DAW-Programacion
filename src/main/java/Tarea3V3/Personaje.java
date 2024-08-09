
package Tarea3V3;

import java.util.Scanner;


public class Personaje {
    
    final int MAX_FUERZA = 100;
    final int MAX_INTELIGENCIA = 100;
    
    static int numeroPersonajes = 0;
    
    String nombre;
    int edad;
    int altura;
    int inteligencia;
    int fuerza;
    
    public Personaje(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.altura = 0;
        this.inteligencia = 0;
        this.fuerza = 0;
        numeroPersonajes++;
    }
    
        public Personaje(String nombre, int edad, int altura, int inteligencia, int fuerza){
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.inteligencia = inteligencia;
        this.fuerza = fuerza;
        numeroPersonajes++;
    }
       
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
        
        if(inteligencia > this.MAX_INTELIGENCIA){
            this.inteligencia = this.MAX_INTELIGENCIA;
        }else{
            this.inteligencia = inteligencia;
        }        
    }
    
    int consultafuerza(){
        return this.fuerza;
    }
    
    void cambiafuerza(int fuerza){
        
        if(fuerza > this.MAX_FUERZA){
            this.fuerza = this.MAX_FUERZA;
        }else{
            this.fuerza = fuerza;         
        }
    }
    
    
    //apartadi 6
    public int sumarFuerza(Personaje p){
        return this.fuerza + p.consultafuerza();
    }
    
    
      public String toString() {
        return "Nombre: " + nombre + "; Edad: " + edad + " años; Altura: " + altura + " cm; Inteligencia:" + inteligencia + "; Fuerza: " + fuerza;
    }
    
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        System.out.println("Introduce un nombre: ");
        String nombre = entrada.next();
        
        Personaje p1 = new Personaje();
        p1.cambiaNombre(nombre);
        
        System.out.println("Nombre: " +p1.consultaNombre());
        
        //apartado 2
        
        p1.cambiaEdad(50);
        p1.cambiaAltura(100);
        p1.cambiafuerza(200);
        p1.cambiaInteligencia(150);
        
        System.out.println("Edad: " +p1.consultaEdad() );
        System.out.println("Altura: " +p1.consultaAltura());
        System.out.println("Fuerza: " +p1.consultafuerza());
        System.out.println("Inteligencia: " +p1.consultaInteligencia());
        
        
        //apartado 3
        
        Personaje p2 = new Personaje();
        
        System.out.println("El valor de la fuerza es: "+p2.fuerza);
        System.out.println("El valor de la fuerza es: "+p2.consultafuerza());
        
        System.out.println("El valor del nombre es: "+p2.consultaNombre());
        System.out.println("El valor de la edad: " +p2.consultaEdad());
        System.out.println("El valor de la altura es: " +p2.consultaAltura());
        System.out.println("El valor de la fuerza es: " +p2.consultafuerza());
        System.out.println("El valor de la inteligencia: " +p2.consultaInteligencia());
        
        
        //apartado 4
        
        Personaje p3 = new Personaje ("Frodo", 33, 126, 98,38);
        
        
        //apartado 5
        
        System.out.println(p3.toString());
        
        //apartado 7
        
        Personaje p4 = new Personaje();
        
        System.out.println(p4.toString());
        
        Personaje p5 = new Personaje("Frodo", 33, 126, 98, 38);
        Personaje p6 = new Personaje("Aragorn", 45, 185, 88, 92);
        Personaje p7 = new Personaje("Legolas", 2931, 178, 93, 84);
        
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        
        p5.cambiaEdad(30);
        p6.cambiaAltura(180);
        p7.cambiaInteligencia(90);
        
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        
        Personaje p8 = new Personaje("Isiidur" , 40, 175, 70, 80);
        System.out.println(p8.toString());
        
        p8.cambiaAltura(190);
        System.out.println(p8.toString());
        
        System.out.println("La suma de la fuerza de " +p5.consultaNombre()+ " y " +p7.consultaNombre()+ " es: " + p5.sumarFuerza(p7));
        
        System.out.println("numero de personajes: "+Personaje.numeroPersonajes);
        
        System.out.println("Máx fuerza: " +p1.MAX_FUERZA);
        
        
        
  }
    
  
            

}
