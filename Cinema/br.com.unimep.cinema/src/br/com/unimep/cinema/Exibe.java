package br.com.unimep.cinema;

import java.util.ArrayList;

public class Exibe {
	private Assento assento;
	public Assento getAssento() {
		return assento;
	}

	public void setAssento(Assento assento) {
		this.assento = assento;
	}

	private int cod;
	private Ingresso ingresso;
	private Sessao sessao;
	private Filme filme;
	private Sala sala;
	private ArrayList<Sessao> listaSessao;
	private ArrayList<Ator> listaAtor;
	private ArrayList<Assento> listaAssento;
	private ArrayList<Ingresso> listaIngresso;
	
	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public ArrayList<Ator> getListaAtor() {
		return listaAtor;
	}

	public void setListaAtor(ArrayList<Ator> listaAtor) {
		this.listaAtor = listaAtor;
	}
	
	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}
	
	public Exibe(int cod) {
		this.cod      = cod;
		listaSessao   = new ArrayList<Sessao>();
		listaAtor     = new ArrayList<Ator>();
		listaAssento  = new ArrayList<Assento>();
		listaIngresso = new ArrayList<Ingresso>();
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public ArrayList<Sessao> getListaSessao() {
		return listaSessao;
	}

	public void setListaSessao(ArrayList<Sessao> listaSessao) {
		this.listaSessao = listaSessao;
	}

	public void addSessao(Sessao novaSessao) {
		if (listaSessao.contains(novaSessao)) 
			return;
		else {
			listaSessao.add(novaSessao); 
			novaSessao.setExibe(this);  
		}
	}
	
	public ArrayList<Assento> getListaAssento() {
		return listaAssento;
	}

	public void setListaAssento(ArrayList<Assento> listaAssento) {
		this.listaAssento = listaAssento;
	}
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public void addAtor(Ator novoAtor) {
		if (listaAtor.contains(novoAtor)) {
			return;
		}
		else {
			listaAtor.add(novoAtor);
			novoAtor.setExibe(this);
		}
	}
	
	public void addAssento(Assento novoAssento) {
		if (listaAssento.contains(novoAssento)) 
			return;
		else {
			listaAssento.add(novoAssento); 
			novoAssento.setExibe(this);  
		}
	}

	public void addIngresso(Ingresso novoIngresso) {
		if (listaAssento.contains(novoIngresso)) 
			return;
		else {
			listaIngresso.add(novoIngresso); 
			novoIngresso.setExibe(this);  
		}
	}
	
	public Ingresso getIngresso() {
		return ingresso;
	}

	public void setIngresso(Ingresso ingresso) {
		this.ingresso = ingresso;
	}

	public ArrayList<Ingresso> getListaIngresso() {
		return listaIngresso;
	}

	public void setListaIngresso(ArrayList<Ingresso> listaIngresso) {
		this.listaIngresso = listaIngresso;
	}

}
