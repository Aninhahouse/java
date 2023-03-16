import java.util.Scanner;

public class exercicio_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double saldo = 0;

		System.out.println("=== Bem-vinde ao seu banco ===");
		System.out.println("Digite o número da operação a ser realizada:");
		System.out.println("1. Consultar saldo");
		System.out.println("2. Depositar");
		System.out.println("3. Sacar");

		int operacao = leia.nextInt();

		switch (operacao) {
		case 1:
		System.out.println("Seu saldo atual é de R$1000.00" + saldo);
		break;
		case 2:
		System.out.println("Digite o valor a ser depositado:");
		double valorDeposito = leia.nextDouble();
		saldo += valorDeposito;
		System.out.println("Depósito realizado com sucesso! Seu novo saldo é de R$" + saldo);
		break;
		case 3:
		System.out.println("Digite o valor a ser sacado:");
		double valorSaque = leia.nextDouble();
		if (valorSaque > saldo) {
		System.out.println("Saldo insuficiente para realizar a operação.");
		} else {
		saldo -= valorSaque;
		System.out.println("Saque realizado com sucesso! Seu novo saldo é de R$" + saldo);
		}
		break;
		default:
		System.out.println("Operação inválida.");
		break;

	}
		leia.close();
	}
}
