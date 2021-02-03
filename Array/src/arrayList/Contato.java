package arrayList;

public class Contato {

	private int codigo;
	private String nome;
	private String telefone;
	
	public Contato(int codigo, String nome, String telefone) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.telefone = telefone;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
