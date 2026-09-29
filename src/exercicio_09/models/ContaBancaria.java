package exercicio_09.models;

public class ContaBancaria
{
    private String titular;
    private double saldo;


    public ContaBancaria(String nome, double saldo)
    {
        this.titular = nome;
        this.saldo = saldo;
    }

    public void depositar(double valor)
    {
        if (valor >= 0)
        {
            saldo = saldo + valor;
            System.out.printf("Deposito no valor de R$ %.2f realizado com sucesso!%n", valor);
        }
        else
        {
            System.out.println("Valor inválido. Depósito não realizado!");
        }
    }

    public void sacar(double valor)
    {
        if (valor < 0)
        {
            System.out.println("Valor inválido. Saque não realizado!");
        }
        else if (valor <= saldo)
        {
            saldo = saldo - valor;
            System.out.printf("Saque no valor de R$ %.2f realizado com sucesso!%n", valor);
        }
        else
        {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo()
    {
        System.out.printf("Nome do titular: %s | Saldo atual: %.2f%n", titular, saldo);
    }
}