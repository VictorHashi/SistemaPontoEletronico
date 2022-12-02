package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainAlteracao {

	public static void main(String[] args) {
			
		// Teste Alterar	
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(1,"Novo Usuário");
		pessoaBO.alterar(pessoa);
		pessoa = pessoaBO.procurarPorCodigo(pessoa);
		System.out.println(pessoa);
		
	}
}