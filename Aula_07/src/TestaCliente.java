
public class TestaCliente {

	public static void main(String[] args) {
		
		 Cliente cliente1 = new Cliente(1, "Ana Vieira", "123.456.789-00", "Rua Nova York, 123", "(11) 95546-9110");
	        Cliente cliente2 = new Cliente(2, "Hailey Rhode", "321.654.987-00", "Avenida California, 456", "(11) 94637-2167");
	        
	        System.out.println("Dados do Cliente 1:");
	        cliente1.visualizar();
	        
	        System.out.println("\nDados do Cliente 2:");
	        cliente2.visualizar();

	}

}
