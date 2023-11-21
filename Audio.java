public abstract class Audio implements Comparable<Audio>{

	private String codAudio;
	private String titulo;
	private double duracao;

	public Audio(String codAudio, String titulo, double duracao) {
		this.codAudio = codAudio;
		this.titulo = titulo;
		this.duracao = duracao;
	}

	public String getCodAudio() {
		return codAudio;
	}

	public String getTitulo() {
		return titulo;
	}

	public double getDuracao() {
		return duracao;
	}

	@Override
	public int compareTo(Audio o) {
		return String.CASE_INSENSITIVE_ORDER.compare(getCodAudio(), o.getCodAudio());
	}

	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return false;
		if(getClass() != obj.getClass()) return false;
		Audio outroAudio = (Audio) obj;
		return this.codAudio == outroAudio.getCodAudio();
	}

	@Override
	public int hashCode(){
		return codAudio.hashCode();
	}

}
