package com.br.banco;

public class ContaPoupanca extends Conta {
	public static final double TAXA = 0.001;

	public ContaPoupanca(String numero, Double saldo) {

		super(numero, saldo);
	}

	public ContaPoupanca(String numero, double saldo, Cliente cliente, double imposto) {
		super(numero, saldo, cliente);

	}

	public void renderJuros() {
		super.setSaldo(super.getSaldo() * TAXA);

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
