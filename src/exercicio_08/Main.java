package exercicio_08;
import exercicio_08.models.*;

public class Main
{
    public static void main(String[] args)
    {
        Gerente novoGerente = new Gerente("Elbert", 45000.00);
        Estagiario novoEstagiario = new Estagiario("Luan", 1500.00);

        novoGerente.calcularSalario();
        novoGerente.exibirDados();

        novoEstagiario.calcularSalario();
        novoEstagiario.exibirDados();
    }
}