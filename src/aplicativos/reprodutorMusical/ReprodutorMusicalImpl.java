package aplicativos.reprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

	@Override
	public void tocar() {
	    System.out.println("Tocando música");
	}

	@Override
	public void pausar() {
	    System.out.println("Pausando música");
	}

	@Override
	public void selecionarMusica(String musica) {
	    System.out.println("Selecionando a música " + musica);
	}

}
