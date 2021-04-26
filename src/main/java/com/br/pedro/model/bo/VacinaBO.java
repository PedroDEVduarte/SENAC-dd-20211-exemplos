package com.br.pedro.model.bo;


import  java.sql.SQLException ;

import  com.br.pedro.model.dao.PessoaDAO ;
import  com.br.pedro.model.entity.PessoaVO ;

public  class  PessoaBO {
	
	PessoaDAO pessoaDAO =   novo  PessoaDAO ();
	PessoaVO pessoaVO =  novo  PessoaVO ();

	public  int  buscaPorNomeECpf ( PessoaVO  pessoaVO ) {
		int idPesquisador = pessoaDAO . buscaPorNomeECpf (pessoaVO);
		
		if (idPesquisador ! =  0 ) {
			return idPesquisador;
		} else {
			return  0 ;
		}		
		
	}

	público  int  cadastraPesquisador ( PessoaVO  pessoa ) {
		int retorno =  0 ;
		tente {
			pessoaVO = pessoaDAO . inserir (pessoa);
			if (pessoaVO . getIdPessoa () ! =  0 ) {
				retorno =   pessoaVO . getIdPessoa ();				
			} else {
				retorno =  0 ;
			}
		} catch ( SQLException e) {	
			retorno =  0 ;
			e . printStackTrace ();
		}			
		return   retorno;
	}
}
