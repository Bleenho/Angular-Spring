package app.entidade;

public class Usuario {

	private String nome;

	public Usuario(String nome) {
		this.nome = nome;
	}
	public Usuario(){}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
