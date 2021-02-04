package transportes;

public class Aereo extends Transporte{
	
	private String tipoCombustivel;
	private int qtdHelices;
	private String qtdMotor;
	private int qtdAsas;
	private int qtdPassageiros;
		
	public Aereo(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso, String tipoCombustivel,
			int qtdHelices, String qtdMotor, int qtdAsas, int qtdPassageiros) {
		super(capacidade, modelo, ano, velocidadeMaxima, peso);
		this.tipoCombustivel = tipoCombustivel;
		this.qtdHelices = qtdHelices;
		this.qtdMotor = qtdMotor;
		this.qtdAsas = qtdAsas;
		this.qtdPassageiros = qtdPassageiros;
	}

	public void levantarVoo() {
		
	}
	
	public void pousar() {
		
	}
	
	public void ligarLuzes() {
		
	}
	
}
