import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		 
		int numeroInicial, numeroFinal;
		System.out.println("Informe o inicio do intervalo: ");
		numeroInicial = leia.nextInt();
		System.out.println("Informe o finsl do intervalo: ");
		numeroFinal = leia.nextInt();
		
		if (numeroInicial > numeroFinal) {
			System.out.println("Intervalo inválido!  ");
			System.exit(0);
		}
	     
	
	
		 leia.close();

	}

}
