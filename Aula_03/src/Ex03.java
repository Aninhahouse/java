import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		do {
			System.out.println("Digite um número inteiro (ou zero para finalizar): ");
			numero = leia.nextInt();
			
			if (numero > 0) {
				soma += numero;
			}
		}   while (numero != 0);
		    System.out.println("A soma de todos os números positivos digitados é: " + soma);
		
		
		leia.close();
	}

}
