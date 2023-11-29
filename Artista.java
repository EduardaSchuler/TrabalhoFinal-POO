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

	public List getAlbunsTitulos() {
		 return albuns.stream()
                .map(Album::getTitulo) // apresenta apenas o titulo do album
                .collect(Collectors.toList());
	}

	public Set getAlbuns(){
		return albuns;
	}

	public void lancaAlbum(Album a){
		albuns.add(a);
	}

	// nao esta funcionando
	public void alteraVerificacao(){
		if(this.verificacao == false) this.verificacao = true;
		if(this.verificacao == true) this.verificacao = false;
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() +
				" - Sobre: " + getSobre() +
				" - Albuns: " + getAlbunsTitulos();
	}
}
