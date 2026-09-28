package exercicio_07.models;

public class Aluno
{
    public String nome;
    public String matricula;
    public double nota1;
    public double nota2;
    public double nota3;
    private double media;

    public double calcularMedia()
    {
        media = ((nota1 + nota2 + nota3) / 3);
        return media;
    }

    public void verificarAprovacao()
    {
        System.out.printf("%nAluno: %s%nMatrícula: %s%nMédia: %.2f%nSituação: ", nome, matricula, media);
        if (media >= 7)
        {
            System.out.print("Aprovado\n");
        }
        else
        {
            System.out.print("Reprovado\n");
        }
    }
}
