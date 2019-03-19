package br.com.unimep.cinema;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Scanner;

//import java.util.Timer;

public class ClassePrincipal {

	
	public static void main(String[] args) {		
		Scanner entradaString = new Scanner(System.in);
		Scanner entrada       = new Scanner(System.in);
		
		int cod = 0;
		char resp1;
		char resp2;
		char resp3;
		char resp4;
		char resp5;
		boolean encerrada;
		Exibe exi = new Exibe(1);
		
		do {
			resp1 = 'S';
			resp2 = 'S';
			resp3 = 'S';
			resp4 = 'S';
			resp5 = 'S';
			
			System.out.println("----- Cadastro de Sessão -----");
			System.out.println("Indique a data (dd/mm/aaaa): ");
			String data = entradaString.nextLine();
			System.out.println("Indique a hora (hh,mm): ");
			double hora = entrada.nextDouble();
			System.out.println("Indique o valor inteiro (99,99): ");
			double valInt = entrada.nextDouble();
			System.out.println("Indique o valor meia (99.99): ");
			double valMei = entrada.nextDouble();
			System.out.println("Sessão já encerrada? <S/N>: ");
			resp4 = entrada.next().charAt(0);
			if ((resp4 == 'S') || (resp4 == 's')) 
				encerrada = true;
			else
				encerrada = false;
			
			cod ++;
						
			System.out.println("----- Cadastro de Filmes -----");
			System.out.println("Indique o título: ");
			String titulo = entradaString.nextLine();
			System.out.println("Indique a duração(em minutos): ");
			String duracao = entradaString.nextLine();
			
			System.out.println("----- Cadastro de Gênero -----");
			System.out.println("Indique o gênero do filme: ");
			String tipo = entradaString.nextLine();
			
			Genero genero = new Genero(tipo);
			Filme filme   = new Filme(titulo, duracao, genero);
			Sessao sessao = new Sessao(cod, data, hora, valInt, valMei, encerrada, filme);
			exi.addSessao(sessao);
			
			do {
				System.out.println("----- Cadastro de Ator -----");
				System.out.println("Indique o nome: ");
				String nome = entradaString.nextLine();
				
				Ator ator = new Ator(nome, filme);
				exi.addAtor(ator);
				
				System.out.println("----- Cadastro de Atuação -----");
				System.out.println("Indique o papel do ator: ");
				String papel = entradaString.nextLine();
				
				Atua atua = new Atua(papel);
				
				System.out.println("Deseja adicionar outro ator? <S/N>:");
				resp2 = entradaString.nextLine().charAt(0);
			}
			while ((resp2 == 'S') || (resp2 == 's'));
	
			System.out.println("----- Cadastro de Salas -----");
			System.out.println("Indique o número: ");
			int nroSala = Integer.parseInt(entradaString.nextLine());
			System.out.println("Indique a capacidade: ");
			int capacidade = Integer.parseInt(entradaString.nextLine());
			
			Sala sala = new Sala(nroSala, capacidade);
			exi.setSala(sala);
			
			int cont = 0;
			
			System.out.println("----- Cadastro de Assentos -----");
			do {
				System.out.println("Indique o código do assento: ");
				String assento = entradaString.nextLine();
				
				Assento ass = new Assento(assento, sala, 'S');
				exi.addAssento(ass);
				exi.setAssento(ass);
				
				cont ++;
			}
			while (capacidade != cont);
			
			System.out.println("Deseja adicionar outra sessão? <S/N>:");
			resp1 = entradaString.nextLine().charAt(0);
		}
		while ((resp1 == 'S') || (resp1 == 's'));
		
		ArrayList<Sessao> lista = exi.getListaSessao();
		
		System.out.println("\n\n----- Sessões Disponíveis -----");
		for (Sessao sessaoTemp : lista) {
			if (!sessaoTemp.isSessaoEncerrada()) {
				System.out.println("Código: " + sessaoTemp.getCod());
				System.out.println("Data: " + sessaoTemp.getDataSessao() + "\nHora: " + sessaoTemp.getHoraSessao() + "\nValor Inteira: R$" + sessaoTemp.getValorInteira() + "\nValor Meia: R$" + sessaoTemp.getValorMeia());
				System.out.println("Filme: " + sessaoTemp.getNomeFilme().getTituloFilme() + "\nGênero: " + sessaoTemp.getNomeFilme().getTipoDeFilme().getDescricaoGenero());
				ArrayList<Ator> lista2 = exi.getListaAtor();
				for (Ator atorTemp : lista2) {
					if (atorTemp.getFilme().getTituloFilme().equals(sessaoTemp.getNomeFilme().getTituloFilme())) {
						System.out.println("Atores: " + atorTemp.getNomeAtor());
					}
				}
				System.out.println("\n\n");
			}
		}
		
		System.out.println("\n\n----- Ingresso -----");
		do {
			resp5 = 'S';
			
			System.out.println("\nIndique a sessão escolhida: ");
			int sessaoEscolhida = Integer.parseInt(entradaString.nextLine());
			
			ArrayList<Assento> lista3 = exi.getListaAssento();
			System.out.println("\n\nSala: " + exi.getSala().getNumeroSala());		
			System.out.println("----- Assentos Disponíveis -----");
			for (Assento assentoTemp : lista3) {
				if ((assentoTemp.getCodSala().equals(exi.getSala())) && (assentoTemp.getDisponivel() == 'S')) {
					System.out.println("Código: " + assentoTemp.getCodigoAssento());
					}
			}
			System.out.println("\nIndique o assento escolhido: ");
			String assentoEscolhido = entradaString.nextLine();
			System.out.println("Indique o tipo do ingresso <1-Meia/2-Inteira>:");
			int tipo = Integer.parseInt(entradaString.nextLine());

//			for (Assento assentoTemp : lista3) {
//				if (assentoTemp.getCodigoAssento().equals(assentoEscolhido)) {
//					exi.getAssento().setDisponivel('N');
//					break;
//				}
//			}
			
			Ingresso ing = new Ingresso(assentoEscolhido, tipo, 1, sessaoEscolhida, exi.getSala().getNumeroSala(), assentoEscolhido);
			exi.addIngresso(ing);
			
			System.out.println("Deseja adicionar outro ingresso? <S/N>:");
			resp5 = entradaString.nextLine().charAt(0);
		}
		while ((resp5 == 'S') || (resp5 == 's'));
		
		System.out.println("\n\n----- Impressão -----");
		ArrayList<Ingresso> lista4 = exi.getListaIngresso();
		for (Ingresso ingressoTemp : lista4) {
			for (Sessao sessaoTemp : lista) {
				if (ingressoTemp.getCodSes() == sessaoTemp.getCod()) {
					System.out.println("Data: " + sessaoTemp.getDataSessao() + "\nHora: " + sessaoTemp.getHoraSessao() + "\nFilme: " + sessaoTemp.getNomeFilme().getTituloFilme());
					System.out.println("Sala: " + ingressoTemp.getCodSal() + "\nAssento: " + ingressoTemp.getCodAss());
					
					double valTot = 0, valIng = 0;
					int    qtdTot = 0;
					qtdTot = ingressoTemp.getQuantidade();
					
					if (ingressoTemp.getTipoIngresso() ==  1) {
						valIng = sessaoTemp.getValorMeia();
						valTot = qtdTot * valIng;

						System.out.println("Tipo do ingresso: Meia" + "\nQuantidade: " + ingressoTemp.getQuantidade() + "\nVALOR TOTAL: R$" + valTot);
					}
					else {
						valIng = sessaoTemp.getValorInteira();
						valTot = qtdTot * valIng;
						
						System.out.println("\nTipo do ingresso: Inteiro" + "\nQuantidade: " + ingressoTemp.getQuantidade() + "\nVALOR TOTAL: R$" + valTot);
					}
					System.out.println("\n");
				}
			}
		}
	}
}