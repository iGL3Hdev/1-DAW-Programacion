

package Tarea5V4;

import java.time.LocalDate;


public class Visita {
    
    private String codVisita;
    private LocalDate fechaVisita;
    private Paciente paciente;
    private Medico medico;
    private int tipoVisita;
    private String descripcion;
    private String tratamiento;
    private double precio;
    
    public static final int CONSULTA = 0;
    public static final int REVISION = 1;
    public static final int RECETAS = 2;
    public static final int URGENCIAS = 3;
    
    public static final int PRECIO_MINIMO = 50;
    
    public static int numRevisiones = 0;
    public static int numRecetas = 0;
    public static int numConsultas = 0;
    public static int numUrgencias = 0;
    
    
    public Visita(String codVisita, LocalDate fechaVisita, Paciente paciente,
            Medico medico, int tipoVisita, String descripcion, String tratamiento,
            double precio){
        this.codVisita = codVisita;
        this.fechaVisita = fechaVisita;
        this.paciente = paciente;
        this.medico = medico;
        this.tipoVisita = tipoVisita;
        this.descripcion = descripcion;
        this.tratamiento = tratamiento;
        this.precio = precio;
    }
    
    
    public String getCodVisita(){
        return codVisita;
    }

    public void setCodVisita(String codVisita){
        this.codVisita = codVisita;
    }
    
    public LocalDate getFechaVisita(){
        return fechaVisita;
    }
    
    public void setFechaVisita(LocalDate fechaVisita){
        this.fechaVisita = fechaVisita;
    }
    
    public Paciente getPaciente(){
        return paciente;
    }
    
    public void setPaviente(Paciente paciente){
        this.paciente = paciente;
    }
    
    public Medico getMedico(){
        return medico;
    }
    
    public void setMedico(Medico medico){
        this.medico = medico;
    }
    
    public int getTipoVisita(){
        return tipoVisita;
    }
    
    public void setTipoVisita(int tipoVisita){
        this.tipoVisita = tipoVisita;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getTratamiento(){
        return tratamiento;
    }
    
    public void setTratamiento(String tratamiento){
        this.tratamiento = tratamiento;
    }
    
    public double getPrecio(){
        return precio;
    }
    
    public void setPrecio(double precio){
        this.precio = precio;
    }
    
    
    @Override
    public String toString(){
        return "visita: "+codVisita+"\n"
                +"Paciente: ("+paciente.getCodigo()+")"+paciente.getNombre()+"\n"
                +"Tipo de Visita: "+tipoVisita+"\n"
                +"Fecha: "+fechaVisita+"\n"
                +"Medico: "+medico.getNombre()+"\n"
                +"Precio: "+precio;
    }
    
    public static int devuelveNumVisita(int tipo){
        
        switch(tipo){
            case CONSULTA:
                return Visita.numConsultas;
            case RECETAS:
                return Visita.numRecetas;
            case REVISION:
                return Visita.numRevisiones;
            case URGENCIAS: 
                return Visita.numUrgencias;
            default:
                return -1;
        }
    }
        
        
        
    public static void incrementarVisita(int tipo){
        
        switch(tipo){
            case CONSULTA:
                Visita.numConsultas++;
                break;
            case RECETAS:
                Visita.numRecetas++;
                break;
            case REVISION:
                Visita.numRevisiones++;
                break;
            case URGENCIAS:
                Visita.numUrgencias++;
                break;
            
            
        }
    }
 
     public static void reinicializarVisita(int tipo){
         Visita.numConsultas = 0;
         Visita.numRecetas = 0;
         Visita.numRevisiones = 0;
         Visita.numUrgencias = 0;
     }   
               
     public static void reinicializarVisita(){
         Visita.numConsultas = 0;
         Visita.numRecetas = 0;
         Visita.numRevisiones = 0;
         Visita.numUrgencias = 0;
                 
     }
}
       
    
    
    
    
    
    
    
    
    
    
    
    

