public class Exercicio5 {

    public static void main(String[] args) {

        String texto = "Frase Bem Grande";
        String inverso = "";
        int contador = texto.length();

        while (contador != 0) {
            inverso = inverso + texto.charAt(contador - 1);
            contador--;
        }
        System.out.println(texto);
        System.out.println(inverso);

    }
}
