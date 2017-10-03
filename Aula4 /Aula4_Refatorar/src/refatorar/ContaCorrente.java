package refatorar;

public class ContaCorrente {

	private int valor;

	private String titular;

	public ContaCorrente(int valor, String titular) {
		this.valor = valor;
		this.titular = titular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Titular.: " + getTitular() + " - R$" + getValor();
	}
}
