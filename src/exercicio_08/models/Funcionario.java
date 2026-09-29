package exercicio_08.models;

public class Funcionario
{
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase)
    {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public void exibirDados()
    {
        System.out.printf("%nNome: %s\t\t|\t\tSalário: %.2f", nome, salarioBase);
    }
}
