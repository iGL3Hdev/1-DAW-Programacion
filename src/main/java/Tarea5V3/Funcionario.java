

package Tarea5V3;

import java.time.LocalDate;

public class Funcionario {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private LocalDate fechaIngreso;
    
    public Funcionario(){
        
    }
    
    public Funcionario(String nombre, String apellidos, int edad, LocalDate fechaIngreso){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.fechaIngreso = fechaIngreso;    
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public LocalDate getFechaIngreso(){
        return fechaIngreso;
    }
    
    public void setFechaIngreso(LocalDate fechaIngreso){
        this.fechaIngreso = fechaIngreso;
    }
    
    
    public String getInfo(){
        return "El funcionario "+this.nombre+ " , apellidos" +this.apellidos+ " , tiene"+this.edad+ "años e ingresó en el cuerpo "+this.fechaIngreso+"."; 
        
    }
    

}
