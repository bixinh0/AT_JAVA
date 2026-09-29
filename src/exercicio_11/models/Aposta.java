package exercicio_11.models;

public class Aposta
{
    private int[] numerosApostados;

    public Aposta(int[] numerosApostados)
    {
        this.numerosApostados = numerosApostados;
    }

    public int contarAcertos(Sorteio sorteio)
    {
        int acertos = 0;

        for (int numero : numerosApostados)
        {
            if (sorteio.foiSorteado(numero))
            {
                acertos++;
            }
        }

        return acertos;
    }
}