package entities;

public class Produto {
	
	public String nomeProduto;
	public double precoProduto;
	public int quantidadeEstoque;

	public double TotalValueInStock() {
		return precoProduto * quantidadeEstoque;
	}

	public void AddProducts(int quantity) {
		this.quantidadeEstoque += quantity;
	}

	public void RemoveProducts(int quantity) {
		this.quantidadeEstoque -= quantity;
	}


}
