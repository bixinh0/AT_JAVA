package exercicio_10;

import exercicio_10.models.Compra;
import exercicio_10.services.RegistradorCompras;
import java.util.List;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        RegistradorCompras registrador = new RegistradorCompras();

        for (int i = 1; i <= 3; i++)
        {
            System.out.println("--- Compra " + i + " ---");

            System.out.print("Produto: ");
            String produto = scanner.nextLine();

            System.out.print("Quantidade: ");
            int quantidade = Integer.parseInt(scanner.nextLine());

            System.out.print("Preço unitário: ");
            double precoUnitario = Double.parseDouble(scanner.nextLine().replace(',', '.'));

            Compra compra = new Compra(produto, quantidade, precoUnitario);
            registrador.salvarCompra(compra);

            System.out.println("Compra registrada com sucesso!%n".formatted());
        }

        System.out.println("=== Compras registradas ===");
        List<Compra> compras = registrador.lerCompras();

        for (Compra compra : compras)
        {
            System.out.println(compra);
        }
    }
}