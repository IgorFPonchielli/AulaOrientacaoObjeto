package classes;

public class Triangulo extends Figura {

	public Triangulo(String nome, double base, double altura) {
		super(nome, base, altura);
	}

	@Override
	public double getLadoBase() {
		return super.getLadoBase();
	}

	@Override
	public double getLadoAltura() {
		return super.getLadoAltura();
	}
	
	@Override
	public double getArea() {
		return (this.getLadoBase() * this.getLadoAltura()) / 2;
	}
	
}
