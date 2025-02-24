package atividade01;

public class Quarto {
	private int NumQuarto;
	private String tipoQuarto;
	private Double precoNoite;
	private boolean status;
	
	public Quarto(String tipoQuarto, double precoNoite) {
		this.tipoQuarto = tipoQuarto;
		this.precoNoite = 100.0;
	}

	public Quarto(int numQuarto, String tipoQuarto, String status) {
		this.NumQuarto = numQuarto;
		this.tipoQuarto = tipoQuarto;
		this.precoNoite = 100.0;
		this.status = true;
	}

	public Quarto(int numQuarto, String tipoQuarto, double precoNoite, String status) {
		this.NumQuarto = numQuarto;
		this.tipoQuarto = tipoQuarto;
		this.precoNoite = precoNoite;
		this.status = true;
	}
	
	public String testarStatus() {
		if (status) {
			return "DISPONÍVEL";
		} else {
			return "RESERVADO";
		}
	}
	
	
	public String exibirDetalhesQuarto() {
		StringBuilder sb = new StringBuilder();
		sb.append(NumQuarto).append(" - ").append(tipoQuarto).append(" - ").append(precoNoite).append(" - ").append(testarStatus());
		return sb.toString();
	}
	
	public boolean temPrecoEspecial() {
		if (precoNoite != 100) {
			return true;
		} else {
			return false;
		}
	}

	public int getNumQuarto() {
		return NumQuarto;
	}

	public void setNumQuarto(int numQuarto) {
		NumQuarto = numQuarto;
	}

	public String getTipoQuarto() {
		return tipoQuarto;
	}

	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}

	public double getPrecoNoite() {
		return precoNoite;
	}

	public void setPrecoNoite(double precoNoite) {
		this.precoNoite = precoNoite;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
