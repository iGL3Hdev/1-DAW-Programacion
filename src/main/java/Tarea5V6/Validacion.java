
package Tarea5V6;

import java.time.LocalDate;


public class Validacion {
    
    public static boolean estaVacio(String cadena){
        return cadena.trim().equals("");
    }
    
    public static boolean esPositivo(int numero){
        return numero >= 0;
    }
    
        public static boolean esPositivo(double numero){
        return numero >= 0;
    } 
    
    public static boolean estaEnRango(int valor, int min, int max){
        return valor >=  min  && valor  <= max;
    }
    
    public static boolean fechaMayorHoy(LocalDate fecha){
        return fecha.isAfter(LocalDate.now());
    }
    
    public static void validarDNI(String DNI) throws Exception{
        
        if(DNI.length() != 9){
            throw new Exception("La longitud del DNI es incorrecta");
        }
        
        String DNInumString = DNI.substring(0, DNI.length() -1 );
        
        int DNInum;
        
        try {
            
            DNInum = Integer.parseInt(DNInumString);
            
        } catch (NumberFormatException e) {
            throw new Exception ("El formato de los números no es correcto");
        }
        
 
        char letraDNI = DNI.charAt(DNI.length() -1);
        
        char letrasNIF[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        
        boolean existe = false;
        
        for (int i = 0; i < letrasNIF.length; i++) {
            if(letrasNIF[i] == letraDNI) {
                existe = true;
            }
            
        }
        
        if(!existe){
            throw new Exception("La letra no es valida");
        }
        
        int resto = DNInum % 23;
        
        char letra = letrasNIF[resto];
        
        if(!DNI.equals(DNInumString + letra)){
            throw new Exception("El DNI no es correcto");
        }
        
    }
    
    

}
