package model;

public class Cupom {
	String codigo;
	double valor;
	
	public Cupom(Cliente cliente) {}
	
	public Cupom(String codigo, double valor, Cliente cliente) {
		this.codigo = codigo;
		this.valor = valor;
	}
	
	
	
}
