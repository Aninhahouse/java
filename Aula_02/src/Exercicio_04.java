import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		
	
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite o primeiro número: ");
		float num1 = leia.nextFloat();

		System.out.print("Digite o segundo número: ");
		float num2 = leia.nextFloat();

		System.out.println("Selecione a operação desejada:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		int opcao = leia.nextInt();

		float resultado;

		switch (opcao) {
		case 1:
		resultado = num1 + num2;
		System.out.println("Resultado da soma: " + resultado);
		break;
		case 2:
		resultado = num1 - num2;
		System.out.println("Resultado da subtração: " + resultado);
		break;
		case 3:
		resultado = num1 * num2;
		System.out.println("Resultado da multiplicação: " + resultado);
		break;
		case 4:
		if (num2 == 0) {
		System.out.println("Não é possível realizar divisão por zero");
		break;
		}
		resultado = num1 / num2;
		System.out.println("Resultado da divisão: " + resultado);
		break;
		default:
		System.out.println("Opção inválida");
		break;
	}
		leia.close();
  }
}
