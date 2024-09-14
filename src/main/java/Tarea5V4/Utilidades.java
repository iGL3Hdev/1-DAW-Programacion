

package Tarea5V4;

import java.time.LocalDate;


public class Utilidades {
    
    public static boolean mayorFecha(LocalDate fecha){
        return fecha.isAfter(LocalDate.now());
    }
    
    public static double precioVisita(int tipoVisita, Especialidad especialidad, double precioMinimo)throws Exception{
        
        double precioFinal = precioMinimo;
        
        switch(tipoVisita){
            
            case Visita.CONSULTA:
                if(especialidad == Especialidad.DIGESTIVO){
                    precioFinal = precioFinal * 1.15;
                }
                break;
                
            case Visita.REVISION:
                if(especialidad == Especialidad.GINECOLOGIA){
                    precioFinal = precioFinal * 1.1;
                }
                break;
                
            case Visita.URGENCIAS:
                if(especialidad != Especialidad.MCABECERA){
                    precioFinal = precioFinal * 1.5;
                }
                break;
                
            case Visita.RECETAS:
                precioFinal = precioFinal * 0.9;
                break;
                
            default:
                throw new Exception("No existe el tipo de visita");
   
        }
        return precioFinal;
    }
    
    public static boolean codigoValido(String codigo) throws Exception{
        
        boolean longitudMayor7 = codigo.length() == 7;
        boolean letras = false;
        boolean digitos = false;
        
        try {
            
            String[] letrasValidas = {"TR", "DI", "GI", "MC"};
            
            String subcadenaLetras = codigo.substring(0,2);
            
            for (int i = 0; i < letrasValidas.length; i++) {
                if(letrasValidas[i].equals(subcadenaLetras)){
                    letras = true;
                }             
            }
            
        } catch (StringIndexOutOfBoundsException e) {
        }
        
        try {
            String subcadenaNumeros = codigo.substring(2,7);
            Integer.parseInt(subcadenaNumeros);
            
            
        } catch (StringIndexOutOfBoundsException | NumberFormatException e) {
        }
        
        if(!longitudMayor7 && !letras && !digitos){
            throw new Exception("Codigo no valido");
        }
        
        return true;
    }

}
