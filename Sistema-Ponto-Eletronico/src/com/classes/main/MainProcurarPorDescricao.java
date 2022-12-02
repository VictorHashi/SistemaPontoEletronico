package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainProcurarPorDescricao {

	public static void main(String[] args) {

		// Faz a pesquisa por CPF
		// retornando o primeiro resultado do retorno do select
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Caio");
		pessoa = pessoaBO.procurarPorDescricao(pessoa);
		System.out.println(pessoa);

	}
}