package transportes;

public class Aquatico extends Transporte {
	
	private int qtdVelas;
	private int qtdAcentos;
	private boolean isMotorizado;
	private String portoEstacionado;
	private int qtdPassageiros;
		
	public Aquatico(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso, int qtdVelas,
			int qtdAcentos, boolean isMotorizado, String portoEstacionado, int qtdPassageiros) {
		super(capacidade, modelo, ano, velocidadeMaxima, peso);
		this.qtdVelas = qtdVelas;
		this.qtdAcentos = qtdAcentos;
		this.isMotorizado = isMotorizado;
		this.portoEstacionado = portoEstacionado;
		this.qtdPassageiros = qtdPassageiros;
	}

	public void navegar() {
		
	}
	
	public void virarEstibordo() {
		
	}
	
	public void virarBombordo() {
		
	}
	
	public void atracar() {
		
	}
	
}
