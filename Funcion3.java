import java.util.Scanner;

public class Funcion3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String input;

        while (true) {
            // Solicitar al usuario ingresar una palabra o cadena de texto
            System.out.print("Ingrese una palabra o cadena de texto (deje en blanco para terminar): ");
            input = teclado.nextLine();

            // Terminar el programa si el usuario ingresa un espacio en blanco
            if (input.trim().isEmpty()) {
                break;
            }

            // Convertir la entrada a mayúsculas y mostrarla
            String textoMayusculas = input.toUpperCase();
            System.out.println("Texto en mayúsculas: " + textoMayusculas);
        }

        System.out.println("Programa terminado.");
    }
}
