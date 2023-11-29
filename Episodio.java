public class Episodio extends Audio {

	private String nomeApresentador;
	private String descricao;
	private String transcricao;
	private String dataLancamento;

	public Episodio(String codAudio, String titulo, double duracao, String nomeApresentador, String descricao, String transcricao, String dataLancamento) {
		super(codAudio, titulo, duracao);
		this.nomeApresentador = nomeApresentador;
		this.descricao = descricao;
		this.transcricao = transcricao;
		this.dataLancamento = dataLancamento;
	}

	public String getNomeApresentador() {
		return nomeApresentador;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getTranscricao() {
		return transcricao;
	}

	public String getDataLancamento() {
		return dataLancamento;
	}

	@Override
	public String toString(){
		return "Apresentado por: " + getNomeApresentador()
				+ " - descricao: " + getDescricao()
				+ " - duracao: " + getDuracao()
				+ " - lançado em: " + getDataLancamento();
	}

}
