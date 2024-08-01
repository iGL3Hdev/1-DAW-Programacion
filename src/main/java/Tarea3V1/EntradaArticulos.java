

package Tarea3V1;

import java.util.Locale;
import java.util.Scanner;


public class EntradaArticulos {
    
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        
        //Articulo 1
        
        Articulo art1 = new Articulo();
        
        System.out.println("Introduce el Codigo de barras: ");
        art1.setCodigo_barra(entrada.next());
        
        System.out.println("Introduce la Denominacion: ");
        art1.setdenominacion(entrada.next());
        
        System.out.println("Introduce las unidades: ");
        art1.setunidades(entrada.nextInt());
        
        System.out.println("Introduce el precio de compra: ");
        art1.setprecio_compra(entrada.nextDouble());
        
        System.out.println("Introduce el beneficio: ");
        art1.setbeneficio(entrada.nextInt());
        
        art1.calcularPVP();
        
        
        //Articulo 2
        
        
        
        
        //Articulo 3
        
        
        
    }

}
