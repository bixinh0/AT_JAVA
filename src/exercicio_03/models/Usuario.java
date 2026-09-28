package exercicio_03.models;

public class Usuario
{
    private String nome;
    private double salarioMensal;
    private double salarioAnual;
    private double taxaImposto;
    private double descontoImposto;
    private double salarioLiquido;

    public Usuario(String nome, double salarioMensal)
    {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
        calcularTaxa();
        calcularImposto();
    }

    private void calcularTaxa()
    {
        salarioAnual = salarioMensal * 12;

        if (salarioAnual <= 22847.76) {
            taxaImposto = 0;
        } else if (salarioAnual <= 33919.80) {
            taxaImposto = 0.075;
        } else if (salarioAnual <= 45012.60) {
            taxaImposto = 0.15;
        } else {
            taxaImposto = 0.275;
        }
    }

    private void calcularImposto()
    {
        descontoImposto = salarioMensal * taxaImposto;
        salarioLiquido = salarioMensal - descontoImposto;
    }

    public void exibirRelatorio()
    {
        System.out.printf("Nome: %s%nSalário Mensal: R$ %.2f%nSalário Liquido: R$ %.2f%nTaxa do imposto: %.1f%%%nDesconto do Imposto: R$ %.2f%n",
                nome, salarioMensal, salarioLiquido, taxaImposto * 100, descontoImposto);
    }
}
