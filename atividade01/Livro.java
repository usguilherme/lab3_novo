package atividade03;

public class Livro {
	private String titulo;
	private String autor;
	private int numPag;
	private String status;
	
	public Livro(String titulo, String autor, int numPag) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.status = "Disponível";
	}

	public Livro(String titulo, String autor, int numPag, String status) {
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
		this.status = status;
	}

	public String getTitulo() {return titulo;}

	public void setTitulo(String titulo) {this.titulo = titulo;}

	public String getAutor() {return autor;}

	public void setAutor(String autor) {this.autor = autor;}

	public int getNumPag() {return numPag;}

	public void setNumPag(int numPag) {this.numPag = numPag;}

	public String getStatus() {return status;}

	public void setStatus(String status) {this.status = status;}
	
	public void emprestar() {status = "emprestado";}
	
	public void devolver() {status = "devolvido";}
	
}
