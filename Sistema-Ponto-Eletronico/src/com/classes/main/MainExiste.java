package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExiste {

	public static void main(String[] args) {

		// Teste Existe
		// Verifica se existe outro item com a mesma descricao
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("LG");
		if (pessoaBO.existe(pessoa))
			System.out.println("pessoa Encontrada");
		else
			System.out.println("Nao Encontrada");

	}
}