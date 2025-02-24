package atividade01;

public class Hotel {
	private Quarto[] listaQuartos;
	private int cont;
	
	public Hotel(Quarto[] listaQuartos, int cont) {
		listaQuartos = new Quarto[30];
		cont = 0;
	}
	
	public int adicionarQuarto(String tipoQuarto, Double precoNoite ) {
		if (cont < listaQuartos.length) {
			if (precoNoite == null || precoNoite <= 0 ) {
				precoNoite = 100.0;
				listaQuartos[cont] = new Quarto(tipoQuarto,precoNoite);
				cont++;
			} else {
				listaQuartos[cont] = new Quarto(tipoQuarto,precoNoite);
				cont++;
			}
			
		}
		return cont;
	}
}
