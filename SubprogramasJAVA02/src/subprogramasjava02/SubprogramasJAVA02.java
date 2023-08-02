
package subprogramasjava02;

       import java.util.Scanner;

public class SubprogramasJAVA02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mostrarPersonas = true;

        while (mostrarPersonas) {
            mostrarPersonas = agregarPersona(scanner);
        }
    }

    public static boolean agregarPersona(Scanner scanner) {
        System.out.print("Ingrese el nombre de la persona: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad de la persona: ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad.");
        }

        System.out.print("¿Quiere seguir mostrando personas? (Si/No): ");
        String continuar = scanner.nextLine();

        return continuar.equalsIgnoreCase("Si");
    }
}

