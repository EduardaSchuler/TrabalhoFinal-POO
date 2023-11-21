import java.util.*;


public class Album {

	private Artista artista;
	private String codAlbum;
	private String dataLancamento;
	private String titulo;
	private Set<Musica> musicas;

	public Album(Artista artista, String codAlbum, String titulo, String dataLancamento) {
		this.artista = artista;
		this.codAlbum = codAlbum;
		this.titulo = titulo;
		this.dataLancamento = dataLancamento;
		musicas = new HashSet<Musica>();
	}

	public Artista getArtista() {
		return artista;
	}

	public String getCodAlbum() {
		return codAlbum;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	public int getQtdMusicas() {
		return musicas.size();
	}

	public Set getMusicas() {
		return musicas;
	}

}
