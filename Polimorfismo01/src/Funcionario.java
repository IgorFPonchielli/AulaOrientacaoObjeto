
public class Funcionario extends Pessoa {

	private double descontoPorcent;
	private double impostoPorcent;
	private boolean isGerente;
	
	public Funcionario(String nome, int idade, String genero, boolean isGerente) {
		super(nome, idade, genero);
		this.isGerente = isGerente;
		this.DescontoFuncionario();
		this.impostoPorcent = 11;
	}

	private void DescontoFuncionario() {
		if (isGerente) {
			this.descontoPorcent = 28;
		} else {
			this.descontoPorcent = 25;
		}
	}
	
	public boolean isGerente() {
		return isGerente;
	}

	public void setGerente(boolean isGerente) {
		this.isGerente = isGerente;
		this.DescontoFuncionario();
	}

	public double getDescontoPorcent() {
		return descontoPorcent;
	}

	public double getImpostoPorcent() {
		return impostoPorcent;
	}
	
	
	
	
}
