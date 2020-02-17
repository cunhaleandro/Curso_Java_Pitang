package com.br.banco;

public class ContaImposto extends ContaAbstrata {
	public double imposto;
	public static final double TAXA = 0.001; // 0,1%

	public ContaImposto(String numero, Double saldo) {

		super(numero, saldo);
	}

	public ContaImposto(String numero, double saldo, Cliente cliente, double imposto) {
		super(numero, saldo, cliente);
		this.imposto = imposto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void debitar(double valor) {
		double imposto = valor * TAXA;

	}

}
