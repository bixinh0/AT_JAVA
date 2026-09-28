package exercicio_04.models;
import  java.util.Scanner;

public class Emprestimo
{
    private Scanner scanner = new Scanner(System.in);
    private String nome;
    private double valorEmprestimo;
    private int numeroParcelas;
    private double valorParcelas;
    private double valorTotalEmprestimo;

    public Emprestimo()
    {
        lerDados();
        calcularEmprestimo();
    }

    private void lerDados()
    {
        System.out.print("\nDigite seu nome: ");
        nome = scanner.nextLine();
        System.out.print("\nDigite o valor do empréstimo desejado: ");
        valorEmprestimo = scanner.nextDouble();

        while (true)
        {
            System.out.print("Digite a quantidade de parcelas (6 a 48): ");
            numeroParcelas = scanner.nextInt();

            if (numeroParcelas >= 6 && numeroParcelas <= 48)
            {
                break;
            }
            else
            {
                System.out.println("Quantidade inválida! Escolha entre 6 e 48 parcelas.");
            }
        }
    }
    private void calcularEmprestimo()
    {
        valorParcelas = ((numeroParcelas * 0.03) + 1) * (valorEmprestimo / numeroParcelas);
        valorTotalEmprestimo = valorParcelas * numeroParcelas;
    }
    public void exibirRelatorio()
    {
        System.out.printf("%nValor total a ser pago: R$ %.2f%nValor da parcela mensal: R$ %.2f%n",
                valorTotalEmprestimo, valorParcelas);
    }
}
