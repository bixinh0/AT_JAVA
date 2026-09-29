package exercicio_07;

import exercicio_07.models.Aluno;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Aluno novo = new Aluno();

        System.out.print("Nome: ");
        novo.nome = scanner.nextLine();

        System.out.print("Matrícula: ");
        novo.matricula = scanner.nextLine();

        System.out.print("Nota 1: ");
        novo.nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        novo.nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        novo.nota3 = scanner.nextDouble();

        novo.calcularMedia();
        novo.verificarAprovacao();
    }
}