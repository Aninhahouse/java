import java.util.Arrays;
import java.util.Scanner;

public class vetorjava {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int numero;
		int vetorInteiros[] = {4,5,7,6,10,1,3,2,9,8};
		float[] vetorFloat = new float [5];
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {

			if (vetorInteiros[contador] == numero)

			System.out.println("Posição ["+contador + "] = " + vetorInteiros[contador]);

			}

			for (int contador = 0; contador < vetorFloat.length; contador ++) { vetorFloat[contador] = leia.nextFloat();

			System.out.println("Digite um valor para a posição[" + contador + "]: ");

			}

			for (float vfloat: vetorFloat) { System.out.println(vfloat);

			}
	        Arrays.sort(vetorInteiros);
	        
	        for (int vInt : vetorInteiros)
	          System.out.println(vInt);
	        
	        
	        leia.close();
		}
		
	

}
