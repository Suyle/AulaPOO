
public class DezOuVintePorCento implements RegraDeCalculo {
	private Funcionario funcionario;
	
	public DezOuVintePorCento(Funcionario funcionario){
		this.funcionario = funcionario;
	}
	
	@Override
	public double calcula() {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}
	}
}
