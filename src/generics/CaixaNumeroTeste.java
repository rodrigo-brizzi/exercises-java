package generics;

public class CaixaNumeroTeste {

	public static void main(String[] args) {
		
		CaixaNumero<Double> caixaA = new CaixaNumero<>();
		caixaA.guardar(123.23);
		System.out.println(caixaA.abrir());
		
		CaixaNumero<Double> caixaB = new CaixaNumero<>();
		caixaB.guardar(123.23);
		System.out.println(caixaB.abrir());
		
	}
}
