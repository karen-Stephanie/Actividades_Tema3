import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[8];

        // Leer 8 números enteros desde el teclado y almacenarlos en un array
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Inicializar variables para el número mayor y menor
        int mayor = numeros[0];
        int menor = numeros[0];

        // Determinar el número mayor y menor
        for (int i = 1; i < 8; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar los resultados en la consola
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
