package model;

import java.util.ArrayList;

public class BaseDados {
	private static ArrayList<Cliente> clientes;
	
	public static void createBase() throws CPFException, CadastroException, ClienteException {
		clientes = new ArrayList<Cliente>();
		inicializarBase();
	}
	
	private static void inicializarBase() throws CPFException, CadastroException, ClienteException {
		adicionarCliente(new Cliente("057.267.536-40", "jose@gmail.com"));
		adicionarCliente(new Cliente("013.671.546-00", "joao@gmail.com"));
	}
	
	public static Cliente buscarEmail(String email) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getEmail().equalsIgnoreCase(email)) {
				return clienteCurrent;
			}
		}
		
		return null;
	}
	
	public static Cliente buscarCpf(String cpf) {
		for (Cliente clienteCurrent : clientes) {
			if (clienteCurrent.getCpf().equalsIgnoreCase(cpf)) {
				return clienteCurrent;
			}
		}
		
		return null;
	}
	
	public static boolean isCliente(Cliente cliente) {
		return clientes.contains(buscarEmail(cliente.getEmail()));
	}
	
	public static boolean adicionarCliente(Cliente cliente) throws CPFException, CadastroException, ClienteException {
		if (ValidadorCPF.validarCPF(cliente.getCpf())) {
			if (!isCliente(cliente)) {
				return clientes.add(cliente);
			}
			
			throw new ClienteException("Cliente já possui cadastro!");
		}
		
		throw new CadastroException("Erro ao cadastrar Cliente!");
	}
	
	public static boolean adicionarCupom(Cliente cliente) throws ClienteException, CadastroException {
		if (isCliente(cliente)) {
			if (cliente.cupom == null) {
				cliente.cupom = new Cupom(cliente);
			}	
			throw new ClienteException("Cliente já possui cupom!");
		}
		throw new CadastroException("Cliente não cadastrado!");
	}

	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
