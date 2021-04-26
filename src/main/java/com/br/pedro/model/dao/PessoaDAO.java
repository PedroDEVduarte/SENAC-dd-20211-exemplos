package com.br.pedro.model.dao;


import  java.sql.Connection ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.time.LocalDate ;
import  java.util.ArrayList ;
import  java.util.List ;

import  javax.swing.JOptionPane ;

import  com.br.pedro.model.entity.AplicacaoVacinaVO ;
import  com.br.pedro.model.entity.PessoaVO ;
import  com.br.pedro.repository.BaseDAO ;
import  com.br.pedro.repository.Conexao ;

public  class  PessoaDAO  implementa  BaseDAO < PessoaVO > {

	@Sobrepor
	 inserção pública PessoaVO  ( PessoaVO pessoaVO ) throws SQLException {  

		String sql =  " INSERT INTO pessoa (nome, dataNascimento, sexo, cpf, categoria) valores (?,?,?,?,?); " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatementWithPk (conn, sql);) {

			stmt . setString ( 1 , pessoaVO . getNome ());
			stmt . setDate ( 2 , java.sql . Date . valueOf (pessoaVO . getDataNascimento ()));
			stmt . setString ( 3 , pessoaVO . getSexo ());
			stmt . setString ( 4 , pessoaVO . getCpf ());
			stmt . setString ( 5 , pessoaVO . getCategoria ());

			stmt . executeUpdate ();

			ResultSet returnId = stmt . getGeneratedKeys ();
			if (returnId . next ()) {
				pessoaVO . setIdPessoa (returnId . getInt ( 1 ));
			}

			JOptionPane . showMessageDialog ( null , " Inclusão efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao inserir cadastro! \ n "  + e . getMessage ());

		}
		return pessoaVO;
	}

	@Sobrepor
	 atualização booleana  pública ( PessoaVO pessoaVO ) { 

		booleano atualizado =  falso ;
		String sql =  " ATUALIZAR pessoa SET nome =?, DataNascimento =?, Sexo =?, Cpf =?, Categoria =? WHERE id_pessoa =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatementWithPk (conn, sql);) {
			// stmt.setInt (1, pessoaVO.getVacinacoes ());
			stmt . setString ( 1 , pessoaVO . getNome ());
			stmt . setDate ( 2 , java.sql . Date . valueOf (pessoaVO . getDataNascimento ()));
			stmt . setString ( 3 , pessoaVO . getSexo ());
			stmt . setString ( 4 , pessoaVO . getCpf ());
			stmt . setString ( 5 , pessoaVO . getCategoria ());
			stmt . setInt ( 6 , pessoaVO . getIdPessoa ());
			stmt . executeUpdate ();

			atualizado =  verdadeiro ;
			JOptionPane . showMessageDialog ( null , " Alteração efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao tentar alterar! \ n "  + e . getMessage ());
			atualizado =  falso ;
		}
		retorno atualizado;
	}

	@Sobrepor
	public  boolean  delete ( Integer  idPessoa ) {

		booleano excluído =  falso ;
		String sql =  " EXCLUIR DE pessoa WHERE id_pessoa =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql);) {
			stmt . setInt ( 1 , idPessoa);
			stmt . executeUpdate ();

			excluído =  verdadeiro ;
			JOptionPane . showMessageDialog ( null , " Exclusão efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao tentar excluir! \ n "  + e . getMessage ());
			excluído =  falso ;
		}
		retorno excluído;
	}

	@Sobrepor
	pública  PessoaVO  findById ( Integer  idPessoa ) {

		PessoaVO pessoa =  nulo ;
		String sql =  " SELECT * FROM pessoa WHERE id_pessoa =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql);) {
			stmt . setInt ( 1 , idPessoa);

			ResultSet rs = stmt . executeQuery ();

			if (rs . next ()) {

				pessoa =  isso . completeResultset (rs);
			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta por ID! \ n "  + e . getMessage ());
		}
		return pessoa;
	}

	@Sobrepor
	 Lista  pública < PessoaVO > findAll () {

		Lista < PessoaVO > lista =  nova  ArrayList <> ();
		String sql =  " SELECT * FROM pessoa; " ;
		PessoaVO pessoaVO =  novo  PessoaVO ();

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql);) {
			ResultSet rs = stmt . executeQuery ();
			while (rs . next ()) {

				pessoaVO =  isso . completeResultset (rs);
				lista . adicionar (pessoaVO);
			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta geral! \ n "  + e . getMessage ());
		}
		return lista;
	}

	@Sobrepor
	public  PessoaVO  completeResultset ( ResultSet  rs ) throws  SQLException {

		PessoaVO pessoa =  novo  PessoaVO ();
		pessoa . setIdPessoa (rs . getInt ( " id_pessoa " ));
		pessoa . setNome (rs . getString ( " nome " ));
		pessoa . setCpf (rs . getString ( " cpf " ));
		pessoa . setSexo (rs . getString ( " sexo " ));
		pessoa . setDataNascimento ( LocalDate . parse (rs . getString ( " dataNascimento " )));
		pessoa . setCategoria (rs . getString ( " categoria " ));

		AplicacaoVacinaDAO aplicacaoVacinaDAO =  novo  AplicacaoVacinaDAO ();
		Lista < AplicacaoVacinaVO > lista = aplicacaoVacinaDAO . findByPessoa (pessoa . getIdPessoa ());

		pessoa . setVacinacoes (lista);

		return pessoa;
	}

	public  int  buscaPorNomeECpf ( PessoaVO  pessoaVO ) {
		PessoaVO pessoa =  novo  PessoaVO ();
		int resultado =  0 ;
		String sql =  " SELECT * FROM pessoa WHERE nome =? AND cpf =?; " ;
		
		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			stmt . setString ( 1 , pessoaVO . getNome ());
			stmt . setString ( 2 , pessoaVO . getCpf ());
			ResultSet rs = stmt . executeQuery ();
			
			if (rs . next ()) {
				pessoa =  isso . completeResultset (rs);
				resultado = pessoa . getIdPessoa ();
			}

		} catch ( exceção e) {
			Sistema . para fora . println ( " Erro ao trazer id "  + e . getMessage ());
		}
		if (pessoa . getIdPessoa () == null ) {
			resultado =  0 ;
		}
		 return resultado;
	}

}