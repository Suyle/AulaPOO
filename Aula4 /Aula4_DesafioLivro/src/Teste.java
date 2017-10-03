
public class Teste {

	
	public static void main(String[] args) {
		
		Funcionario dba = new Dba("Suyle", 3000);		
		System.out.println(dba.getRegraDeCalculo().calcula());
		
		Funcionario tester = new Tester("Eder", 4000);		
		System.out.println(tester.getRegraDeCalculo().calcula());
		
		Funcionario desenvolvedor = new Desenvolvedor("Cauã", 1000);		
		System.out.println(desenvolvedor.getRegraDeCalculo().calcula());
	}
}
