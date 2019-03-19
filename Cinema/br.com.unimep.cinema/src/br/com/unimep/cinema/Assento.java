package br.com.unimep.cinema;

public class Assento {
	private Sala   codSala;
	private String codigoAssento;
	private Exibe  exibe;
	private char   disponivel;
	
	public Assento(String codigoAssento, Sala codSala, char disponivel) {
		this.codigoAssento = codigoAssento;
		this.codSala 	   = codSala;
		this.disponivel    = disponivel;
	}
	
	public char getDisponivel() {
		return disponivel;
	}

	public void setDisponivel(char disponivel) {
		this.disponivel = disponivel;
	}

	public Sala getCodSala() {
		return codSala;
	}

	public void setCodSala(Sala codSala) {
		this.codSala = codSala;
	}

	public String getCodigoAssento() {
		return codigoAssento;
	}

	public void setCodigoAssento(String codigoAssento) {
		this.codigoAssento = codigoAssento;
	}

	public Exibe getExibe() {
		return exibe;
	}

	public void setExibe(Exibe exibe) {
		this.exibe = exibe;
	}
}
