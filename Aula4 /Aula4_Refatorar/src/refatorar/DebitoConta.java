package refatorar;

public class DebitoConta implements IOperacaoContaCorrente {
	private ContaCorrente conta;

	public DebitoConta(ContaCorrente conta) {
		this.conta = conta;
	}
	
	@Override
	public String debitarConta(int valor) {
		if (validarSaldo(valor)) {
			this.conta.setValor(this.conta.getValor() - valor);
			return emitirComprovante();
		}
		return "Saldo Insuficiente";
	}
	
	private String emitirComprovante() {
		return "Debito Efetuado Com Sucesso! "
				+ "\nSaldo Atual.: " + this.conta.getValor();
	}

	private boolean validarSaldo(int valor) {
		return this.conta.getValor() >= valor;
	}

}
