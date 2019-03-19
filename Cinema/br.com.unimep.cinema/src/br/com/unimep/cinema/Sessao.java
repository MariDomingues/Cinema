package br.com.unimep.cinema;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Sessao {
	private int cod;
	private Exibe exibe;
	private Filme nomeFilme;
	private String dataSessao;
	private double horaSessao;
	private double ValorInteira;
	private double ValorMeia;
	private boolean sessaoEncerrada;
	
	public Sessao(int cod, String dataSessao, double horaSessao, double ValorInteira, double ValorMeia, boolean sessaoEncerrada, Filme nomeFilme) {		
		this.cod   	 		 = cod;
		this.dataSessao   	 = dataSessao;
		this.horaSessao   	 = horaSessao;
		this.ValorInteira 	 = ValorInteira;
		this.ValorMeia	  	 = ValorMeia;
		this.nomeFilme       = nomeFilme; 
		this.sessaoEncerrada = sessaoEncerrada;
	}
	
	public Exibe getExibe() {
		return exibe;
	}

	public void setExibe(Exibe exibe) {
		this.exibe = exibe;
	}

	public Filme getNomeFilme() {
		return nomeFilme;
	}


	public void setNomeFilme(Filme nomeFilme) {
		this.nomeFilme = nomeFilme;
	}


	public String getDataSessao() {
		return dataSessao;
	}


	public void setDataSessao(String dataSessao) {
		this.dataSessao = dataSessao;
	}


	public double getHoraSessao() {
		return horaSessao;
	}


	public void setHoraSessao(double horaSessao) {
		this.horaSessao = horaSessao;
	}


	public double getValorInteira() {
		return ValorInteira;
	}


	public void setValorInteira(double valorInteira) {
		ValorInteira = valorInteira;
	}


	public double getValorMeia() {
		return ValorMeia;
	}


	public void setValorMeia(double valorMeia) {
		ValorMeia = valorMeia;
	}

	public boolean isSessaoEncerrada() {
		return sessaoEncerrada;
	}

	public void setSessaoEncerrada(boolean sessaoEncerrada) {
		this.sessaoEncerrada = sessaoEncerrada;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
}
