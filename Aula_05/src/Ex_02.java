import java.util.Scanner;
import java.util.Stack;

public class Ex_02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Stack<String> pilhaBanco = new Stack<String>();
		byte opcao = 0;
		String livro;
		
		do {
			System.out.println("PILHA DE LIVROS\n");
			
			System.out.println("Opção\tFunção");
			System.out.println("1-\tAdicionar livro na pilha");
			System.out.println("2-\tListar todos os livros da pilha");
			System.out.println("3-\tRetirar livro da pilha");
			System.out.println("0-\tSair");
			
			System.out.println("\nEscolha uma opção: ");
			opcao =leia.nextByte();
			
			switch (opcao) {
				case 1:
					System.out.println("\nDigite o nome do livro: ");
					leia.nextLine();
					livro = leia.nextLine();
					
					pilhaBanco.add(livro);
					System.out.println("Livro adicionado com sucesso!\n\n");
					
					break;
				
				case 2:
					if (pilhaBanco.isEmpty()) {
						System.out.println("A pilha está vazia!");
					}
					else {
						System.out.println("\nLivros na pilha: ");
						
						for (String elemento : pilhaBanco) {
							System.out.println(elemento);
						}
						
						System.out.println("\n");
					}
					
				
					break;
				
				case 3:
					if (pilhaBanco.isEmpty()) {
						System.out.println("A pilha está vazia!");
					}
					else {
						pilhaBanco.pop();
						System.out.println("Livro removido com sucesso!\n\n");
					}
		
					break;
		
				default:
					if (opcao != 0) {
						System.out.println("Opção Inválida!");
					}
			}
			
		} while (opcao != 0);
		
		System.out.println("Programa finalizado!");
		
		leia.close();
       //Atividade 2 Pilha
	}

}