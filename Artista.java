import java.util.*;
import java.util.stream.Collectors;


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

	public List getAlbuns() {
		List<String> tituloAlbuns = albuns.stream()
                .map(Album::getTitulo) // Transforma Albuns em String (titulo)
                .collect(Collectors.toList());
		return tituloAlbuns;
	}

	public void alteraVerificacao(){
		if(this.verificacao == false) this.verificacao = true;
		if(this.verificacao == true) this.verificacao = false;
	}

	@Override
	public String toString() {
		return "CodArtista: " + getCodArtista() +
				"\nNome: " + getNome() +
				"\nSobre: " + getSobre() +
				"\nVerificacao: " + getVerificacao() +
				"\nAlbuns: " + getAlbuns();
	}
}
