package Tarea3V1;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EntradaArticulos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useDelimiter("\n");
        entrada.useLocale(Locale.US);

        try {

            //Articulo 1
            Articulo art1 = new Articulo();

            System.out.println("Introduce el Codigo de barras: ");
            art1.setCodigo_barra(entrada.next());

            System.out.println("Introduce la Denominacion: ");
            art1.setdenominacion(entrada.next());

            System.out.println("Introduce las unidades: ");
            art1.setunidades(entrada.nextInt());

            System.out.println("Introduce el precio de compra: ");
            art1.setprecio_compra(entrada.nextDouble());

            System.out.println("Introduce el beneficio: ");
            art1.setbeneficio(entrada.nextInt());

            art1.calcularPVP();

            //Articulo 2
            
            System.out.println("Introduce el Codigo de barras: ");
            String codigo_barra = entrada.next();

            System.out.println("Introduce la Denominacion: ");
            String denominacion = entrada.next();

            System.out.println("Introduce las unidades: ");
            int unidades = entrada.nextInt();

            System.out.println("Introduce el precio de compra: ");
            double precio_compra = entrada.nextDouble();

            System.out.println("Introduce el beneficio: ");
            int beneficio = entrada.nextInt();
            
            Articulo art2 = new Articulo(codigo_barra, denominacion, unidades, precio_compra, beneficio);   
                                        

        
        //Articulo 3
        
        System.out.println("Introduce el Codigo de barras: ");
            codigo_barra = entrada.next();

            System.out.println("Introduce la Denominación: ");
            denominacion = entrada.next();

            System.out.println("Introduce las unidades: ");
            unidades = entrada.nextInt();

            System.out.println("Introduce el precio de compra: ");
            precio_compra = entrada.nextDouble();

            System.out.println("Introduce el beneficio: ");
            beneficio = entrada.nextInt();

            Articulo art3 = new Articulo();

            art3.setCodigo_barra(codigo_barra);
            art3.setdenominacion(denominacion);
            art3.setunidades(unidades);
            art3.setprecio_compra(precio_compra);
            art3.setbeneficio(beneficio);

            art3.calcularPVP();

            System.out.println("Articulo 1");
            System.out.println("Cod Barras" + art1.getCodigo_barra());
            System.out.println("Denominacion" + art1.getdenominacion());
            System.out.println("unidades" + art1.getunidades());
            System.out.println("Precio Compra" + art1.getprecio_compra());
            System.out.println("Beneficio" + art1.getbeneficio());
            System.out.println("PVP "+ art1.getpvp());
            System.out.println("");

            System.out.println("Articulo 2");
            System.out.println("Cod Barras" + art2.getCodigo_barra());
            System.out.println("Denominacion" + art2.getdenominacion());
            System.out.println("unidades" + art2.getunidades());
            System.out.println("Precio Compra" + art2.getprecio_compra());
            System.out.println("Beneficio" + art2.getbeneficio());
            System.out.println("PVP "+art2.getpvp());
            System.out.println("");

            System.out.println("Articulo 3");
            System.out.println("Cod Barras" + art3.getCodigo_barra());
            System.out.println("Denominacion" + art3.getdenominacion());
            System.out.println("unidades" + art3.getunidades());
            System.out.println("Precio Compra" + art3.getprecio_compra());
            System.out.println("Beneficio" + art3.getbeneficio());
            System.out.println("PVP "+art3.getpvp());
            System.out.println("");

        } catch (InputMismatchException ex) {
            System.out.println(ex.getMessage());

        }
    }

}
