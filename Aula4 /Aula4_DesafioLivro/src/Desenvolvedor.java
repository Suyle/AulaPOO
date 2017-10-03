
public class Desenvolvedor extends Funcionario  {

	public Desenvolvedor(String nome, int salario) {
		super(nome, salario);
		super.setRegraDeCalculo(new DezOuVintePorCento(this));
	}
}