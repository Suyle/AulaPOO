
public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {	
	private Funcionario funcionario;
	
	public QuinzeOuVinteCincoPorCento(Funcionario funcionario){
		this.funcionario = funcionario;
	}
	
	@Override
	public double calcula() {
		if (funcionario.getSalarioBase() > 2000.0) {
			return funcionario.getSalarioBase() * 0.75;
		} else {
			return funcionario.getSalarioBase() * 0.85;
		}
	}
}
