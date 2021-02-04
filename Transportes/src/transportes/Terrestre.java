package transportes;

public class Terrestre extends Transporte{

	private int numeroRodas;
	private int qtdAcentos;
	private boolean isMotorizado;
	private int qtdMarchas;
	private int qtdPassageiros;
		
	public Terrestre(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso, int numeroRodas,
			int qtdAcentos, boolean isMotorizado, int qtdMarchas, int qtdPassageiros) {
		super(capacidade, modelo, ano, velocidadeMaxima, peso);
		this.numeroRodas = numeroRodas;
		this.qtdAcentos = qtdAcentos;
		this.isMotorizado = isMotorizado;
		this.qtdMarchas = qtdMarchas;
		this.qtdPassageiros = qtdPassageiros;
	}

	public void virarEsquerda() {
		
	}
	
	public void virarDireita() {
		
	}
	
	public void darRe() {
		
	}
	
	
	
}
