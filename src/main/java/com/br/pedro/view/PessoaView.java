package com.br.pedro.view;


import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;

import  javax.swing.JOptionPane ;

import  com.br.pedro.controller.PessoaController ;
import  com.br.pedro.model.entity.PessoaVO ;
import  com.br.pedro.repository.Constants ;

public  class  PessoaView {

	PessoaVO pessoa =  novo  PessoaVO ();
	PessoaController pessoaController =  novo  PessoaController ();
	static  DateTimeFormatter dataFormatter =  DateTimeFormatter . ofPattern ( " dd / MM / aaaa " );

	público  int  cadastraPessoa ( PessoaVO  pessoaVO ) {
		pessoa . setNome (pessoaVO . getNome ());		
		pessoa . setCpf (pessoaVO . getCpf ());
		
		if (pessoa . getNome () ==  null ) {
			pessoa . setNome (
					JOptionPane . showInputDialog ( null , " Digite o nome " , JOptionPane . QUESTION_MESSAGE ));			
		}
		
		if (pessoa . getCpf () ==  null ) {
			pessoa . setCpf (
					JOptionPane . showInputDialog ( null , " Digite o CPF " , JOptionPane . QUESTION_MESSAGE ));
		}
		
		pessoa . setSexo (
				JOptionPane . showInputDialog ( null , " Digite o sexo " , JOptionPane . QUESTION_MESSAGE ));

		String [] categorias = { " ESCOLHA UMA OPÇÃO " , Constantes . FASE_PESQUISADORES , Constantes . FASE_VOLUNTARIOS ,
				Constantes . FASE_PUBLICO_GERAL };
		String opcaoEscolhida = ( String ) JOptionPane . showInputDialog ( null , null , " CATEGORIA " ,
				JOptionPane . QUESTION_MESSAGE , nulo , categorias, categorias [ 0 ]);
		pessoa . setCategoria (opcaoEscolhida);
		
		LocalDate dataNascimento = ( LocalDate . Parse ( JOptionPane . ShowInputDialog ( null ,
				" Digite a data de nascimento " , JOptionPane . QUESTION_MESSAGE ), dataFormatter));
		pessoa . setDataNascimento (dataNascimento);

		int retorno = pessoaController . cadastraPesquisador (pessoa);

		return retorno;
	}

}