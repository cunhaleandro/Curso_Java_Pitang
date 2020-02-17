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

	private void setNumero(String num) {
		this.numero = num;
	}

	private void setSaldo(double valor) {
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

	public double tranferir(Conta contaDestino, double valor) {
		this.debitar(valor);
		contaDestino.creditar(valor);
		return this.getSaldo();
	}

	public abstract void debitar(double valor);
}
