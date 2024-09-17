package model;

public class Cliente {
	String nome;
	String cpf;
	String email;
	Cupom cupom;
	Telefone telefone;
	
	public Cliente(String nome, String cpf, String email, Cupom cupom, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.cupom = cupom;
		this.telefone = telefone;
	}

	public Cliente(String cpf, String email) throws CPFException {
		if (ValidadorCPF.validarCPF(cpf)) {
			this.cpf = cpf;
		}
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public String getEmail() {
		return email;
	}
	
	
}
