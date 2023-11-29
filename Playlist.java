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

	public Audio getMusicaAleatoria() {
		if (filaDeReproducao.isEmpty()) {
			return null; // Retorna null se a lista de reprodução estiver vazia
		}

		int size = filaDeReproducao.size();
		int randomIndex = new Random().nextInt(size);

		// Transforma o Set em uma lista para poder acessar o elemento aleatório
		List<Audio> listaReproducao = new ArrayList<>(filaDeReproducao);

		return listaReproducao.get(randomIndex);
	}
}
