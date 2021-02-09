package classes;

public abstract class Figura implements IGeometricos{

	private String nome;
	private double ladoBase;
	private double ladoAltura;
	
	public Figura(String nome, double ladoBase, double ladoAltura) {
		this.nome = nome;
		this.ladoBase = ladoBase;
		this.ladoAltura = ladoAltura;
	}

	public Figura(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	double getLadoBase() {
		return ladoBase;
	}

	double getLadoAltura() {
		return ladoAltura;
	}
	
	
	
}
