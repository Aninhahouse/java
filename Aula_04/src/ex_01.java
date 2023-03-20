import java.util.Scanner;

public class ex_01 {

	public static void main(String[] args) {
		
		  int[] vetor = { 2,5,2,3,4,9,7,8,10,6 };
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número para buscar no vetor: ");
	        int numeroBuscado = scanner.nextInt();
	        int posicao = -1;

	        for (int i = 0; i < vetor.length; i++) {
	            if (vetor[i] == numeroBuscado) {
	                posicao = i;
	                break;
	            }
	        }

	        if (posicao >= 0) {
	            System.out.println("O número " + numeroBuscado + " foi encontrado na posição " + posicao + " do vetor.");
	        } else {
	            System.out.println("Não foi encontrado!");
	        }

	        scanner.close();

	}

}
