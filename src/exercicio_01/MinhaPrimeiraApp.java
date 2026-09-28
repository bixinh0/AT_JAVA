package exercicio_01;

import exercicio_01.models.OlaMundo;

public class MinhaPrimeiraApp
{
    public static void main(String[] args)
    {
        OlaMundo novo = new OlaMundo();
        novo.nome = "Luan";
        novo.exibirMensagem();
    }
}