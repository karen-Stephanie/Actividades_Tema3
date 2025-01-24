import java.util.Scanner;

public class Funcion1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar dos números enteros
        System.out.print("Ingrese el primer número entero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo número entero: ");
        int num2 = teclado.nextInt();

        // Calcular el MCD
        int mcd = calcularMCD(num1, num2);

        // Mostrar el resultado
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }

    // Función que determina el MCD de dos números
    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
