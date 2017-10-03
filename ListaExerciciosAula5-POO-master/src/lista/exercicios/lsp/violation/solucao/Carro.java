package lista.exercicios.lsp.violation.solucao;

public class Carro {

	private Manipulador manipulador = new Manipulador();
	
	public void mudaMarcha(Marcha marcha) {
		
		if (Marcha.R.equals(marcha) && manipulador.getMarcha().equals(Marcha.D)) {
			throw new RuntimeException(
					"Carro N�o pode mudar para REVERSE quando " + manipulador.getMarcha().toString() + " marcha est� engatada!");
		}
		
		manipulador.mudaMarcha(marcha);
	}
}