

package Tarea3V4;

public class Principal {
    
    public static void main(String[] args){
        
        Rectangulo r1 = new Rectangulo();
        Rectangulo r2 = new Rectangulo(5,5);
        
        System.out.println("Base r1: "+r1.getbase());
        
        r1.setbase(20);
        r1.setaltura(10);
        
        System.out.println("Base r1: "+r1.getbase());
        System.out.println("r1 toString: "+r1.toString());
        
        System.out.println("¿r2 es cuadrado?" + r2.isCuadrado());
        System.out.println("r2 toString: "+r2.toString());
    }

}
