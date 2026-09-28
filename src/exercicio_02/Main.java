package exercicio_02;

import java.util.Scanner;
import exercicio_02.models.Usuario;
import exercicio_02.services.ValidadorSenha;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ValidadorSenha validador = new ValidadorSenha();

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        String senha;
        String erro;

        do
        {
            System.out.print("Digite uma senha: ");
            senha = scanner.nextLine();

            erro = validador.validar(senha);

            if (erro != null)
            {
                System.out.println("Senha inválida: " + erro);
            }

        } while (erro != null);

        Usuario usuario = new Usuario(nome, senha);

        System.out.println("Senha cadastrada com sucesso para " + usuario.getNome() + "!");
    }
}