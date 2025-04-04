import java.util.Scanner;
public class Contador {

	public static void main(String[] args) {
		// Criando o objeto scanner
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		int parametroUm = scanner.nextInt();
		System.out.print("Informe o segundo valor: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch(ParametrosInvalidosException e) {
			System.out.println("ERRO: " + e.getMessage());
		}
	}
	
	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		if(contagem < 0) {
			throw new ParametrosInvalidosException("O primeiro valor deve ser menor que o segundo!");
		} else {
			for(int contador = parametroUm; contador <= parametroDois; contador++) {
				System.out.println("Imprimindo o número " + contador);
			}
		}
	}

}
