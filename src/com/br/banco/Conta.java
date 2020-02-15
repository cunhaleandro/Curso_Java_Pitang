package com.br.banco;

public class Conta extends ContaAbstrata {

	private static final double PRIMEIRO_VALOR_SALDO = 100;
	private static final double CASH_BACK = 0.1;

	public Conta() {

	}

	public Conta(String numero, Cliente cliente) {
		super();
		this.numero = numero;
		this.cliente = cliente;
	}

	public Conta(String numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = PRIMEIRO_VALOR_SALDO;
		this.cliente = cliente;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {

		this.cliente = cliente;
	}

	public void setNumero(String num) {
		this.numero = num;
	}

	public void setSaldo(double valor) {
		this.saldo = valor;
	}

	public void creditar(double valor) {
		this.saldo += valor;
	}

	public double debitar(double valor) {

		if (valor > this.getSaldo()) {
			this.saldo -= valor;
			System.out.println("Operação invalida! O valor não pode ser maior que o saldo");
			return this.getSaldo();

		} else {
			return this.getSaldo();
		}
	}

	public void cashBack(double valor) {
		double valorCashBack = valor * CASH_BACK;
		this.debitar(valor);
		this.creditar(valorCashBack);

	}

	public double tranferir(Conta contaDestino, double valor) {
		this.debitar(valor);
		contaDestino.creditar(valor);
		return this.getSaldo();
	}
}
