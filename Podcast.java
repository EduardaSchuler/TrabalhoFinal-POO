import java.util.*;
import java.util.stream.Collectors;

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
		episodios.add(ep);
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

	public List<String> getEpisodiosTitulo() {
		return episodios.stream()
				.map(Episodio::getTitulo) // apresenta apenas o titulo do episodio
				.collect(Collectors.toList());
	}

	public List<Episodio> getEpisodios(){
		return episodios.stream().toList();
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

	@Override
	public String toString(){
		OptionalDouble averageDuration = getEpisodios().stream().mapToDouble(Episodio::getDuracao).average();
		double average = averageDuration.orElse(0.0);

		double roundedAverage = Math.round(average * 100.0) / 100.0;
		return "Titulo: " + getTitulo()
				+ " - categoria: " + getCategoria()
				+ " - episodios: " + getEpisodiosTitulo()
				+ " - tempo total do podcast: " + getEpisodios().stream().mapToDouble(Episodio::getDuracao).sum()
				+ " - tempo medio dos episodios: " + roundedAverage;
	}
}
