
public class Console extends Produto{
	
     private String fabricante;

	public Console(int game, String nome, String descricao, double preco, int estoque, String fabricante) {
		super(game, nome, descricao, preco, estoque);
		this.fabricante = fabricante;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
    
   @Override
    public void visualizar() {
	   super.visualizar();
	   System.out.println("Fabricante do jogo: " + this.fabricante);
    	
    }
   
   
   
   
}
