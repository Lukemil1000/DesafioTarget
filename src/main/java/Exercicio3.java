import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exercicio3 {

    public static void main(String[] args) {

        int contador = 0;
        int contadorMedia = 0;
        double media;
        double menor = 0;
        double maior = 0;
        double soma = 0;

        Gson gson = new Gson();
        try {

            JsonReader reader = new JsonReader(new FileReader("src/main/java/dados.json"));
            Dados[] dadosArray = gson.fromJson(reader, Dados[].class);

            for ( Dados d : dadosArray) {
                if (d.getValor() != 0) {
                    if (contador == 0) {
                        menor = d.getValor();
                        maior = d.getValor();
                        contador++;
                        soma = soma + d.getValor();
                    } else {
                        if (d.getValor() < menor) {
                            menor = d.getValor();
                        }
                        if (d.getValor() > maior) {
                            maior = d.getValor();
                        }
                        contador++;
                        soma = soma + d.getValor();
                    }
                }
            }

            media = soma/contador;

            for (Dados d : dadosArray) {
                if (d.getValor() > media) {
                    contadorMedia++;
                }
            }

            System.out.println("O menor faturamento do mês foi: " +menor);
            System.out.println("O maior faturamento do mês foi: " +maior);
            System.out.println("A quantidade de dias acima da média foi de: " +contadorMedia);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
