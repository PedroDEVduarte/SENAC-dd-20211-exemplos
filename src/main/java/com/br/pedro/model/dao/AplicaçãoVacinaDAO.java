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
import  com.br.pedro.repository.BaseDAO ;
import  com.br.pedro.repository.Conexao ;

public  class  AplicacaoVacinaDAO  implementa  BaseDAO < AplicacaoVacinaVO > {

	@Sobrepor
	 inser��o p�blica AplicacaoVacinaVO  ( AplicacaoVacinaVO aplicacaoVacinaVO ) { 

		String sql =  " INSERT INTO aplicacao_vacina (id_vacina, id_pessoa, reacao, data_aplicacao) valores (?,?,?,?); " ;

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatementWithPk (conn, sql);) {

			stmt . setInt ( 1 , aplicacaoVacinaVO . getIdVacina ());
			stmt . setInt ( 2 , aplicacaoVacinaVO . getidPessoa ());
			stmt . setInt ( 3 , aplicacaoVacinaVO . getReacao ());
			stmt . setDate ( 4 , java.sql . Date . valueOf (aplicacaoVacinaVO . getDataAplicacao ()));

			stmt . executeUpdate ();

			ResultSet returnId = stmt . getGeneratedKeys ();

			if (returnId . next ()) {
				aplicacaoVacinaVO . setIdAplicacaoVacina (returnId . getInt ( 1 ));

			}
			JOptionPane . showMessageDialog ( null , " Inclus�o efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao inserir cadastro! \ n "  + e . getMessage ());
		}
		return aplicacaoVacinaVO;
	}

	@Sobrepor
	 atualiza��o booleana  p�blica ( AplicacaoVacinaVO aplicacaoVacinaVO ) { 

		booleano atualizado =  falso ;
		String sql =  " ATUALIZAR aplicacao_vacina SET id_vacina =?, Id_pessoa =?, Reacao =?, Data_aplicacao =? "
				+  " WHERE id_aplicacao_vacina =?; " ;

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setInt ( 1 , aplicacaoVacinaVO . getIdVacina ());
			stmt . setInt ( 2 , aplicacaoVacinaVO . getidPessoa ());
			stmt . setInt ( 3 , aplicacaoVacinaVO . getReacao ());
			stmt . setDate ( 4 , java.sql . Date . valueOf (aplicacaoVacinaVO . getDataAplicacao ()));
			stmt . setInt ( 5 , aplicacaoVacinaVO . getIdAplicacaoVacina ());
			stmt . executeUpdate ();

			atualizado =  verdadeiro ;
			JOptionPane . showMessageDialog ( null , " Altera��o efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao tentar alterar! \ n "  + e . getMessage ());
			atualizado =  falso ;
		}
		retorno atualizado;

	}

	@Sobrepor
	public  boolean  delete ( Integer  idAplicacaoVacina ) {

		booleano exclu�do =  falso ;
		String sql =  " EXCLUIR DE aplicacao_vacina WHERE id_aplicacao_vacina =?; " ;

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setInt ( 1 , idAplicacaoVacina);
			stmt . executeUpdate ();

			exclu�do =  verdadeiro ;
			JOptionPane . showMessageDialog ( null , " Exclus�o efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao tentar excluir! \ n "  + e . getMessage ());
			exclu�do =  falso ;
		}
		retorno exclu�do;
	}

	@Sobrepor
	p�blica  AplicacaoVacinaVO  findById ( Integer  idaplicacaoVacinaVO ) {

		AplicacaoVacinaVO aplicacao =  novo  AplicacaoVacinaVO ();

		String sql =  " SELECT * FROM aplicacao_vacina WHERE id_aplicacao_vacina =?; " ;

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			stmt . setInt ( 1 , idaplicacaoVacinaVO);
			ResultSet rs = stmt . executeQuery ();

			if (rs . next ()) {

				aplicacao =  isso . completeResultset (rs);
			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta por ID! \ n "  + e . getMessage ());
		}
		return aplicacao;

	}

	@Sobrepor
	 Lista  p�blica < AplicacaoVacinaVO > findAll () {

		String sql =  " SELECT * FROM aplicacao_vacina; " ;
		Lista < AplicacaoVacinaVO > aplicacoes =  new  ArrayList <> ();
		AplicacaoVacinaVO aplicacaoVacina =  novo  AplicacaoVacinaVO ();

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			ResultSet rs = stmt . executeQuery ();

			while (rs . next ()) {

				aplicacaoVacina =  isso . completeResultset (rs);
				aplicacoes . adicionar (aplicacaoVacina);

			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta geral! \ n "  + e . getMessage ());
		}
		retornar aplicacoes;

	}

	@Sobrepor
	public  AplicacaoVacinaVO  completeResultset ( ResultSet  rs ) throws  SQLException {

		AplicacaoVacinaVO aplicacaoVacinaVO =  novo  AplicacaoVacinaVO ();
		aplicacaoVacinaVO . setIdAplicacaoVacina (rs . getInt ( " id_aplicacao_vacina " ));
		aplicacaoVacinaVO . setIdVacina (rs . getInt ( " id_vacina " ));
		aplicacaoVacinaVO . setidPessoa (rs . getInt ( " id_pessoa " ));
		aplicacaoVacinaVO . setReacao (rs . getInt ( " reacao " ));
		aplicacaoVacinaVO . setDataAplicacao ( LocalDate . parse (rs . getString ( " data_aplicacao " )));

		return aplicacaoVacinaVO;
	}

	 Lista  p�blica < AplicacaoVacinaVO > findByPessoa ( Integer  idPessoa ) {

		Lista < AplicacaoVacinaVO > aplicacoes =  new  ArrayList <> ();
		AplicacaoVacinaVO aplicacaoVacina =  novo  AplicacaoVacinaVO ();
		String sql =  " SELECT * FROM aplicacao_vacina WHERE id_pessoa =?; " ;

		try ( conex�o conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			stmt . setInt ( 1 , idPessoa);
			ResultSet rs = stmt . executeQuery ();

			while (rs . next ()) {

				aplicacaoVacina =  isso . completeResultset (rs);
				aplicacoes . adicionar (aplicacaoVacina);

			}

		} catch ( exce��o e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta por pessoa! \ n "  + e . getMessage ());
		}

		retornar aplicacoes;

	}

}