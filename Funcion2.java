import java.util.Scanner;

public class Funcion2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String texto = teclado.nextLine();

        // Verificar si la cadena de texto es un palíndromo
        if (esPalindromo(texto)) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }

    // Función que determina si una cadena de texto es un palíndromo
    public static boolean esPalindromo(String texto) {
        String textoLimpio = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int n = textoLimpio.length();
        for (int i = 0; i < n / 2; i++) {
            if (textoLimpio.charAt(i) != textoLimpio.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
