package br.com.unimep.cinema;

public class Sala {
	private Sessao sessao;
	private int numeroSala;
	private int capacidadeSala;
	
	
	public Sala(int numeroSala, int capacidadeSala) {
		this.numeroSala 	= numeroSala;
		this.capacidadeSala = capacidadeSala;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public int consultarSala(int nroSala) {
		return capacidadeSala;
	}

	public int getNumeroSala() {
		return numeroSala;
	}

	public void setNumeroSala(int numeroSala) {
		this.numeroSala = numeroSala;
	}

	public int getCapacidadeSala() {
		return capacidadeSala;
	}

	public void setCapacidadeSala(int capacidadeSala) {
		this.capacidadeSala = capacidadeSala;
	}

}
