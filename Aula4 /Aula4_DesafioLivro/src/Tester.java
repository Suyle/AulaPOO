
public class Tester extends Funcionario {

	public Tester(String nome, int salario) {
		super(nome, salario);
		super.setRegraDeCalculo(new DezOuVintePorCento(this));
	}
}