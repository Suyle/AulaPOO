package lista.exercicios.dip.violation.solucao;

public class Piloto {

	private Acao acao;

	public Piloto() {
		acao = new Acao(new CarroDeCorrida());
	}

	public void aumentarVelocidade() {
		acao.acelerar();
	}

	public void abastecer(int litros) {
		acao.abastacer(litros);
	}
	
	public String consumo() {
		return this.acao.toString();
	}
}