package br.com.unimep.cinema;

public class Genero {
	private Filme filme;
	private String descricaoGenero;
	
	public Genero(String descricaoGenero) {
		this.descricaoGenero = descricaoGenero;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public void listarGenero() {
		System.out.println(descricaoGenero);
	}

	public String getDescricaoGenero() {
		return descricaoGenero;
	}

	public void setDescricaoGenero(String descricaoGenero) {
		this.descricaoGenero = descricaoGenero;
	}
	
}