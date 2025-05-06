import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorMoneda {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        boolean continuar = true;

        while (continuar) {
            System.out.println("\nConversor de Monedas");
            double cantidad = 0;
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.println("Ingrese la cantidad a convertir:");
                try {
                    cantidad = scanner.nextDouble();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Entrada no válida. Por favor, ingrese un número.");
                    scanner.nextLine();
                }
            }

            scanner.nextLine(); // Limpiar buffer

            String monedaOrigen = obtenerMoneda(scanner, "Escriba las siglas de la moneda de origen (Por ejemplo : USD || ARG || MXN || CAN) ");
            String monedaDestino = obtenerMoneda(scanner, "Escriba las siglas de la moneda destino (Por ejemplo : USD || ARG || MXN || CAN) ");

            Moneda datosMoneda = consultaMoneda.buscarMoneda(monedaOrigen);

            if (datosMoneda == null || datosMoneda.conversion_rates() == null) {
                System.out.println("Error: No se pudo obtener información de la moneda. Intente nuevamente.");
                continue; // Reiniciar el ciclo sin salir del programa
            }

            if (datosMoneda != null && datosMoneda.conversion_rates().containsKey(monedaDestino)) {
                double tasaConversion = datosMoneda.conversion_rates().get(monedaDestino);
                double resultado = cantidad * tasaConversion;
                System.out.println("Resultado: " + cantidad + " " + monedaOrigen + " = " + resultado + " " + monedaDestino);
            } else {
                System.out.println("No se pudo obtener la tasa de conversión. Verifique las monedas ingresadas.");
            }
            System.out.println("\n¿Desea realizar otra conversión? (Sí/No)");
            String respuesta = scanner.nextLine().toLowerCase();
            continuar = respuesta.equals("sí") || respuesta.equals("si");
        }
        System.out.println("Gracias por usar el conversor de moneras.");
        scanner.close();
    }

    private static String obtenerMoneda(Scanner scanner, String mensaje) {
        String moneda = null;
        boolean entradaValida = false;
        while (!entradaValida){
            System.out.println(mensaje);
            moneda = scanner.nextLine().toUpperCase();

            if (moneda.matches("[A-Za-z]+")){
                entradaValida=true;
            }else {
                System.out.println("Error: La moneda debe contener solo letras. Intenta nuevamente");
            }
        }
        return moneda;
    }
}
