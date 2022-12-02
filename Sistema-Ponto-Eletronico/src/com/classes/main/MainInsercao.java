package com.classes.main;

import com.classes.BO.PessoaBO;
import com.classes.DTO.Pessoa;

public class MainInsercao {
	public static void main(String[] args) {
		// Teste Inserir
		PessoaBO pessoaBO = new PessoaBO();
		Pessoa pessoa = new Pessoa("Andrei");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Breno");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
		pessoa = new Pessoa("Caio");
		if (pessoaBO.inserir(pessoa))
			System.out.println("Inserido com Sucesso");
		else
			System.out.println("Erro ao Inserir");
	}
}