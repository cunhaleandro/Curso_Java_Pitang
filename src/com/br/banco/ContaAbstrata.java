package com.br.banco;

public abstract class ContaAbstrata {

	private String numero;
	private double saldo;

	public ContaAbstrata() {

	}

	public ContaAbstrata(String numero, double saldo) {
	
		this.numero = numero;
		this.saldo = saldo;
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

	public abstract void creditar(double valor);

	public abstract double tranferir(Conta contaDestino, double valor);
}
