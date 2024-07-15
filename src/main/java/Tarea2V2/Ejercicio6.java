/* Diseña un programa Java que cree un tipo enumerado para las siguientes razas
de perro: Mastin, Terrier, Bulldog, Pekines, Caniche y Galgo. 

El programa debe realizar las siguientes operaciones:

- Crea una variable denominada var1 del tipo enumerado. Asígnale un valor.
- Crea una variable denominada var2 del tipo enumerado. Asígnale un valor.
- Muestra por pantalla el valor obtenido de comparar ambas variables.

Investiga sobre la posibilidad de averiguar la posición que ocupa un determinado valor
en el enumerado así como mostrar la cantidad de valores que contiene. Si lo consigues,
muestra la posición de las dos variables en el tipo enumerado.

 */

package Tarea2V2;


public class Ejercicio6 {
    
    public static void main(String[] args){
        
        RazasEjercicio6 var1 = RazasEjercicio6.Caniche;
        RazasEjercicio6 var2 = RazasEjercicio6.Mastin;
        
        System.out.println(var1 == var2);
        System.out.println(var1.getIndex());
        System.out.println(var2.getIndex());
        System.out.println(RazasEjercicio6.values().length);
      
    }

}
