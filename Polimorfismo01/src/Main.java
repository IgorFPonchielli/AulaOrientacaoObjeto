
public class Main {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario("Igor", 21, "mac", true);
		
		Compra compra = new Compra(150);
		Compra compra2 = new Compra(170);

		compra.FazerCompra(func);
		
	}

}
