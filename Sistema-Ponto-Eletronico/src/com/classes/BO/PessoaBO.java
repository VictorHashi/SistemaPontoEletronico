package com.classes.BO;

import com.classes.DTO.Pessoa;
import com.classes.DAO.PessoaDAO;
import java.util.List;

public class PessoaBO {

    public boolean inserir(Pessoa pessoa){
        if (existe(pessoa) != true) {
            PessoaDAO pessoasDAO = new PessoaDAO();
            return pessoasDAO.inserir(pessoa);
        }
        return false;
    }
    public boolean alterar(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.alterar(pessoa);
    }
    public boolean excluir(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.excluir(pessoa);
    }
    public Pessoa procurarPorCodigo(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.procurarPorCodigo(pessoa);
    }
    public Pessoa procurarPorDescricao(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.procurarPorDescricao(pessoa);
    }
    public boolean existe(Pessoa pessoa){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.existe(pessoa);
    }
    public List<Pessoa> pesquisarTodos(){
        PessoaDAO pessoasDAO = new PessoaDAO();
        return pessoasDAO.pesquisarTodos();
    }
}