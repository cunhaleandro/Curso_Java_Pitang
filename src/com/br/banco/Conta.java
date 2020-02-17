package com.br.banco;

public class Conta extends ContaAbstrata {

	private static final double PRIMEIRO_VALOR_SALDO = 100;
	private static final double CASH_BACK = 0.1;

	public Conta(String numero, double saldo) {
		super(numero, saldo);
	}

	public Conta(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
	}

	public void debitar(double valor) {

		if (valor > this.getSaldo()) {

			System.out.println("Opera��o invalida! O valor n�o pode ser maior que o saldo");

		} else {
			this.setSaldo(this.getSaldo() - valor);

		}
	}

	public void cashBack(double valor) {
		double valorCashBack = valor * CASH_BACK;
		this.debitar(valor);
		this.creditar(valorCashBack);

	}

}
