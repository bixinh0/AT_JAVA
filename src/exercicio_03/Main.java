package exercicio_03;

import exercicio_03.models.Usuario;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        Usuario usuario = new Usuario(nome, salarioMensal);
        usuario.exibirRelatorio();
    }
}
