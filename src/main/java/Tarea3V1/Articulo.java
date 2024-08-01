
package Tarea3V1;


public class Articulo {
    
    private String codigo_barra;
    private String denominacion;
    private int unidades;
    private double precio_compra;
    private int beneficio; //valor entre 0-100
    private double pvp;
    
    public Articulo(){
        
    }
   
    public Articulo(String codigo_barra, String denominacion, int unidades, double precio_compra,
                    int beneficio, double pvp){
        this.codigo_barra = codigo_barra;
        this.denominacion = denominacion;
        this.unidades = unidades;
        this.precio_compra = precio_compra;
        this.beneficio = beneficio;
        this.calcularPVP();
    }
    
    public void setCodigo_barra(String codigo_barra){
        this.codigo_barra = codigo_barra;
    }
    
    public  String getCodigo_barra(){
        return this.codigo_barra;
    }
    
    public void setdenominacion(String denominacion){
        this.denominacion = denominacion;
    }
    
    public String getdenominacion(){
        return this.denominacion;
    }
    
    public void setunidades(int unidades){
        this.unidades = unidades;
    }

    public int getunidades(){
        return this.unidades;
    }

    public void setprecio_compra(double precio_compra){
        this.precio_compra = precio_compra;
        this.calcularPVP();
    }
    
    public double getprecio_compra(){
        return this.precio_compra;
    }
    
    public void setbeneficio(int beneficio){
        this.beneficio = beneficio;
        this.calcularPVP();
    }
    
    public int getbeneficio(){
        return this.beneficio;
    }
    
    public double getpvp(){
        return pvp;
    }
    
    public void calcularPVP(){
        pvp = precio_compra + ((precio_compra * beneficio) / 100);
    }
    
    
}
