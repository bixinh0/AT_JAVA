package exercicio_08.models;

public class Gerente extends Funcionario
{
    public Gerente(String nome, double salarioBase)
    {
        super(nome, salarioBase); // chama o construtor da classe pai
    }

    public void calcularSalario()
    {
        salarioBase = salarioBase * 1.2;
    }
}
