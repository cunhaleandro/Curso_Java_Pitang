package com.br.banco;

public class ContaBonificada extends Conta {
	private static final double TAXA_BONUS = 0.1;
	private double bonus;

	public ContaBonificada(String numero, double saldo) {
		super(numero, saldo);
	}

	public ContaBonificada(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);

	}

	public double getBonus() {
		return this.bonus;
	}

	public void renderBonus(double valor) {
		super.creditar(this.bonus);
		this.bonus = 0;
	}

	public void creditar(double valor) {
		this.bonus = this.bonus + (valor * TAXA_BONUS);
		super.creditar(valor);

	}

	public void debitar(double valor) {
		if (valor > this.getSaldo()) {

			System.out.println("Operação invalida! O valor não pode ser maior que o saldo");

		} else {
			this.setSaldo(this.getSaldo() - valor);
			System.out.println("Operação invalida!");
		}

	}
}
