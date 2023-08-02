
package subprogramasjava01;

import java.util.Scanner;


public class SubprogramasJAVA01 {

    
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero");
        double numero1 = leer.nextDouble();
        
        System.out.println("Ingrese el segundo numero");
        double numero2 = leer.nextDouble();
        
        System.out.println("Seleccione la operacion: ");
        System.out.println("1- Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        
        int opcion = leer.nextInt();
        double resultado = 0;
        
        switch (opcion) {
            case 1:
                resultado = sumar(numero1, numero2);
                break;
            case 2:
                resultado = restar(numero1, numero2);
                break;
            case 3:
                resultado = multiplicar(numero1, numero2);
                break;
            case 4:
                resultado = dividir(numero1, numero2);
                break;
            default:
                System.out.println("Opción inválida");
                return;
        }

        System.out.println("El resultado es: " + resultado);
    }

    public static double sumar(double num1, double num2) {
        return num1 + num2;
    }

    public static double restar(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    public static double dividir(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("No es posible dividir por cero.");
            return 0;
        }
    }
}
    
    

