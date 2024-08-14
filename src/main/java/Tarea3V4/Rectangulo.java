

package Tarea3V4;


public class Rectangulo {
    
    
    private float base;
    private float altura;
    
    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }
    
    public float getbase(){
        return base;
    }
    
    public void setbase(float base){
        this.base = base;
    }
    
    public float getaltura(){
        return altura;
    }
    
    public void setaltura(float altura){
        this.altura = altura;
    }
    
    public float getArea(){
        return this.base * this.altura;
    }
    
    @Override
    public String toString(){
        return "Area: "+ this.getArea() + ", Altura " + this.altura;
    }
    
    public boolean  isCuadrado(){
        return this.base == this.altura; 
    }
    

}
