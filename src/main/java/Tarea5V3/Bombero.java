
package Tarea5V3;

import java.time.LocalDate;


public class Bombero extends Funcionario{
    
    private Puesto puesto;
    private String parque;
    private static int numBomberos = 0;
    
    
    public Bombero(){
        
    }
    
    public Bombero(Puesto puesto, String parque, String nombre, String apellidos, int edad, LocalDate fechaIngreso){
        super(nombre, apellidos, edad, fechaIngreso);
        this.puesto = puesto;
        this.parque = parque;
        Bombero.numBomberos++;
    }
    
    
    public Puesto getPuesto(){
        return puesto;
    }
    
    public void setPuesto(Puesto puesto){
        this.puesto = puesto;
    }
    
    public String getParque(){
        return parque;
    }
    
    public void setParque(String parque){
        this.parque = parque;
    }
    
    public static int getNumBomberos(){
        return numBomberos;
    }
    
    
    public void calculoAntiguedad(){
        int anios = this.calcularAnios();
        
        if(anios >= 1 && anios < 5){
            this.puesto.setSueldo(this.puesto.getsueldo() *1.01);
        }else if(anios >= 5 && anios <10){
            this.puesto.setSueldo(this.puesto.getsueldo() *1.05);     
        }else if(anios >=10){
            this.puesto.setSueldo(this.puesto.getsueldo() *1.1);
        }
    }
    
    private int calcularAnios(){
        
        LocalDate actual = LocalDate.now();
        
        int diaActual = actual.getDayOfMonth();
        int mesActual = actual.getMonthValue();
        int anioActual = actual.getYear();
        
        int diferencia = super.getFechaIngreso().getYear();
        
        if(mesActual <= super.getFechaIngreso().getMonthValue()){
            if(mesActual == super.getFechaIngreso().getMonthValue()){
                if(super.getFechaIngreso().getDayOfMonth() > diaActual){
                    diferencia--;
                }
            }else{
                diferencia--;
            }
        }
        
        return diferencia;
        
    }
    
    

    @Override
    public String getInfo(){
        return super.getInfo()+ " En el puesto "+this.puesto.getNombrePuesto() + " y en el parque " +this.getParque();
    }
    
}
