package exercicio_12.models;

public class Chat
{
    private String[] mensagens;
    private int totalMensagens;

    public Chat()
    {
        mensagens = new String[10];
        totalMensagens = 0;
    }

    public void enviarMensagem(String nomeUsuario, String texto)
    {
        mensagens[totalMensagens] = nomeUsuario + ": " + texto;
        totalMensagens++;
    }

    public boolean estaCheio()
    {
        return totalMensagens >= mensagens.length;
    }

    public void exibirHistorico()
    {
        System.out.println("\n===== Histórico de Mensagens =====");

        for (int i = 0; i < totalMensagens; i++)
        {
            System.out.println(mensagens[i]);
        }
    }
}