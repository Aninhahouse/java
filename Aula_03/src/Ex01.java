import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	
	        Scanner leia = new Scanner(System.in);
	        
	        int numero, pares = 0, impares = 0;

	        for (int contador = 1; contador <= 10; contador++) {
	            System.out.print("Digite o " + contador + "° número inteiro: ");
	            numero = leia.nextInt();

	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
	        
	    leia.close();

	}

}
