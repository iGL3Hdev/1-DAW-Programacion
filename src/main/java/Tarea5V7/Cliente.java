

package Tarea5V7;


public class Cliente {
    
    private String dni;
    private String nombre;
    private String apellidos;
    private String direccion;
    private String poblacion;
    private int codigoPostal;
    
    public Cliente(){
        
    }
    
    public Cliente(String dni) throws Exception{
        this.dni = dni;
        this.validarDNI();
    }
    
    public Cliente(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public Cliente(String dni, String nombre, String apellidos, String direccion,
            String poblacion, int codigoPostal){
        this.dni = dni;
        this.validarDNI();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.codigoPostal = codigoPostal;
    }
    
    public String getDni(){
        return dni;
    }
    
    public void setDni(String dni){
        this.dni = dni;
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
    
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    
    public String getPoblacion(){
        return poblacion;
    }
    
    public void setPoblacion(String poblacion){
        this.poblacion = poblacion;
    }
    
    public int getCodigoPostal(){
        return codigoPostal;
    }
    
    public void setCodigoPostal(int codigoPostal){
        this.codigoPostal = codigoPostal;
    }
    
    
    @Override
    public String toString(){
        return "Cliente{" + "dni=" + dni + " , nombre= " + nombre + ", apellidos" + apellidos +
                " , direccion = " + direccion + " , poblacion= " + poblacion + 
                
                " , codigoPostal = " +codigoPostal + ']';
    }
    
    public boolean existe_DNI(){
        
        Cliente clienteEncontrado = null;
        
        if(Principal.cliente1 != null && Principal.cliente1.getDNI().equals(this.dni)){
            clienteEncontrado = Principal.cliente1;
        }
    }
    
            
            

}
