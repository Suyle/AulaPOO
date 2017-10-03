package lista.exercicios.isp.violation.solucao;

public abstract class Veiculo implements ILigaDesliga {

	private boolean motorLigado;

	public boolean isMotorRodando() {
		return motorLigado;
	}

	@Override
	public void ligar() {
		motorLigado = true;
	}

	@Override
	public void desligar() {
		motorLigado = false;
	}

}