package com.br.banco;

public class ContaPoupanca extends ContaAbstrata {

	public ContaPoupanca() {

	}

	public ContaPoupanca(String numero, double saldo, Cliente cliente) {
		super(numero, saldo, cliente);

	}

	public void renderJuros(double taxa) {
		super.setSaldo(super.getSaldo() * taxa);

	}

	@Override
	public double debitar(double valor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
