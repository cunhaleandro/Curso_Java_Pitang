package com.br.banco;

public class ContaImposto extends ContaAbstrata {
	public double imposto;
	public static final double TAXA = 0.001; //0,1%

	public ContaImposto (String n,Cliente c) {

		super (numero,saldo);
}

	public ContaImposto() {
		
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	@Override
	public void debitar(double valor) {
		double imposto = valor * TAXA;

		super.debitar(valor + imposto)
		
	}
	
	
}
