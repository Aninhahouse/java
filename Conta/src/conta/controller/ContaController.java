package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
    private ArrayList<Conta> listaContas = new ArrayList <Conta>();
    int numero = 0;
    
    
	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection(numero);
		
		if(conta != null)
		 conta.visualizar();
		else
			System.out.println("A conta n�o foi encontrada!");
		
	}

	@Override
	public void listarTodas() {
		for(var conta : listaContas ) {
			conta.visualizar();
		}
			
		
	}

	@Override
	public void cadastrar(Conta conta) {
		listaContas.add(conta);
		System.out.println("A Conta numero: " + conta.getNumero() + " foi criada!");
		
		
	}

	@Override
	public void atualizar(Conta conta) {
		
		
	}

	@Override
	public void deletar(int numero) {
		
		
	}

	@Override
	public void sacar(int numero, float valor) {
		
		
	}

	@Override
	public void depositar(int numero, float valor) {
		
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		
	}

	@Override
	public void detelar(int numero) {
		
		
	}

	 //Metodos Auxiliares//
	
	public int gerarNumero() {
		return ++ numero;
	}
	public Conta buscarNaCollection(int numero) {
		for(var conta : listaContas) {
			if(conta.getNumero() == numero) {
				return conta;
			}
		}
		return null;
	}
}
