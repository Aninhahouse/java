import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex_03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	 
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int contador = 0; contador < 10; contador ++) {
		System.out.println("Digite um número:  ");
		numeros.add(leia.nextInt());
		}
		numeros.add(null);
		
		System.out.println("Listar  os Elementos do conjunto");
		
		for(var numero : numeros)
			System.out.println(numero);
		
		
		
		
		
		
		   
       leia.close();
	}

}
