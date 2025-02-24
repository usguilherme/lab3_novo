package atividade03;
import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Livro> listaLivros;

	public Biblioteca() {
		this.listaLivros = new ArrayList<Livro>(100);
	}
	
	public int adicionarLivro(String titulo, String autor, int numPag) {
		Livro livro = new Livro(titulo,autor,numPag);
		listaLivros.add(livro);
		return listaLivros.size() - 1;
	}
	
	public String[] listarLivros() {
		int cont = 0;
		String[] listaNova = new String[listaLivros.size()];
		for (Livro elemento : listaLivros) {
			listaNova[cont] = elemento.toString();
			cont++;
			
		}
		return listaNova;
	}
	
	public void emprestarLivro(int id) {
		Livro livro = listaLivros.get(id);
		livro.emprestar();	
	}
	
	public void devolverLivro(int id) {
		Livro livro = listaLivros.get(id);
		livro.devolver();
	}
	

}
