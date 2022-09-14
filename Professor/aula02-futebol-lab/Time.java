public class Time
{
    private String nome;
	private Cidade cidadeSede;

	public Cidade getCidadeSede() {
		return cidadeSede;
	}

	public void setCidadeSede(Cidade cidadeSede) {
		this.cidadeSede = cidadeSede;
	}

	public Time(String nome) {
		this.nome = nome;
	}

	// public String getNomeCidadeSede() {
	// 	return nomeCidadeSede;
	// }

	// public void setNomeCidadeSede(String nomeCidadeSede) {
	// 	this.nomeCidadeSede = nomeCidadeSede;
	// }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
