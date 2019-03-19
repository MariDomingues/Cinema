package br.com.unimep.cinema;

public class Atua {
	private String papelAtor;
	private Filme  filme;
	private Ator   nomeAtor;
	
	public Atua(String papelAtor) {
		this.papelAtor = papelAtor;
	}
	
	public String getPapelAtor() {
		return papelAtor;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public void setPapelAtor(String papelAtor) {
		this.papelAtor = papelAtor;
	}

	public Ator getNomeAtor() {
		return nomeAtor;
	}

	public void setNomeAtor(Ator nomeAtor) {
		this.nomeAtor = nomeAtor;
	}
	
	public void listarPapelAtor() {
		System.out.println(papelAtor);
	}
}
