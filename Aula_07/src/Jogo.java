
public class Jogo extends Produto{ 
	  
	private String plataforma;

	public Jogo(int game, String nome, String descricao, double preco, int estoque, String plataforma) {
		super(game, nome, descricao, preco, estoque);
		this.plataforma = plataforma;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	   @Override 
	   public void visualizar() {
	    super.visualizar();
	    System.out.println("Plataforma do jogo: " + this.plataforma);
	    
	   }
	   
}
