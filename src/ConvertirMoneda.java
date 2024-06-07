import java.util.Scanner;

// Metodo donde tomamos la opciones ya establecidas

public class ConvertirMoneda {
    public static void convertir(String monedaBase, String monedaTarget, ConsultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertida;

        Monedas monedas = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("La Tasa de conversion para hoy\n1 "+monedaBase+ " = "+monedas.conversion_rate()+" "+monedaTarget);
        System.out.println("Ingrese la cantidad de " +  monedaBase);
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertida = cantidad * monedas.conversion_rate();
        System.out.println(cantidad+" "+monedaBase +" = " +cantidadConvertida + " " + monedas.target_code());
    }

// Metodo para convertir a otro tipo de monedad a parte de los que ya establecidas en el menu

    public static void convertirOtraMoneda(ConsultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la monedad base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la monedad objetivo:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);

    }
}
