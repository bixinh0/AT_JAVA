package exercicio_10.models;

public class Compra
{
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario)
    {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularTotal()
    {
        return quantidade * precoUnitario;
    }

    // Formato para GRAVAR no arquivo, separado por vírgula
    public String paraLinhaDeArquivo()
    {
        return produto + "," + quantidade + "," + precoUnitario;
    }

    // Formato para EXIBIR no console
    @Override
    public String toString()
    {
        return String.format("Produto: %s | Quantidade: %d | Preço Unitário: R$ %.2f | Total: R$ %.2f",
                produto, quantidade, precoUnitario, calcularTotal());
    }
}