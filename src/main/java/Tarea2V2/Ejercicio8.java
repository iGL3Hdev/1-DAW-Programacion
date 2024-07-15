/* Diseña un programa Java que dado el número de alumnos matriculados en programación, 
número de alumnos matriculados en Entornos de desarrollo y número de alumnos matriculados
en Base de datos. El programa deberá mostrar el % de alumnos matriculado en cada uno de
los tres módulos. Se supone que un alumno solo puede estar matriculado en un módulo.
Trata de mostrar un solo decimal en los porcentajes.

 */

package Tarea2V2;

import java.util.Scanner;


public class Ejercicio8 {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce cuántos alúmnos hay en programación: ");
        int prog = entrada.nextInt();
        
        System.out.println("Introduce cuántos alúmnos hay en entornos de desarrollo: ");
        int ent = entrada.nextInt();
        
        System.out.println("Introduce cuántos alúmnos hay en bases de datos: ");
        int bases = entrada.nextInt();
        
        
        int total = prog + ent + bases;
        
        double porcProg = (double) (prog*100)/total;
        double porcEnt = (double) (ent*100)/total;
        double porcBases = (double) (bases*100)/total;
        
        System.out.printf("Programacion: %.1f\n",porcProg);
        System.out.printf("Entornos de desarrollo: %.1f\n",porcEnt);
        System.out.printf("Bases de datos: %.1f\n",porcBases);
        
      
        
        
        
        
    }

}
