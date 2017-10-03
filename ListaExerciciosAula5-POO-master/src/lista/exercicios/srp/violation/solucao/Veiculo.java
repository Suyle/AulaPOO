package lista.exercicios.srp.violation.solucao;

public class Veiculo {

    private int capacidadeTanqueCombustivel;
    private int quantidadeCombustivel;

    public int getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}

	public void setQuantidadeCombustivel(int quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}

	public int getCapacidadeTanqueCombustivel() {
		return capacidadeTanqueCombustivel;
	}

    public void acelerar() {
        quantidadeCombustivel--;
    }
}