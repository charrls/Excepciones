import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {
        String cadena;

        Scanner lecTeclado = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        cadena = lecTeclado.nextLine();

        caracteres c = new caracteres();
        c.caracterEn(7, cadena);

    }
}
