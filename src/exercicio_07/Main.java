package exercicio_07;
import exercicio_07.models.Aluno;

public class Main
{
    public static void main(String[] args)
    {
        Aluno novo = new Aluno();
        novo.nome = "Luan";
        novo.matricula = "123";
        novo.nota1 = 8.5;
        novo.nota2 = 9.7;
        novo.nota3 = 5.5;
        novo.calcularMedia();
        novo.verificarAprovacao();
    }
}
