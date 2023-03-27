
public class Produto {
	
	    private int game;
	    private String nome;
	    protected String descricao;
	    protected double preco;
	    private int estoque;
	    
	    public Produto(int game, String nome, String descricao, double preco, int estoque) {
	        this.game = game;
	        this.nome = nome;
	        this.descricao = descricao;
	        this.preco = preco;
	        this.estoque = estoque;
	 
	    }
	    
	   

	    public int getGame() {
	        return game;
	    }

	    public void setGame(int game) {
	        this.game = game;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public double getPreco() {
	        return preco;
	    }

	    public void setPreco(double preco) {
	        this.preco = preco;
	    }

	    public int getEstoque() {
	        return estoque;
	    }

	    public void setEstoque(int estoque) {
	        this.estoque = estoque;
	    }

	    public void visualizar() {
	        System.out.println("Game: " + game);
	        System.out.println("Nome: " + nome);
	        System.out.println("Descrição: " + descricao);
	        System.out.println("Preço: " + preco);
	        System.out.println("Estoque: " + estoque);
	    }
}
