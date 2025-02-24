package atividade02;

public class Produto {
	private String nome;
	private int id;
	private double preco;
	private int qntEstoque;
	
	public Produto(String nome, double preco, int qntEstoque) {
		this.nome = nome;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}
	
	public Produto(int id, double preco, int qntEstoque) {
		this.id = id;
		this.preco = preco;
		this.qntEstoque = qntEstoque;
	}
	
	public String mostrarProduto() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome).append(" - ").append(preco).append(" - ").append(qntEstoque);
		return sb.toString();
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQntEstoque() {
		return qntEstoque;
	}

	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}
	
	
	
	
}
