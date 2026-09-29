package exercicio_09;
import exercicio_09.models.ContaBancaria;

public class Main
{
    public static void main(String[] args)
    {
        ContaBancaria novaConta = new ContaBancaria("Elbert", 750000.50);
        novaConta.depositar(55000.1);
        novaConta.exibirSaldo();
        novaConta.sacar(22350.15);
        novaConta.exibirSaldo();
        novaConta.depositar(-150.00);
        novaConta.exibirSaldo();
    }
}
