import java.util.*;

public class Principal {
    public static void main(String[] args) {
        double monedaOrigen = 0;
        double monedaDestino = 0;
        int opcion = 0;

        System.out.println("******************************************");
        System.out.println("Bienvenido/a al conversor de monedas \n");

        String menu = """
                Elige el número de la opción deseada:
                1) Dólar ==> Peso mexicano
                2) Peso mexicano ==> Dólar
                3) Dólar ==> Real brasileño
                4) Real brasileño ==> Dólar
                5) Dólar ==> Peso colombiano
                6) Peso colombiano ==> Dólar
                7) Salir
                """;

        Scanner teclado = new Scanner(System.in);
        while (opcion != 7){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1,3,5:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    monedaOrigen = teclado.nextDouble();
                    monedaDestino = ConversorMonedas.convertirMonedas("USD", obtenerMonedaDestino(opcion), monedaOrigen);
                    System.out.println("El valor de " + monedaOrigen + " es igual a " + monedaDestino);
                    teclado.nextLine();
                    break;
                case 2, 4, 6:
                    System.out.println("Ingrese la cantidad que desea convertir: ");
                    monedaOrigen = teclado.nextDouble();
                    monedaDestino = ConversorMonedas.convertirMonedas(obtenerMonedaDestino(opcion), "USD", monedaOrigen);
                    System.out.println("El valor de " + monedaOrigen + " es igual a " + monedaDestino);
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static String obtenerMonedaDestino(int opcion) {
        switch (opcion){
            case 1, 2:
                return "MXN";
            case 3, 4:
                return "BRL";
            case 5, 6:
                return "COP";
            default:
                return "";
        }
    }
}
