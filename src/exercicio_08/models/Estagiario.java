package exercicio_08.models;

public class Estagiario extends Funcionario
{
    public Estagiario (String nome, double salarioBase)
    {
        super(nome, salarioBase);
    }

    public void calcularSalario()
    {
        salarioBase = salarioBase * 0.9;
    }
}
