package exercicio_10.services;

import exercicio_10.models.Compra;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class RegistradorCompras
{
    private static final String ARQUIVO = "compras.txt";

    public void salvarCompra(Compra compra)
    {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(ARQUIVO, true)))
        {
            escritor.write(compra.paraLinhaDeArquivo());
            escritor.newLine();
        }
        catch (IOException erro)
        {
            System.out.println("Erro ao salvar a compra: " + erro.getMessage());
        }
    }

    public List<Compra> lerCompras()
    {
        List<Compra> compras = new ArrayList<>();
        File arquivo = new File(ARQUIVO);

        if (!arquivo.exists())
        {
            return compras;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo)))
        {
            String linha;

            while ((linha = leitor.readLine()) != null)
            {
                if (linha.isBlank())
                {
                    continue;
                }

                String[] dados = linha.split(",");
                String produto = dados[0];
                int quantidade = Integer.parseInt(dados[1]);
                double precoUnitario = Double.parseDouble(dados[2]);

                compras.add(new Compra(produto, quantidade, precoUnitario));
            }
        }
        catch (IOException erro)
        {
            System.out.println("Erro ao ler o arquivo de compras: " + erro.getMessage());
        }

        return compras;
    }
}