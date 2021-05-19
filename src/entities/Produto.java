package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;

	public double TotalValueInStock() {
		return preco * quantidade;
	}

	public void AddProducts(int quantity) {
		this.quantidade += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantidade -= quantity;
	}

	public String toString() {
		return  "Produto: " 
				+ nome 
				+ ", valor: R$ " 
				+ String.format("%.2f", preco) 
				+ ", "
				+ quantidade 
				+ " unidades, total: R$ " 
				+ String.format("%.2f", TotalValueInStock()); 
	}

}
