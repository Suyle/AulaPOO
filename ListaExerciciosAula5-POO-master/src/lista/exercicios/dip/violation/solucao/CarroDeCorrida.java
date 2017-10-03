package lista.exercicios.dip.violation.solucao;

public class CarroDeCorrida {

	private int capacidadeTanqueCombustivel = 0;
	private int quantidadeCombustivel;
	private int potencia;

	public CarroDeCorrida() {
	}

	public void acelerar() {
		this.potencia++;
		this.quantidadeCombustivel--;
	}

	public void abastecer(int litros) {
		this.quantidadeCombustivel = this.quantidadeCombustivel + litros;
	}

	@Override
	public String toString() {
		return "Quantidade Combustível.: " +  quantidadeCombustivel + " Potencia.:" + potencia;
	}

}