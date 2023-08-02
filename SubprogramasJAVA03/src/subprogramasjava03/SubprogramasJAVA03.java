
package subprogramasjava03;

import java.util.Scanner;


public class SubprogramasJAVA03 {

   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de euros: ");
        double euros = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Ingrese la moneda a convertir (Dolares, Yenes, Libras): ");
        String moneda = scanner.nextLine();

        convertirMoneda(euros, moneda);
    }

    public static void convertirMoneda(double euros, String moneda) {
        double cambio = 0;

        switch (moneda.toLowerCase()) {
            case "dolares":
                cambio = 1.28611;
                break;
            case "yenes":
                cambio = 129.852;
                break;
            case "libras":
                cambio = 0.86;
                break;
            default:
                System.out.println("Moneda no válida");
                return;
        }

        double cantidadConvertida = euros * cambio;
        System.out.println(euros + " euros equivalen a " + cantidadConvertida + " " + moneda);
    }
}



      
    
    

