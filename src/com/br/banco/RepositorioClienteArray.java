package com.br.banco;

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
	for(int i = 0; i<=indice; i++) {
		if(clientes[i].getCpf().equals(cpf)) {
			return i;
		}
	}
	return -1;
}
public void getInfos() {
	for(int i = 0; i<=indice; i++) {
	
	}
}
}
