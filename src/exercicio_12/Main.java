package exercicio_12;

import exercicio_12.models.Chat;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Chat chat = new Chat();

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();

        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        for (int i = 0; i < 10; i++)
        {
            String usuarioDaVez = (i % 2 == 0) ? usuario1 : usuario2;

            System.out.print(usuarioDaVez + ", digite sua mensagem: ");
            String mensagem = scanner.nextLine();

            chat.enviarMensagem(usuarioDaVez, mensagem);
        }

        chat.exibirHistorico();

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês!");
    }
}