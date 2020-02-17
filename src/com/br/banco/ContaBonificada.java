package com.br.banco;

public class ContaBonificada extends ContaAbstrata {
	private static final double TAXA_BONUS = 0.1;
	private double bonus;

	public ContaBonificada() {

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

	@Override
	public double debitar(double valor) {
	
		return 0;
	}
}
