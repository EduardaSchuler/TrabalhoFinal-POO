import java.util.*;

public class Podcast{

	public enum Categoria { COMEDIA, DIA_A_DIA, HORROR, HISTORIA, COTIDIANDO };

	private Set<Episodio> episodios;
	private String descricao;
	private String titulo;
	private Categoria categoria;

	public Podcast(String titulo, Categoria categoria, String descricao) {

	}

	public void lançaEpisiodio() {
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
}
