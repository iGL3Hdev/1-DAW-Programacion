
package Tarea5V3;

import java.time.LocalDate;
import java.time.Month;
import java.util.InputMismatchException;
import java.util.Scanner;


public class BomberoMain {


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        
        
        try {
   
            //Apartado A:

            System.out.println("Escribe el nombre del puesto 1: ");
            String nombrePuesto1 = entrada.next();

            System.out.println("Excribe la descripcion del puesto 1: ");
            String descripcionPuesto1 = entrada.next();

            System.out.println("Escribe el nombre del puesto 2: ");
            String nombrePuesto2 = entrada.next();

            System.out.println("Excribe la descripcion del puesto 2: ");
            String descripcionPuesto2 = entrada.next();

            System.out.println("Escribe el nombre del puesto 3: ");
            String nombrePuesto3 = entrada.next();

            System.out.println("Excribe la descripcion del puesto 3: ");
            String descripcionPuesto3 = entrada.next();

            Puesto p1 = new Puesto(nombrePuesto1, descripcionPuesto1, CategoriaPuesto.PEON);
            Puesto p2 = new Puesto(nombrePuesto1, descripcionPuesto1, CategoriaPuesto.CABO);
            Puesto p3 = new Puesto(nombrePuesto1, descripcionPuesto1, CategoriaPuesto.ESPECIALISTA);



            // Apartado B:

            System.out.println("Escribe el nombre del bombero 1: ");
            String nombreBombero1 = entrada.next();

            System.out.println("Escribe los apellidos del bombero 1: ");
            String apellidosBombero1 = entrada.next();

            System.out.println("Escribe la edad del bombero 1: ");
            int edadBombero1 = entrada.nextInt();

            System.out.println("Escribe el parque del bomber 1: ");
            String parqueBombero1 = entrada.next();

            System.out.println("Escribe el nombre del bombero 2: ");
            String nombreBombero2 = entrada.next();

            System.out.println("Escribe los apellidos del bombero 2: ");
            String apellidosBombero2 = entrada.next();

            System.out.println("Escribe la edad del bombero 2: ");
            int edadBombero2 = entrada.nextInt();

            System.out.println("Escribe el parque del bomber 2: ");
            String parqueBombero2 = entrada.next();

            System.out.println("Escribe el nombre del bombero 3: ");
            String nombreBombero3 = entrada.next();

            System.out.println("Escribe los apellidos del bombero 3: ");
            String apellidosBombero3 = entrada.next();

            System.out.println("Escribe la edad del bombero 3: ");
            int edadBombero3 = entrada.nextInt();

            System.out.println("Escribe el parque del bomber 3: ");
            String parqueBombero3 = entrada.next();




            Bombero b1 = new Bombero(p1, parqueBombero1, nombreBombero1, apellidosBombero1, edadBombero1, LocalDate.now());
            Bombero b2 = new Bombero(p2, parqueBombero2, nombreBombero2, apellidosBombero2, edadBombero2, LocalDate.now());
            Bombero b3 = new Bombero(p3, parqueBombero3, nombreBombero3, apellidosBombero3, edadBombero3, LocalDate.now());

            System.out.println(b1.getInfo());
            System.out.println(b2.getInfo());
            System.out.println(b3.getInfo());

            // Apartado 3

            System.out.println("Bomberos creados: "+Bombero.getNumBomberos());


            // Apartado 4


            b1.setFechaIngreso(LocalDate.of(2023, Month.JANUARY, 1));
            b2.setFechaIngreso(LocalDate.of(2018, Month.JANUARY, 1));
            b3.setFechaIngreso(LocalDate.of(2013, Month.JANUARY, 1));


            b1.calculoAntiguedad();
            b2.calculoAntiguedad();
            b3.calculoAntiguedad();

            System.out.println(b1.getPuesto().getsueldo());
            System.out.println(b2.getPuesto().getsueldo());
            System.out.println(b3.getPuesto().getsueldo());


            // Apartado 5


            System.out.println("Escribe el nombre del nuevo puesto 1: ");
            nombrePuesto1 = entrada.next();

            System.out.println("Excribe la descripcion del nuevo puesto 1: ");
            descripcionPuesto1 = entrada.next();

            System.out.println("Escribe la catería del nuveo puesto 1: ");
            System.out.println("1. PEON");
            System.out.println("2. CABO");
            System.out.println("3. ESPECIALISTA");

            int categoria = entrada.nextInt();

            Puesto p4 = new Puesto(nombrePuesto1, descripcionPuesto1, CategoriaPuesto.values()[categoria - 1]);
            b1.setPuesto(p4);
            b1.calculoAntiguedad();
            System.out.println(b1.getPuesto().getsueldo());

            b1.setPuesto(b2.getPuesto());
            b3.setParque(b1.getParque());
            
            System.out.println(b1.getInfo());
            System.out.println(b3.getInfo());
        
        } catch (InputMismatchException e) {
           entrada.next();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
