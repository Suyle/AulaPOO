
public class Dba extends Funcionario {

	public Dba(String nome, int salario) {
		super(nome, salario);
		super.setRegraDeCalculo(new QuinzeOuVinteCincoPorCento(this));
	}
}