package com.br.banco;

import java.util.Arrays;

public class RepositorioClienteArray {
	private Cliente[] clientes;
	private int indice = 0;
	private static final int TAMANHO_CACHE = 100;

	public RepositorioClienteArray() {
		clientes = new Cliente[TAMANHO_CACHE];
	}

	public void inserir(Cliente c) {
		indice++;
		clientes[indice] = c;
	}

	public int procurarIndice(String cpf) {
		for (int i = 0; i <= indice; i++) {
			if (clientes[i].getCpf().equals(cpf)) {
				return i;
			}
		}
		return -1;
	}
	public boolean existe(String cpf ) {
		boolean resposta = false;
		int i = procurarIndice(cpf);
		if(i != -1) {
			resposta = true;
			
		}
		return resposta;
	}
	public Cliente procurar(String cpf) {
		Cliente c = null;
		if(existe(cpf)) {
			int i = procurarIndice(cpf);
			c = clientes[i];		
			}else {
				System.out.println("Cliente não encontrado!");
			}
		return c;
	}
	public void getInfos() {
		for (int i = 0; i <= indice; i++) {
			
		}
	
	}
}
