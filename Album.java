import java.util.*;


public class Album implements Comparable<Album>{

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

	public void addMusica(Musica m){
		musicas.add(m);
	}

	@Override
	public int compareTo(Album a) {
		return String.CASE_INSENSITIVE_ORDER.compare(getCodAlbum(), a.getCodAlbum());
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return false;
		if(getClass() != obj.getClass()) return false;
		Album outroAlb = (Album) obj;
		return this.codAlbum == outroAlb.getCodAlbum();
	}

	@Override
	public int hashCode(){
		return codAlbum.hashCode();
	}

	@Override
	public String toString() {
		return "Artista: " + artista.getNome() +
				"\nCodAlbum: " + codAlbum +
				"\nTitulo: " + titulo +
				"\nData de Lançamento: " + dataLancamento +
				"\nQuantidade de Músicas: " + getQtdMusicas() +
				"\nMúsicas: " + musicas;
	}
}
