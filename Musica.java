public class Musica extends Audio{
	private String letra;

	public Musica(String codAudio, String titulo, double duracao, String letra) {
		super(codAudio, titulo, duracao);
		this.letra = letra;
	}

	public String getLetra() {
		return letra;
	}


}
