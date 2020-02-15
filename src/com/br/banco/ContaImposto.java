package com.br.banco;

public class ContaImposto extends ContaAbstrata {
private double imposto = 0.1;

	public ContaImposto(double imposto) {
	super();
	this.imposto = imposto;
}

	public ContaImposto() {
		
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	
}
