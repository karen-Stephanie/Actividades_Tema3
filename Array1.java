import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;

        // Leer 10 números enteros desde el teclado y almacenarlos en un array
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = teclado.nextInt();
        }

        // Contar cuántos números son pares y cuántos son impares
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }

        // Mostrar los conteos en la consola
        System.out.println("Cantidad de números pares: " + contadorPares);
        System.out.println("Cantidad de números impares: " + contadorImpares);
    }
}
