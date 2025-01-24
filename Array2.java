import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;

        // Leer 5 números enteros desde el teclado y almacenarlos en un array
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Calcular la suma de todos los elementos
        for (int i = 0; i < 5; i++) {
            suma += numeros[i];
        }

        // Mostrar la suma en la consola
        System.out.println("La suma de todos los elementos es: " + suma);
    }
}
