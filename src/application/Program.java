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
		System.out.println("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = sc.nextInt();

		System.out.println(produto);
		
		System.out.println();
		System.out.println("Adição no estoque: ");
		int quantidade = sc.nextInt();
		produto.AddProducts(quantidade);
		
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Remoção no estoque: ");
		quantidade = sc.nextInt();
		produto.RemoveProducts(quantidade);
		
		System.out.println(produto);
		
		sc.close();
	}

}
