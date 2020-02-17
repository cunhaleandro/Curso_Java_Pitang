package com.br.banco;

public abstract class ContaAbstrata {

	private String numero;
	private double saldo;
	private Cliente cliente;

	public ContaAbstrata(String numero, double saldo) {
		this.numero = numero;
		this.saldo = saldo;
	}

	public ContaAbstrata(String numero, double saldo, Cliente cliente) {
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(String num) {
		this.numero = num;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {

		this.cliente = cliente;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public void tranferir(Conta contaDestino, double valor) {
		this.debitar(valor);
		contaDestino.creditar(valor);

	}

	public abstract void debitar(double valor);
}
