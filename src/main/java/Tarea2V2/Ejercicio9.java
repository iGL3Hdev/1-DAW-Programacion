/* Aunque aparentemente los años bisiestos son aquellos que son múltiplo de 4,
no es del todo preciso, ya que años como 1900 y como 2100 no fueron, ni serán, 
bisiestos respectivamente. Existe una explicación física que tiene que ver con 
que el año del calendario no coincide exactamente, en duración, con año solar. 
Así, un cálculo más exacto indica que la duración real de un año es de 365,2425 días. 
Para corregir este desfase, se utiliza el criterio de que se considerara año bisiesto 
aquel que sea divisible por 4 pero no por 100 salvo que sea divisible por 400. 
Por esto 1900 no es bisiesto, 1904 si y 2000 también. Diseña un programa Java que dado un año 
indique si es bisiesto o no.

 */

package Tarea2V2;

import java.util.Scanner;


public class Ejercicio9 {
  
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        int año = entrada.nextInt();
        
        if((año % 4 == 0 & año % 100 != 0) || año % 400 == 0){
            System.out.println("Es bisiesto");
        }else{
            System.out.println("No es bisiesto");
        }
        
        
    }

}
