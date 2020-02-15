package com.br.banco;

public class Conta extends ContaAbstrata {

	private static final double PRIMEIRO_VALOR_SALDO = 100;
	private static final double CASH_BACK = 0.1;

	public Conta() {

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

}
