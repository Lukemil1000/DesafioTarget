public class Exercicio2 {

    public static void main(String[] args) {
        int entrada = 22;
        int num1 = 0;
        int num2 = 1;
        int r;

        while (entrada > num1) {
            r = num1 + num2;
            num1 = num2;
            num2 = r;
        }

        if (entrada == num1) {
            System.out.println("O número informado pertence a sequência");
        }else {
            System.out.println("O número informado não pertence a sequência");
        }
    }
}
