package transportes;

public class Aviao extends Aereo {

	private int qtdFlaps;
	private String classe;
	private String proprietario;
	private String operador;
	private int qtdTurbinas;

	public Aviao(int capacidade, String modelo, int ano, double velocidadeMaxima, double peso, String tipoCombustivel,
			int qtdHelices, String qtdMotor, int qtdAsas, int qtdPassageiros, int qtdFlaps, String classe,
			String proprietario, String operador, int qtdTurbinas) {
		super(capacidade, modelo, ano, velocidadeMaxima, peso, tipoCombustivel, qtdHelices, qtdMotor, qtdAsas,
				qtdPassageiros);
		this.qtdFlaps = qtdFlaps;
		this.classe = classe;
		this.proprietario = proprietario;
		this.operador = operador;
		this.qtdTurbinas = qtdTurbinas;
	}

	public void girarDireita() {

	}

	public void girarEsquerda() {

	}

	public void soltarFumaca() {

	}

	public void ligarTurbinaDireita() {

	}

	public void ligarTurbinaEsquerda() {

	}

}
