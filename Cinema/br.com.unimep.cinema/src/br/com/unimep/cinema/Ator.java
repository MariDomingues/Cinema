package br.com.unimep.cinema;

public class Ator {
	private String nomeAtor;
	private Atua   papelAtor;
	private Filme  filme;
	private Exibe exibe;
	
	public Exibe getExibe() {
		return exibe;
	}

	public void setExibe(Exibe exibe) {
		this.exibe = exibe;
	}

	public Ator(String nomeAtor, Filme filme) {
		this.nomeAtor = nomeAtor;
		this.filme    = filme;
	}
	
	public Atua getPapelAtor() {
		return papelAtor;
	}

	public void setPapelAtor(Atua papelAtor) {
		this.papelAtor = papelAtor;
	}
	
	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public String getNomeAtor() {
		return nomeAtor;
	}

	public void setNomeAtor(String nomeAtor) {
		this.nomeAtor = nomeAtor;
	}
}
