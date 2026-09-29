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

        System.out.println();

        Veiculo novo2 = new Veiculo();
        novo2.modelo = "Corcel";
        novo2.placa = "XYZ789";
        novo2.anoFabricacao = 1977;
        novo2.quilometragem = 45230.0;

        novo2.exibirDetalhes();
        novo2.registrarViagem(300.5);
        novo2.exibirDetalhes();
    }
}
