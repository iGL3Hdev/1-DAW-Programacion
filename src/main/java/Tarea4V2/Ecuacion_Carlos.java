
package Tarea4V2;


public class Ecuacion_Carlos {
    
    private int a;
    private int b;
    private int c;
    
    public Ecuacion_Carlos(){
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }
    
    public Ecuacion_Carlos(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public int getA(){
        return a;
    }
    
    public void setA(int a){
        this.a = a;
    }
    
    public int getB(){
        return b;
    }
    
    public void setB(int b){
        this.b = b;
    }
    
    public int getC(){
        return c;
    }
    
    public void setC(int c){
        this.c = c;
    }
    
    
    public double calcularX1(int a, int b, int c) throws ExceptionDiscrimanteNegativo {
        
        double X1 = (-b + Math.sqrt(this.comprobarDiscriminante(a, b, c))) / (2 * a);
        return X1;
        
    }
    
    
    
    
    public double calcularX2(int a, int b, int c) throws ExceptionDiscrimanteNegativo {
        
        double X1 = (-b - Math.sqrt(this.comprobarDiscriminante(a, b, c))) / (2 * a);
        return X1;
        
    }
    
    
    
    public int comprobarDiscriminante(int a, int b, int c) throws ExceptionDiscrimanteNegativo{
        
        int discriminante = (int) Math.pow(b, 2) - ( 4 * a * c);
        
        if(discriminante >= 0){
            return discriminante;
        }else{
            throw new ExceptionDiscrimanteNegativo("EL DISCRIMINANTE ES NEGATIVO: NO HAY SOLUCIONES REALES");
        }
        
    }

  
    public static void main(String[] args) {
        
        int a;
        int b;
        int c;
        
        a = 3;
        b = 2;
        c = -5;
        
        
        try {
            Ecuacion_Carlos miEcuacion = new Ecuacion_Carlos(a, b, c);
            
            double X1 = miEcuacion.calcularX1(a, b, c);
            double X2 = miEcuacion.calcularX2(a, b, c);

            System.out.println("La primera solución de la ecuación de segundo grado a=" + a + ", b=" + b + " c=" + c + " es: " + X1);
            System.out.println("La segunda solución de la ecuación de segundo grado a=" + a + ", b=" + b + " c=" + c + " es: " + X2);

        } catch (ExceptionDiscrimanteNegativo ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
    
}
