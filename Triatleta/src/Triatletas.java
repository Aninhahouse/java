
public class Triatletas extends Pessoa implements Ciclista, Nadador, Corredor {

	public Triatletas(String nome) {
		super(nome);
		
	}

	@Override
	public void aquecer() {
		System.out.println("Aquecendo...");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
		
	}

	@Override
	public void nadador() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
		
		
	}
     
	public void cansar() {
	System.out.println("Cansou!");
	}
		
	
    
	
}
