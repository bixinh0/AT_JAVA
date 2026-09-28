package exercicio_06.models;

public class Veiculo
{
    public String placa;
    public String modelo;
    public int anoFabricacao;
    public double quilometragem;

    public void exibirDetalhes()
    {
        System.out.printf("Placa: %s%n" +
                "Modelo: %s%n" +
                "Ano de fabricação: %d%n" +
                "Quilometragem: %.2f%n", placa, modelo, anoFabricacao, quilometragem);
    }
    public void registrarViagem(double km)
    {
        quilometragem = quilometragem + km;
    }
}
