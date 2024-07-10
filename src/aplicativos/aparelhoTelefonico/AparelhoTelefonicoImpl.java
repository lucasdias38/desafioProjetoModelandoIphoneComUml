package aplicativos.aparelhoTelefonico;

import java.math.BigInteger;

public class AparelhoTelefonicoImpl implements AparelhoTelefonico {

	@Override
	public void ligar(Integer numero) {
	    System.out.println("Ligando para o número " + numero);
	}

	@Override
	public void atender() {
	    System.out.println("Atendendo ligação");
	}

	@Override
	public void iniciarCorreioVoz() {
	    System.out.println("Iniciando correio de voz");
	}

}
