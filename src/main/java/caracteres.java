public class caracteres {

    public void caracterEn(int n, String cadena) {
        try{
            char caracter;
            caracter = cadena.charAt(n);
        if (n <= cadena.length()) {

            System.out.println("Caracter en la posición " + n + ": " + caracter);
        }
        }
        catch (Exception e){
            System.out.println("Entero no valido, has intentado recuperar una posicion de la cadena de caracteres que no existe");

        }

    }

}
