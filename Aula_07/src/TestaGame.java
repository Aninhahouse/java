
public abstract class TestaGame {

	public static void main(String[] args) {
		
		    Produto p1 = new Produto(1, "Grand Theft Auto 5 ", "Jogo eletrônico de ação e aventura", 82.41, 84);
	        Produto p2 = new Produto(2, "Bully", "Jogo eletrônico de ação e aventura", 39.99, 64);

	        p1.visualizar();
	        System.out.println("--------------------------");
	        p2.visualizar();

	}

}
