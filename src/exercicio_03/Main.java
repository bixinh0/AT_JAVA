package exercicio_03;
import exercicio_03.models.Usuario;

public class Main {
    public static void main (String[] args)
    {
        Usuario usuario = new Usuario("Luan", 4500.00);
        usuario.exibirRelatorio();
    }
}
