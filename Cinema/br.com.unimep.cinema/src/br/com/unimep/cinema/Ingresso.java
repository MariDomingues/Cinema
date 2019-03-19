package br.com.unimep.cinema;

public class Ingresso {
	private String  codigoAssentoIngresso;
	private int     tipoIngresso;
	private int     quantidade;
	private Exibe   exibe;
	private int     codSes;
	private int     codSal;
	private String  codAss;
	
	public Ingresso(String codigoAssentoIngresso, int tipoIngresso, int quantidade, int codSes, int codSal, String codAss) {
		this.codigoAssentoIngresso = codigoAssentoIngresso;
		this.tipoIngresso 		   = tipoIngresso;
		this.quantidade 		   = quantidade;
		this.codSes		 		   = codSes;
		this.codSal		 		   = codSal;
		this.codAss		 		   = codAss;
	}
	
	public String getCodigoAssentoIngresso() {
		return codigoAssentoIngresso;
	}
	public void setCodigoAssentoIngresso(String codigoAssentoIngresso) {
		this.codigoAssentoIngresso = codigoAssentoIngresso;
	}
	public int getTipoIngresso() {
		return tipoIngresso;
	}

	public int getCodSes() {
		return codSes;
	}

	public void setCodSes(int codSes) {
		this.codSes = codSes;
	}

	public int getCodSal() {
		return codSal;
	}

	public void setCodSal(int codSal) {
		this.codSal = codSal;
	}

	public String getCodAss() {
		return codAss;
	}

	public void setCodAss(String codAss) {
		this.codAss = codAss;
	}

	public void setTipoIngresso(int tipoIngresso) {
		this.tipoIngresso = tipoIngresso;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Exibe getExibe() {
		return exibe;
	}
	public void setExibe(Exibe exibe) {
		this.exibe = exibe;
	}
}
