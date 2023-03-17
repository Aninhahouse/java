import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, menor21=0, maior50=0;
		
		do {
			System.out.println("Digite a idade da pessoa (ou idade negativa para finalizar): ");
			idade = leia.nextInt();
			
			if (idade > 0 && idade < 21) {
				menor21++;
			}
			else if (idade > 50) {
				maior50++;
			}
		}while (idade >= 0);
		
		System.out.println("Total de pessoas menor de 21 anos: "+ menor21);
		System.out.println("Totaol de pessoas maior de 50 anos: "+ maior50);
			
		
		
		
		
      
		
		leia.close();
	}

}
