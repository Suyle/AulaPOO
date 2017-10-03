package lista.exercicios.isp.violation.solucao;

public class Carro extends Veiculo implements ILigarRadio {

	private boolean radioOn;

	public boolean isRadioOn() {
		return radioOn;
	}

	@Override
	public void ligarRadio() {
		radioOn = true;
	}

	@Override
	public void desligarRadio() {
		radioOn = false;
	}
}