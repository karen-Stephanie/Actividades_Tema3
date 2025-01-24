import java.util.Scanner;

public class Funcion4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario ingresar una cadena de texto
        System.out.print("Ingrese una cadena de texto: ");
        String texto = teclado.nextLine();

        // Solicitar al usuario ingresar el carácter a reemplazar
        System.out.print("Ingrese el carácter a reemplazar: ");
        char caracterViejo = teclado.next().charAt(0);

        // Solicitar al usuario ingresar el nuevo carácter
        System.out.print("Ingrese el nuevo carácter: ");
        char caracterNuevo = teclado.next().charAt(0);

        // Reemplazar el carácter en la cadena de texto
        String textoModificado = texto.replace(caracterViejo, caracterNuevo);

        // Mostrar el resultado
        System.out.println("Texto modificado: " + textoModificado);
    }
}
