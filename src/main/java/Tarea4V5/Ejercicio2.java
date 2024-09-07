
package Tarea4V5;

import java.util.Locale;
import java.util.Scanner;


public class Ejercicio2 {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Introduce el número de horas trabajadas: ");
        int horas = entrada.nextInt();
        
        System.out.println("Introduce la tarifa de cada hora: ");
        double tarifa = entrada.nextDouble();
        
        double pago = 0;
        
        if(horas > 35){
            
            double extras = (horas - 35) * (tarifa * 1.5);
            pago = (35 * tarifa) + extras;
            
        }else{
            
            pago = horas * tarifa;
            
        }
        
        System.out.println("El sueldo bruto es: " + pago);
        
        if(pago > 500){
            
            double libreImpuestos75 = 0;
            double libreImpuestos55 = 55;
            
            if(pago < 900){
                
                libreImpuestos75 = 400 * 0.75;
                libreImpuestos55 = (pago - 900) * 0.55;
            }
            
            pago = 500 + libreImpuestos75 + libreImpuestos55;
        }
        
        System.out.println("El sueldo neto es: " + pago);
        
        
        
        
    }
    
}
