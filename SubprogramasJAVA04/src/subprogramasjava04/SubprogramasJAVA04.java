
package subprogramasjava04;

import java.util.Scanner;


public class SubprogramasJAVA04 {

   
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        boolean esPrimo = esPrimo(numero);

        if (esPrimo) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        // Verificar si el número es divisible por algún valor desde 2 hasta la raíz cuadrada de n
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
}

