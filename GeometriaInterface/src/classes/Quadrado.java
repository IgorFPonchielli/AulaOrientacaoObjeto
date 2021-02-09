package classes;

public class Quadrado extends Figura {

	public Quadrado(String nome, double lado) {
		super(nome, lado, lado);
	}

	public double getLado() {
		return this.getLadoBase();
	}
	
	public double getArea() {
		return this.getLado() * this.getLado();
	}
	
}
