

package Tarea3V5.Numeros;


public class Complejo {
    
    double real;
    double imag;
    
    public Complejo(){
        this.real = 0;
        this.imag = 0;
    }
    
    public Complejo(double real, double imag){
        this.real = real;
        this.imag = imag;
    }
    
    
    public double consulta_Real(){
        return this.real;
    }
    
    public void cambia_Real(double r){
        this.real = r;
    }
    
    public double consulta_Imag(){
        return this.imag;
    }
    
    public void cambia_Imag(double i){
        this.imag = i;
    }
    
    
    @Override
    public String toString(){
        return this.real + " + " + this.imag + "i";
    }
    
    public void sumar(Complejo b){
        this.real += b.consulta_Real();
        this.imag += b.consulta_Imag();
        
    }
    
    

}
