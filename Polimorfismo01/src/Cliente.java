
public class Cliente extends Pessoa {

	private double descontoPorcent;
	private double impostoPorcent;
	
	public Cliente(String nome, int idade, String genero) {
		super(nome, idade, genero);
		this.descontoPorcent = 5;
		this.impostoPorcent = 3;
	}

	public double getDescontoPorcent() {
		return descontoPorcent;
	}

	public double getImpostoPorcent() {
		return impostoPorcent;
	}
	
	
	
}
