
public abstract class TestaGame {

	public static void main(String[] args) {
		
	       
	        Jogo jg1 = new Jogo (1,"Grand Theft Auto 5", "Jogo eletrônico de ação e aventura",82.41, 84, "Xbox, Playstation, Windows");
	        jg1.getPlataforma();
	        
	        
	        Jogo jg2 = new Jogo (2,"Bully", "Jogo eletrônico de ação e aventura", 39.99, 64, "Xbox, Playstation, Windows, Android");
	        jg2.getPlataforma();
	      
		   
	        Console cs1 = new Console(1,"Grand Theft Auto 5", "Jogo eletrônico de ação e aventura",82.41, 84, "Rockstar Games  " );
			cs1.getFabricante();
			
			
	        Console cs2 = new Console(2,"Bully", "Jogo eletrônico de ação e aventura", 39.99, 64, "Rockstar Games  ");
	        cs2.getFabricante();

	        
	            cs1.visualizar();
	            System.out.println("Plataforma: " + jg1.getPlataforma() );
		        System.out.println("--------------------------");
		        cs2.visualizar();
		        System.out.println("Plataforma: " + jg2.getPlataforma() );
		     

	}

}
