
package Tarea5V7;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    
    
    static Cliente cliente1;
    static Cliente cliente2;
    static Cliente cliente3;
    static Cliente cliente4;
    static Cliente cliente5;
    
    static Scanner entrada = new Scanner(System.in);


    public static void main(String[] args) {
        
        entrada.useDelimiter("\n");
        
        boolean salir = false;
        int opcion;
        
        while (!salir){
            
            try {
                
            System.out.println("1.- Nuevo Cliente: ");
            System.out.println("2.- Consulta de un cliente por DNI: ");
            System.out.println("3.- Consulta de un cliente por Apellidos y Nombre: ");
            System.out.println("4.- Listado de todos los clientes: ");
            System.out.println("5.- Salir");
            opcion = entrada.nextInt();
            
            switch(opcion){
                
                case 1:
                    
                    System.out.println("Indica el número de cliente (entre 1 y 5)");
                    int numCliente = entrada.nextInt();
                    
                    Validacion.esta_en_rango(numCliente, 1, 5);
                    
                    Cliente cliente = entrada_datos();
                    
                    switch(numCliente){
                        case 1:
                            cliente1 = cliente;
                            break;
                            
                        case 2:
                            cliente2 = cliente;
                            break;
                            
                        case 3:
                            cliente3 = cliente;
                            break;
                            
                        case 4:
                            cliente4 = cliente;
                            break;
                            
                        case 5:
                            cliente5 = cliente;
                            break;
                            
                        default:
                            System.out.println("Introduzca un número del 1 al 5");        
                    }
                    break;
                    
                case 2:
                    
                    consulta_dni();
                    
                    break;
                    
                case 3:
                    
                    consulta_nombre();
                    
                    break;
                    
                case 4:
                    
                    listado_Clientes();
                    
                    break;
                                      
                case 5:
                    
                    salir = true;
                    
                    break;
                
                
            }   
            } catch (InputMismatchException e) {
                    System.out.println("Debes insertar un número");
                    entrada.next();
            } catch (Exception ex){
                    System.out.println(ex.getMessage());
            }  
        }
    }
    
    public static Cliente entrada_datos() throws Exception{
        
        System.out.println("Introduzca el dni: ");
        String dni = entrada.next();
        
        System.out.println("Introoduzca el nombre: ");
        String nombre = entrada.next();
        
        System.out.println("Introduzca el apellido: ");
        String apellidos = entrada.next();
        
        System.out.println("Introduzca la dirección: ");
        String direccion = entrada.next();
        
        System.out.println("Introduzca la población: ");
        String poblacion = entrada.next();
        
        System.out.println("Introduzca el código postal: ");
        int codPostal = entrada.nextInt();
        
        Cliente cliente = new Cliente(dni, nombre, apellidos, direccion, poblacion, codPostal);
        
        return cliente;
            
    }
        
        public static void consulta_dni() throws Exception{
            
            System.out.println("Introduce el dni: ");
            String dni = entrada.next();
            
            Cliente cliente = new Cliente(dni);
            
            if(cliente.existe_DNI()){
                System.out.println(cliente.toString());
            }else{
                System.out.println("No existe el cliente");
            }    
        }
        
        public static void consulta_nombre(){
            
            System.out.println("Introduce el nombre: ");
            String nombre = entrada.next();
            
            System.out.println("Introduzca los  apellidos: ");
            String apellidos = entrada.next();
            
            Cliente cliente = new Cliente(nombre, apellidos);
            
            if(cliente.existe_nombre()){
                System.out.println(cliente.toString());
            }else{
                System.out.println("No existe el cliente");
            }
        }
        
        public static void listado_Clientes(){
            
            if(Principal.cliente1 != null){
                System.out.println("Cliente 1: "+Principal.cliente1.toString());
            }else{
                System.out.println("Cliente 1 aun no creado");
            }
            
            if(Principal.cliente2 != null){
                System.out.println("Cliente 2: "+Principal.cliente2.toString());
            }else{
                System.out.println("Cliente 2 aun no creado");
            }
            
            if(Principal.cliente3 != null){
                System.out.println("Cliente 3: "+Principal.cliente3.toString());
            }else{
                System.out.println("Cliente 3 aun no creado");
            }
            
            if(Principal.cliente4 != null){
                System.out.println("Cliente 4: "+Principal.cliente4.toString());
            }else{
                System.out.println("Cliente 4 aun no creado");
            }
            
            if(Principal.cliente5 != null){
                System.out.println("Cliente 5: "+Principal.cliente5.toString());
            }else{
                System.out.println("Cliente 5 aun no creado");
            }
        }

    }
    

