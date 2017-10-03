package lista.exercicios.isp.violation.solucao;

public class Drone extends Veiculo implements IDrone {

	private boolean cameraOn;

	public boolean isCameraOn() {
		return cameraOn;
	}

	@Override
	public void ligarCamera() {
		cameraOn = true;
	}

	@Override
	public void desligarCamera() {
		cameraOn = false;
	}
}