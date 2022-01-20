public class CaracteresMain {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Faltan argumentos");
            System.exit(1);
        }

        int numero = Integer.parseInt(args[0]);
        String cadena = args[1];

        caracteres c = new caracteres();
        c.caracterEn(numero, cadena);

    }
}
