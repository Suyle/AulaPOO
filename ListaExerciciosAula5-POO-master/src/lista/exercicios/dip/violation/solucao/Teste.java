package lista.exercicios.dip.violation.solucao;

public class Teste {

	public static void main(String[] args) {
		Piloto piloto = new Piloto();
		
		piloto.abastecer(100);
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
		
		piloto.abastecer(2);
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
		
		piloto.aumentarVelocidade();
		System.out.println(piloto.consumo());
	}
}
