package transportes;

public class Automovel extends Terrestre{
	
	private String cor;
	private int numeroPortas;
	private String placa;
	private boolean comVidro;
	private String chassi;
		
	public Automovel(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso, int numeroRodas,
			int qtdAcentos, boolean isMotorizado, int qtdMarchas, int qtdPassageiros, String cor, int numeroPortas,
			String placa, boolean comVidro, String chassi) {
		super(capacidade, modelo, ano, velocidadeMaxima, peso, numeroRodas, qtdAcentos, isMotorizado, qtdMarchas,
				qtdPassageiros);
		this.cor = cor;
		this.numeroPortas = numeroPortas;
		this.placa = placa;
		this.comVidro = comVidro;
		this.chassi = chassi;
	}

	public void ligarSetaEsquerda() {		
	}
	
	public void ligarSetaDireita() {		
	}
	
	public void ligarAlerta() {		
	}
	
	public void ligarTracao() {
	}
	
	public void abrirJanela() {		
	}
	
	
}
