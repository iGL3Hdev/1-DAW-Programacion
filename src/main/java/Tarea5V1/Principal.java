
package Tarea5V1;


import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;


public class Principal {

 
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);
        
        boolean salir = false;
        int opcion;
        Vehiculo v= null;
        
        String marca, matricula, descripcion, nombrePropietario, dniPropietario ;
        int numKm, dia, mes, anio;
        double precio;
        LocalDate fechaMatriculacion;
        
        
        
        while(!salir){
            
            
            try {
            
                System.out.println("1.- Nuevo Vehículo: ");
                System.out.println("2.- Ver matrícula: ");
                System.out.println("3.- Ver número de km: ");
                System.out.println("4.- Actualizar kilómetros: ");
                System.out.println("5.- Ver años de antigüedad: ");
                System.out.println("6.- Mostrar propietario: ");
                System.out.println("7.- Mostrar descripción: ");
                System.out.println("8.- Mostrar precio");
                System.out.println("9.- Salir");

                System.out.println("Elige una opcion: ");
                opcion = entrada.nextInt();

                switch(opcion){

                    case 1:

                            System.out.println("Introduce la marca: ");
                            marca = entrada.next();

                            System.out.println("Introduce la matrícula: ");
                            matricula = entrada.next();

                            System.out.println("Introduce el número de km: ");
                            numKm = entrada.nextInt();

                            if(!Validacion.esPositivo(numKm)){
                                throw new Exception("km no es positivo");
                            }            

                            System.out.println("Introduce el dia de la matriculación: ");
                            dia = entrada.nextInt();
                            System.out.println("Introduce el mes de la matriculación: ");
                            mes = entrada.nextInt();
                            System.out.println("Introduce el año de la matriculación: ");
                            anio = entrada.nextInt();

                            fechaMatriculacion = LocalDate.of(anio, mes, dia);

                            if(Validacion.fechaMayorhoy(fechaMatriculacion)){
                                throw new Exception("fecha matriculación es mayor que hoy");
                            }

                            System.out.println("Introduce la descripción: ");
                            descripcion = entrada.next();

                            System.out.println("Introduce el precio: ");
                            precio = entrada.nextDouble();

                            System.out.println("Introduce el nombre del propietario: ");
                            nombrePropietario = entrada.next();

                            System.out.println("Introduce el dni del propietario: ");
                            dniPropietario = entrada.next();

                            if(!Validacion.validarDNI(dniPropietario)){
                                throw new Exception("DNI no valido");
                            }


                            v = new Vehiculo(marca, matricula, numKm, fechaMatriculacion, descripcion,
                                            precio, nombrePropietario, dniPropietario);

                            System.out.println("Vehículo creado");

                        break;

                    case 2:

                        if(v != null){
                            System.out.println("Matricula: "+v.getMatricula());
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }

                        break;

                    case 3:

                        if(v != null){
                            System.out.println("Numero de Kilómetros: "+v.getNumKm());
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }

                        break;

                    case 4:

                        if(v != null){
                            System.out.println("Introduce el número de km: ");
                            numKm = entrada.nextInt();
                            
                            v.setNumKm(numKm);
                            System.out.println("Km actualizados: ");

                            if(!Validacion.esPositivo(numKm)){
                                throw new Exception("km no es positivo");
                            }else{
                                System.out.println("Debes crear un vehículo");
                            }
                        }

                        break;

                    case 5:
                        
                        if(v != null){
                            System.out.println("Antigüedad: "+v.get_anios()+ "años");
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }

                        break;


                    case 6:

                        if(v != null){
                            System.out.println("El propietario: "+v.getDniPropietario());
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }

                        break;

                    case 7:
                        
                        if(v != null){
                            System.out.println("Descripción: "+v.getDescripcion());
                            System.out.println("Matrícula: "+v.getMatricula());
                            System.out.println("Km: "+v.getNumKm());
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }


                        break;


                    case 8:

                        if(v != null){
                            System.out.println("El precio es: "+v.getPrecio());
                        }else{
                            System.out.println("Debes crear un vehículo");
                        }

                        break;


                    case 9:

                        salir = true;
                        break;

                    default:

                        System.out.println("Elige una opción entre 1 y 9");

            }   
            
            } catch (Exception e) {
                 System.out.println(e.getMessage());
            }
                    
            
        }
        
    }
    
}
