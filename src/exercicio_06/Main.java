package exercicio_06;
import  exercicio_06.models.Veiculo;

public class Main
{
    public static void main(String[] args)
    {
        Veiculo novo = new Veiculo();
        novo.modelo = "Fusca";
        novo.placa = "ABC123";
        novo.anoFabricacao = 1977;
        novo.quilometragem = 160645.75;

        novo.exibirDetalhes();
        novo.registrarViagem(1200.0);
        novo.exibirDetalhes();
    }
}
