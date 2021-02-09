
public class Compra {

	private double valorCompra;
	private static double valorImpostos;
	private static double valorDescontos;
		
	public Compra(double valorCompra) {
		super();
		this.valorCompra = valorCompra;
	}

	public void FazerCompra(Funcionario funcionario) {
		
		valorDescontos = (funcionario.getDescontoPorcent() / 100) * this.valorCompra;
		valorImpostos = (funcionario.getImpostoPorcent() / 100) * this.valorCompra;
		
		System.out.println("Total da Compra: " + this.valorCompra);
		System.out.println("Total de Imposto: " + valorImpostos);
		System.out.println("Total de Desconto: " + valorDescontos);
		
	}
	
	public void FazerCompra(Cliente cliente) {
		
		valorDescontos = (cliente.getDescontoPorcent() / 100) * this.valorCompra;
		valorImpostos = (cliente.getImpostoPorcent() / 100) * this.valorCompra;
		
		System.out.println("Total da Compra: " + this.valorCompra);
		System.out.println("Total de Imposto: " + valorImpostos);
		System.out.println("Total de Desconto: " + valorDescontos);
		
	}
	
	public double getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(double valorCompra) {
		this.valorCompra = valorCompra;
	}
	
}
