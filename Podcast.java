import java.util.*;

public class Podcast implements Comparable<Podcast>{

	public enum Categoria { COMEDIA, DIA_A_DIA, HORROR, HISTORIA, COTIDIANDO };

	private Set<Episodio> episodios;
	private String codPodcast;
	private String descricao;
	private String titulo;
	private Categoria categoria;

	public Podcast(String codPodcast, String titulo, Categoria categoria, String descricao) {
		this.codPodcast = codPodcast;
		this.titulo = titulo;
		this.categoria = categoria;
		this.descricao = descricao;
		episodios = new HashSet<Episodio>();
	}

	public void lançaEpisiodio(Episodio ep) {
		episodios.add(e);
	}

	public String getCodPodcast(){
		return codPodcast;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public Set<Episodio> getEpisodios() {
		return episodios;
	}

	@Override
	public int compareTo(Podcast o) {
		return String.CASE_INSENSITIVE_ORDER.compare(getCodPodcast(), o.getCodPodcast());
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return false;
		if(getClass() != obj.getClass()) return false;
		Podcast outroPod = (Podcast) obj;
		return this.codPodcast == outroPod.getCodPodcast();
	}

	@Override
	public int hashCode(){
		return codPodcast.hashCode();
	}
}
