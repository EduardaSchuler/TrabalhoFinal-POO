import java.util.*;

public class Playlist implements Reproduz {

	private Set<Audio> filaDeReproducao;
	private double duracaoTotal;
	private String titulo;

	public Playlist(String titulo) {
		this.titulo = titulo;
		duracaoTotal = 0.0;
		filaDeReproducao = new HashSet<Audio>();
	}

	public double getDuracaoTotal(){
		return filaDeReproducao.stream().mapToDouble(Audio::getDuracao).sum();
	}

	public Set getFilaDeReproducao() {
		return filaDeReproducao;
	}

	public String getTitulo(){
		return titulo;
	}

	public void adicionaAudio(Audio a){
		filaDeReproducao.add(a);
	}

	//implementação da interface
	public void next() {
		filaDeReproducao.iterator().next();
	}

	@Override
	public String toString(){
		return getTitulo() + " - duração: " + getDuracaoTotal();
	}

}
