package com.classes.DTO;

public class Pessoa {
	private int codigo;
	private String cpf;
	public Pessoa() {

	}
	public Pessoa(int codigo) {
		setCodigo(codigo);
	}
	public Pessoa(String cpf) {
		setCpf(cpf);
	}
	public Pessoa(int codigo, String cpf) {
		setCodigo(codigo);
		setCpf(cpf);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pessoa [codigo=");
		builder.append(codigo);
		builder.append(", CPF=");
		builder.append(cpf);
		builder.append("]");
		return builder.toString();
	}
}