import java.util.Scanner;

public class exercicio_02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.println("O número é par.");
			} else {
			System.out.println("O número é ímpar.");
			}

			if (numero > 0) {
			System.out.println("O número é positivo.");
			} else if (numero < 0) {
			System.out.println("O número é negativo.");
			} else {
			System.out.println("O número é igual a zero.");
			}

		
		
		
		leia.close();


	}

}
