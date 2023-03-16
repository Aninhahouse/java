import java.util.Scanner;

public class Exercicio_01 {



	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
        
		
		
        System.out.println("Digite o valor de A");
         int valorA =  leia.nextInt();
        System.out.println("Digite o valor de B");
         int valorB = leia.nextInt() ;
        System.out.println("Digite o valor de C");
         int valorC = leia.nextInt() ;
         
         int somaAB= valorA + valorB;
         
         if (somaAB > valorC) {
             System.out.println("A soma de A+B é maior que C.");
         } else if (somaAB < valorC) {
             System.out.println("A soma de A+B é menor que C.");
         } else {
             System.out.println("A soma de A + B é igual a C.");
         }
	
         leia.close();
     
	}

}
