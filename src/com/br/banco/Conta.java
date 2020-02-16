package com.br.banco;

public class Conta extends ContaAbstrata {

	private static final double PRIMEIRO_VALOR_SALDO = 100;
	private static final double CASH_BACK = 0.1;

	public Conta() {
		super(this.getNumero(), this.getSaldo());
	}

	public double debitar(double valor) {
		
		if (valor > this.getSaldo()) {
		super.(this.getSaldo()) -= valor;
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
