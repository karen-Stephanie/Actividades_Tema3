import java.util.Scanner;

public class Funcion5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar un número
        System.out.print("Ingrese un número: ");
        double numero = teclado.nextDouble();

        // Calcular la raíz cuadrada del número
        double raizCuadrada = Math.sqrt(numero);

        // Mostrar el resultado
        System.out.println("La raíz cuadrada de " + numero + " es: " + raizCuadrada);
    }
}
