package com.br.banco;

public class ContaPoupanca extends Conta {
	

	public ContaPoupanca() {

	}

	public ContaPoupanca(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);
		
	}


	public void renderJuros(double taxa) {
		super.setSaldo(super.getSaldo()*taxa);

	}
}
