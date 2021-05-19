package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto a = new Produto();

		System.out.println("Nome do produto: ");
		a.nomeProduto = sc.nextLine();
		System.out.println("Preço: ");
		a.precoProduto = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		a.quantidadeEstoque = sc.nextInt();

		String produto = a.nomeProduto;
		int quantidade = a.quantidadeEstoque;
		double preco = a.precoProduto;
		double totalEstoque = a.TotalValueInStock();

		// a.AddProducts(a.quantidadeEstoque);

		System.out.printf("Nome do produto: %s%n", produto);
		System.out.printf("Preço: %.2f%n", preco);
		System.out.printf("Quantidade: %d%n", quantidade);
		System.out.printf("Total no estoque: %.2f%n", totalEstoque);

		sc.close();
	}

}
