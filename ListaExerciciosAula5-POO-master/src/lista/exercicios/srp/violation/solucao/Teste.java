package lista.exercicios.srp.violation.solucao;

public class Teste {

	public static void main(String[] args) {

		Veiculo veiculo = new Veiculo();
		Piloto piloto = new Piloto(veiculo);

		piloto.abastecer(100);
		veiculo.acelerar();
	}
}
