package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainExclusao {

	public static void main(String[] args) {

		// Teste Excluir
		PessoaBO marcaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa(1);
		if (marcaBO.excluir(pessoa))
			System.out.println("Excluido com Sucesso");
		else
			System.out.println("Erro ao Excluir");

	}
}