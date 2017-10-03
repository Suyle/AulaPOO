package lista.exercicios.dip.violation.solucao;

public class Acao implements IAcao {

	private CarroDeCorrida carro;
	
	public Acao(CarroDeCorrida carro) {
		this.carro = carro;
	}
	
	@Override
	public void acelerar() {
		carro.acelerar();
	}
	
	@Override
	public void abastacer(int litros) {
		carro.abastecer(litros);
	}

	@Override
	public String toString() {
		return carro.toString();
	}
	
	
}
