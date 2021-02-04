package transportes;

public class Transporte {

	private int capacidade;	
	private String modelo;
	private int ano;
	private double velocidadeMaxima;
	private double peso;
	
	public Transporte(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso) {
		super();
		this.capacidade = capacidade;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeMaxima = velocidadeMaxima;
		this.peso = peso;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void aumentarVelocidade() {
		System.out.println("Aumentar Velocidade");
	}
	
	public void diminiurVelocidade() {
		System.out.println("Diminiur Velocidade");
	}
	
	public void parar() {
		System.out.println("Parar Transporte");
	}
		
}
