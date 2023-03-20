import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		
		 Scanner leia = new Scanner(System.in);

	        double[][] notas = new double[10][4];
	        
	        for (int i = 0; i < 10; i++) {
	            System.out.println("Notas do participante " + (i+1) + ":");
	            for (int j = 0; j < 4; j++) {
	                System.out.print("Bimestre " + (j+1) + ": ");
	                notas[i][j] = leia.nextDouble();
	            }
	        }

	        double[] medias = new double[10];
	        for (int i = 0; i < 10; i++) {
	            double soma = 0;
	            for (int j = 0; j < 4; j++) {
	                soma += notas[i][j];
	            }
	            medias[i] = soma / 4;
	        }

	   
	        for (int i = 0; i < 10; i++) {
	            System.out.print("Notas do participante " + (i+1) + ": ");
	            for (int j = 0; j < 4; j++) {
	                System.out.print(notas[i][j] + " ");
	            }
	            System.out.println("Média: " + medias[i]);
	        }
	        leia.close();
	}

}
