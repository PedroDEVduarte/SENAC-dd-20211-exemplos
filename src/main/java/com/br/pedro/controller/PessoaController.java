package com.br.pedro.controller;

import  com.br.pedro.model.bo.PessoaBO ;
import  com.br.pedro.model.entity.PessoaVO ;

public  class  PessoaController {
		
	PessoaBO pessoaBO =  novo  PessoaBO ();

	public  int  buscaPorNomeECpf ( PessoaVO  pessoaVO ) {
		return pessoaBO . buscaPorNomeECpf (pessoaVO);
	}

	público  int  cadastraPesquisador ( PessoaVO  pessoa ) {
		return pessoaBO . cadastraPesquisador (pessoa);
	}

}