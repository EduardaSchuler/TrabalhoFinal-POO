import java.util.*;

public class Playlist implements Reproduz {

	private Set<Audio> filaDeReproducao;
	private double duracaoTotal;
	private String titulo;

	public Playlist(String titulo) {
	}

	public void adicionaAudio(Audio audio) {
	}

	/**
	 * @see Reproduz#next()
	 */
	public boolean next() {
		return false;
	}

	/**
	 * @see Reproduz#pause()
	 */
	public boolean pause() {
		return false;
	}

	/**
	 * @see Reproduz#play()
	 */
	public boolean play() {
		return false;
	}

}
