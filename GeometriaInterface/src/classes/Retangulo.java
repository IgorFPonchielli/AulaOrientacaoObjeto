package classes;

public class Retangulo extends Figura {

	public Retangulo(String nome, double ladoB, double ladoA) {
		super(nome, ladoB, ladoA);
	}

	@Override
	public double getLadoBase() {
		return super.getLadoBase();
	}

	@Override
	public double getLadoAltura() {
		return super.getLadoAltura();
	}
	
	public double getArea() {
		return this.getLadoBase() * this.getLadoAltura();
	}
	
}
