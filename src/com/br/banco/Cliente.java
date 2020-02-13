package com.br.banco;

public class Cliente {
	private String nome;
	private String cpf;
	private TipoCliente tipoCliente;
	
	public Cliente() {

	}
	public Cliente(String nome, String cpf, TipoCliente tipoCliente) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tipoCliente = tipoCliente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


}
