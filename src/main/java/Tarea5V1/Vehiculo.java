

package Tarea5V1;

import java.time.LocalDate;
import java.time.Period;


public class Vehiculo {
    
    private String marca;
    private String matricula;
    private int numKm;
    private LocalDate fechaMatriculacion;
    private String descripcion;
    private double precio;
    private String nombrePropietario;
    private String dniPropietario;
    
    public Vehiculo(){
        
    }
    
    public Vehiculo(String marca, String matricula, int numKm, LocalDate fechaMatriculacion,
            String descripcion, double precio, String nombrePropietario, String dniPropietario){
        this.marca = marca;
        this.matricula = matricula;
        this.numKm = numKm;
        this.fechaMatriculacion = fechaMatriculacion;
        this.descripcion = descripcion;
        this.precio = precio;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
    }
    
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMatricula(){
        return matricula;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public int getNumKm(){
        return numKm;
    }
    
    public void setNumKm(int numKm){
        this.numKm = numKm;
    }
    
    public LocalDate getFechaMatriculacion(){
        return fechaMatriculacion;
    }
    
    public void setFechaMatriculacion(LocalDate fechaMatriculacion){
        this.fechaMatriculacion = fechaMatriculacion;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    public String getNombrePropietario(){
        return nombrePropietario;
    }
    
    public void setNombrePropietario(String nombrePropietario){
        this.nombrePropietario = nombrePropietario;
    }   
    
    public String getDniPropietario(){
        return dniPropietario;
    }
    
    public void seetDniPropietario(String dniPropietario){
        this.dniPropietario = dniPropietario;
    }
    
    
    public int get_anios(){
        
        LocalDate f1 = this.fechaMatriculacion;
        LocalDate f2 = LocalDate.now();
        
        Period p = Period.between(f1,f2);
        
        return p.getYears();
        
    }
    
    @Override
    public  String toString(){
        return "Vehiculo{" + "marca: " +marca+ " ,matricula: " +matricula+ " ,numero de Kilometros: " +numKm+
                        " ,fecha de matriculación: "+fechaMatriculacion+ " ,descripción: "+descripcion+
                        ", precio: " +precio+ " ,nombrePropietario: " +nombrePropietario+ " ,dniPropietario: "+dniPropietario+'}';
    }
    
    
    
    
    

}
