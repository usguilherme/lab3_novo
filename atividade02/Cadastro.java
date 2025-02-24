package atividade02;

public class Cadastro {
	private Produto[] listaProdutos;
	private int id;
	
	public Cadastro(Produto[] listaProdutos, int id) {
		listaProdutos = new Produto[100];
		id = 0;
	}
	
	public void adicionaProduto(String nome, double preco, int qntEstoque) {
		if (id < listaProdutos.length) {
			listaProdutos[id] = new Produto(nome,preco,qntEstoque);
			id++;
		} else {
			System.out.println("A LISTA JÁ FOI CHEIA");
		}
	}
	
	public void alterarProduto(int numeracao1, double preco1, int qntEstoque1) {
		Produto produtoExistente = listaProdutos[numeracao1 - 1];
		if (produtoExistente == null || numeracao1 >= listaProdutos.length ) {
			System.out.println("Produto não encontrado com o código fornecido");
		} else {
			produtoExistente.setPreco(preco1);
			produtoExistente.setQntEstoque(qntEstoque1);
		}
	}
	
	public double consultarPrecoTotal(int codigo) {
		if (codigo < 1 || codigo > 100) {
			System.out.println("Produto não encontrado com o código fornecido");
			return 0;	
		} else {
			Produto produtoExistente = listaProdutos[codigo - 1];
			if (produtoExistente != null) {
				return produtoExistente.getPreco() * produtoExistente.getQntEstoque();	
			} else {
				return 0;
			}
		}
	}
	
	public String[] listarProdutos() {
		String[] listaNova = new String[listaProdutos.length];
		int cont = 0;
		for(Produto elemento : listaProdutos) {
			listaNova[cont] = elemento.toString();
			cont++;
		}
	return listaNova;
	}
	
}
