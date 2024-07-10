package iphone;

import aplicativos.NavegadorInternet.NavegadorInternetImpl;
import aplicativos.aparelhoTelefonico.AparelhoTelefonicoImpl;
import aplicativos.reprodutorMusical.ReprodutorMusicalImpl;

public class Main {

	public static void main(String[] args) {
		
		ReprodutorMusicalImpl reprodutorMusical = new ReprodutorMusicalImpl();
		cabecalho("Reprodutor Musical");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		reprodutorMusical.selecionarMusica("Minha-Calmaria.mp3");
		
		AparelhoTelefonicoImpl aparelhoTelefonico = new AparelhoTelefonicoImpl();
		cabecalho("Aparelho Telefônico");
		aparelhoTelefonico.ligar(123456789);
		aparelhoTelefonico.atender();
		aparelhoTelefonico.iniciarCorreioVoz();
		
		NavegadorInternetImpl navegadorInternet = new NavegadorInternetImpl();
		cabecalho("Navegador Internet");
		navegadorInternet.exibirPagina();
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
	}
	
	private static void cabecalho (String nomeAplicativo) {
		System.out.println("\n----------------------------------");
		System.out.println(" Aplicativo " + nomeAplicativo);
		System.out.println("----------------------------------");
	}

}
