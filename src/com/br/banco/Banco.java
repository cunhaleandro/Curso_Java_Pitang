package com.br.banco;

public class Banco {

	public static void main(String[] args) {
		Cliente p1 = new Cliente("Leandro Cunha","01506508413");
		Conta c1 = new Conta("3409-3",200,p1);
		System.out.println(c1.getSaldo()+" "+c1.getNumero());

	}

}
