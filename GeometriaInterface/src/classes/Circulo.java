package classes;

public class Circulo extends Figura {

	public Circulo(String nome, double raio) {
		super(nome, raio, raio);
	}
	
	private double getRaio() {
		return this.getLadoBase();
	}

	@Override
	public double getArea() {
		return Math.PI * (this.getRaio() * this.getRaio());
	}
	
	
}
