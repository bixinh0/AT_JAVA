package exercicio_11;

import exercicio_11.models.Aposta;
import exercicio_11.models.Sorteio;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Sorteio sorteio = new Sorteio();

        int[] numerosApostados = new int[6];

        System.out.println("Digite seus 6 números (de 1 a 60):");

        for (int i = 0; i < 6; i++)
        {
            System.out.print("Número " + (i + 1) + ": ");
            numerosApostados[i] = Integer.parseInt(scanner.nextLine());
        }

        Aposta aposta = new Aposta(numerosApostados);
        int acertos = aposta.contarAcertos(sorteio);

        System.out.println("\nNúmeros sorteados: " + arrayParaTexto(sorteio.getNumerosSorteados()));
        System.out.println("Seus números: " + arrayParaTexto(numerosApostados));
        System.out.println("Você acertou " + acertos + " número(s)!");
    }

    private static String arrayParaTexto(int[] numeros)
    {
        StringBuilder texto = new StringBuilder();

        for (int i = 0; i < numeros.length; i++)
        {
            texto.append(numeros[i]);

            if (i < numeros.length - 1)
            {
                texto.append(", ");
            }
        }

        return texto.toString();
    }
}