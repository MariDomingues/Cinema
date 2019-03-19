package br.com.unimep.cinema;

public class Filme {
	
	private Genero tipoDeFilme;
	private String tituloFilme;
	private String duracaoFilme;

	public Filme (String tituloFilme, String duracaoFilme, Genero tipoDeFilme) {
		this.tituloFilme  = tituloFilme;
		this.duracaoFilme = duracaoFilme;
		this.tipoDeFilme  = tipoDeFilme;
	}	
	
	public String consultarFilme() {
		return tituloFilme;		
	}

	public Genero getTipoDeFilme() {
		return tipoDeFilme;
	}

	public void setTipoDeFilme(Genero tipoDeFilme) {
		this.tipoDeFilme = tipoDeFilme;
	}

	public String getTituloFilme() {
		return tituloFilme;
	}

	public void setTituloFilme(String tituloFilme) {
		this.tituloFilme = tituloFilme;
	}

	public String getDuracaoFilme() {
		return duracaoFilme;
	}

	public void setDuracaoFilme(String duracaoFilme) {
		this.duracaoFilme = duracaoFilme;
	}

	public void consultarGenero() {
		System.out.println(tipoDeFilme.toString());
	}
}
