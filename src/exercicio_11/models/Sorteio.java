package exercicio_11.models;

import java.util.Random;

public class Sorteio
{
    private int[] numerosSorteados;

    public Sorteio()
    {
        numerosSorteados = new int[6];
        gerarNumeros();
    }

    private void gerarNumeros()
    {
        Random random = new Random();
        int quantidadeGerada = 0;

        while (quantidadeGerada < 6)
        {
            int numero = random.nextInt(60) + 1; // 1 a 60

            if (!contemNumero(numero, quantidadeGerada))
            {
                numerosSorteados[quantidadeGerada] = numero;
                quantidadeGerada++;
            }
        }
    }

    private boolean contemNumero(int numero, int quantidade)
    {
        for (int i = 0; i < quantidade; i++)
        {
            if (numerosSorteados[i] == numero)
            {
                return true;
            }
        }
        return false;
    }

    public int[] getNumerosSorteados()
    {
        return numerosSorteados;
    }

    public boolean foiSorteado(int numero)
    {
        return contemNumero(numero, numerosSorteados.length);
    }
}