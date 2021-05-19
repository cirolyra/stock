package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto produto = new Produto();

		System.out.println("Nome do produto: ");
		produto.nome = sc.nextLine();
		System.out.println("Pre�o: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println(produto);

		System.out.println();
		System.out.println("Deseja realizar adi��o no estoque (S/N): ");
		char resp = sc.next().charAt(0);

		if (resp != 'n') {

			System.out.println();
			System.out.println("Adi��o no estoque: ");
			int quantidade = sc.nextInt();
			produto.AddProducts(quantidade);

			System.out.println(produto);

		}

		System.out.println();
		System.out.println("Deseja realizar remo��o no estoque (S/N): ");
		resp = sc.next().charAt(0);

		if (resp != 'n') {

			System.out.println();
			System.out.println("Remo��o no estoque: ");
			int quantidade = sc.nextInt();
			produto.RemoveProducts(quantidade);

			System.out.println(produto);

		}

		sc.close();
	}

}
