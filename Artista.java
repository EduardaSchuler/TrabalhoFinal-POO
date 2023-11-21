import java.util.*;


public class Artista {

	private String codArtista;
	private String nome;
	private String sobre;
	private boolean verificacao;
	private Set<Album> albuns;

	public Artista(String codArtista, String nome, String sobre) {
		this.codArtista = codArtista;
		this.nome = nome;
		this.sobre = sobre;
		verificacao = false;
		albuns = new HashSet<Album>();
	}

	public String getCodArtista() {
		return codArtista;
	}

	public String getNome() {
		return nome;
	}

	public String getSobre() {
		return sobre;
	}

	// false sem verificado true verificado
	public boolean getVerificacao() {
		return verificacao;
	}

	// na hora de chamar o metodo no form usar o seguinte metodo
	// getAlbuns().forEach(album -> System.out.println(album))
	public Set getAlbuns() {
		return albuns;
	}

}
