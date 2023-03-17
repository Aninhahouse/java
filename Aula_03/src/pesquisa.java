import java.util.Scanner;

public class pesquisa {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, sexo, esporte,contador = 0,futebolFeminino=0, maiores18Volei=0 ;
       char continua = 'S';
       
    
	   while(continua == 'S') {
    	   
       System.out.println("Digite a sua idade");
       idade = leia.nextInt();
       
       do {
    		 System.out.println("Digite o sexo (1-M/2-F/3-O):");
    	    sexo= leia.nextInt();
       }while(sexo < 1 || sexo > 3);
	      
       System.out.println("Digite seu esporte favorito(1-Futebol/2-Voleibol/3-Basqute/4-Games):");
       esporte = leia.nextInt();
       
       contador ++;
       
       if(sexo== 2 && esporte == 1)
    	   futebolFeminino ++;
       
       if(idade >= 18 && esporte == 2)
    	   maiores18Volei ++;
       
       System.out.println("Deseja continuar (S/N)?");
       continua = leia.next().toUpperCase().charAt(0);
       
       System.out.println("Total de fichas preenchidas: "+ contador);
       System.out.println("Total de pessoas do sexo feminino que gostam de futebol: " + futebolFeminino);
       System.out.println("Total de pessoas maiores de 18 que gostam de voleibol: "+ maiores18Volei);
       
       
       leia.close();
  
       }

	}

}
