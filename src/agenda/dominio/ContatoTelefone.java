package agenda.dominio;

public abstract class ContatoTelefone implements Contato {

	private String nome;
	private String contato;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public abstract String getTipo();
	
}
