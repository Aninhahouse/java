 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Scanner;

   public class Ex_01 {

		    public static void main(String[] args) {
		       
		        ArrayList<String> cores = new ArrayList<String>();
		        
		      
		        Scanner leia = new Scanner(System.in);
		        for (int i = 0; i < 5; i++) {
		            System.out.print("Digite a " + (i + 1) + "ª cor: ");
		            String cor = leia.nextLine();
		            cores.add(cor);
		        }
		        
		      
		        System.out.println("Cores adicionadas: ");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }
		        
		       
		        Collections.sort(cores);
		        System.out.println("Cores ordenadas em ordem crescente: ");
		        for (String cor : cores) {
		            System.out.println(cor);
		        }
        leia.close();
	}

}
