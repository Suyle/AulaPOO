package lista.exercicios.lsp.violation.solucao;

public class Teste {

	public static void main(String[] args) {
		
		Aviao aviao = new Aviao();
		aviao.mudaMarcha(Marcha.D);
		aviao.mudaMarcha(Marcha.D);
		aviao.mudaMarcha(Marcha.R);
		
		Carro carro = new Carro();
		carro.mudaMarcha(Marcha.D);
		carro.mudaMarcha(Marcha.D);
		carro.mudaMarcha(Marcha.D);
		carro.mudaMarcha(Marcha.R);
	}
}
