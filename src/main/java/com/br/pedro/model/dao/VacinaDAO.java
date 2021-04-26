package com.br.pedro.model.dao;



import  java.sql.Connection ;
import  java.sql.PreparedStatement ;
import  java.sql.ResultSet ;
import  java.sql.SQLException ;
import  java.time.LocalDate ;
import  java.util.ArrayList ;
import  java.util.List ;

import  javax.swing.JOptionPane ;

import  com.br.pedro.model.entity.VacinaVO ;
import  com.br.pedro.repository.BaseDAO ;
import  com.br.pedro.repository.Conexao ;

public  class  VacinaDAO  implementa  BaseDAO < VacinaVO > {

	@Sobrepor
	 folheto VacinaVO  público ( VacinaVO vacinaVO ) { 

		String sql =  " INSERT INTO vacina (nome_vacina, id_pessoa_responsavel, pais_origem, "
				+  " quantidade_doses, estagio_pesquisa, inicio_pesquisa, fase_vacina, situacao) "  +  " valores (?,?,?,?,?,?,?,?); " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatementWithPk (conn, sql);) {

			stmt . setString ( 1 , vacinaVO . getNomeVacina ());
			stmt . setInt ( 2 , vacinaVO . getidPessoaResponsavel ());
			stmt . setString ( 3 , vacinaVO . getPaisOrigem ());
			stmt . setInt ( 4 , vacinaVO . getQuantidadeDoses ());
			stmt . setString ( 5 , vacinaVO . getEstagioPesquisa ());
			stmt . setDate ( 6 , java.sql . Date . valueOf (vacinaVO . getDataInicioPesquisa ()));
			stmt . setString ( 7 , vacinaVO . getFaseVacina ());
			stmt . setString ( 8 , vacinaVO . getSituacao ());
			stmt . executeUpdate ();

			ResultSet returnId = stmt . getGeneratedKeys ();
			if (returnId . next ()) {
				vacinaVO . setIdVacina (returnId . getInt ( 1 ));

			}

			JOptionPane . showMessageDialog ( null , " Inclusão efetuada! " );

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao inserir cadastro! \ n "  + e . getMessage ());
		}
		return vacinaVO;
	}

	@Sobrepor
	 atualização booleana  pública ( VacinaVO vacinaVO ) { 

		booleano atualizado =  falso ;
		String sql =  " UPDATE vacina SET nome_vacina =?, Id_pessoa_responsavel =?, Pais_origem =?, Quantidade_doses =? "
				+  " , estagio_pesquisa =?, inicio_pesquisa =?, fase_vacina =? situacao =? WHERE id_vacina =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setString ( 1 , vacinaVO . getNomeVacina ());
			stmt . setInt ( 2 , vacinaVO . getidPessoaResponsavel ());
			stmt . setString ( 3 , vacinaVO . getPaisOrigem ());
			stmt . setInt ( 4 , vacinaVO . getQuantidadeDoses ());
			stmt . setString ( 5 , vacinaVO . getEstagioPesquisa ());
			stmt . setDate ( 6 , java.sql . Date . valueOf (vacinaVO . getDataInicioPesquisa ()));
			stmt . setString ( 7 , vacinaVO . getFaseVacina ());
			stmt . setString ( 8 , vacinaVO . getSituacao ());
			stmt . setInt ( 9 , vacinaVO . getIdVacina ());
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
	public  boolean  delete ( Integer  idVacina ) {

		booleano excluído =  falso ;
		String sql =  " APAGAR DA vacina WHERE id_vacina =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setInt ( 1 , idVacina);
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
	pública  VacinaVO  findById ( Integer  idVacina ) {

		String sql =  " SELECT * FROM vacina WHERE id_vacina =? " ;
		VacinaVO vacina =  novo  VacinaVO ();

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setInt ( 1 , idVacina);

			ResultSet rs = stmt . executeQuery ();
			if (rs . next ()) {

				vacina =  isso . completeResultset (rs);
			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta por ID! \ n "  + e . getMessage ());
		}
		return vacina;
	}

	@Sobrepor
	 Lista  pública < VacinaVO > findAll () {

		String sql =  " SELECT * FROM vacina; " ;
		Lista < VacinaVO > vacinas =  novo  ArrayList <> ();
		VacinaVO vacinaVO =  novo  VacinaVO ();

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			ResultSet rs = stmt . executeQuery ();

			while (rs . next ()) {

				vacinaVO =  isso . completeResultset (rs);
				vacinas . adicionar (vacinaVO);

			}

		} catch ( SQLException e) {
			JOptionPane . showMessageDialog ( null , " Erro ao realizar consulta geral! \ n "  + e . getMessage ());
		}

		voltar vacinas;

	}

	@Sobrepor
	public  VacinaVO  completeResultset ( ResultSet  rs ) throws  SQLException {

		VacinaVO vacinaVO =  novo  VacinaVO ();

		vacinaVO . setIdVacina (rs . getInt ( " id_vacina " ));
		vacinaVO . setNomeVacina (rs . getString ( " nome_vacina " ));
		vacinaVO . setidPessoaResponsavel (rs . getInt ( " id_pessoa_responsavel " ));
		vacinaVO . setPaisOrigem (rs . getString ( " pais_origem " ));
		vacinaVO . setDataInicioPesquisa ( LocalDate . parse (rs . getString ( " inicio_pesquisa " )));
		vacinaVO . setEstagioPesquisa (rs . getString ( " estagio_pesquisa " ));
		vacinaVO . setQuantidadeDoses (rs . getInt ( " quantidade_doses " ));
		vacinaVO . setFaseVacina (rs . getString ( " fase_vacina " ));
		vacinaVO . setSituacao (rs . getString ( " situacao " ));

		return vacinaVO;
	}

	public  boolean  deletaVacinaPorPaisENome ( VacinaVO  vacina ) {
		booleano excluído =  falso ;

		String sql =  " EXCLUIR DA vacina WHERE nome_vacina =? AND pais_origem =?; " ;

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setString ( 1 , vacina . getNomeVacina ());
			stmt . setString ( 2 , vacina . getPaisOrigem ());
			stmt . executeUpdate ();

			excluído =  verdadeiro ;

		} catch ( SQLException e) {
			
			Sistema . para fora . println ( " Não excluiu " + e . getMessage ());
			excluído =  falso ;
		}
		retorno excluído;
	}

	public  VacinaVO  buscaPorPaisENomeVacina ( VacinaVO  vacina ) {

		String sql =  " SELECT * FROM vacina WHERE nome_vacina =? AND pais_origem =?; " ;
		VacinaVO vacinaVO =  novo  VacinaVO ();

		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {

			stmt . setString ( 1 , vacina . getNomeVacina ());
			stmt . setString ( 2 , vacina . getPaisOrigem ());
			ResultSet rs = stmt . executeQuery ();
			
			if (rs . next ()) {
				vacinaVO =  isso . completeResultset (rs);
			}

		} catch ( SQLException e) {
			Sistema . para fora . println ( " Erro ao buscar vacina por país e nome "  + e . getMessage ());
		}
		return vacinaVO;

	}

	public  int  alterarStatusVacina ( VacinaVO  vacina ) {
		int resultado =  0 ;
		String sql =  " ATUALIZAR vacina set situacao =? WHERE nome_vacina =? AND pais_origem =?; " ;
		
		try ( conexão conn =  Conexao . getConnection ();
				PreparedStatement stmt =  Conexao . getPreparedStatement (conn, sql)) {
			stmt . setString ( 1 , vacina . getSituacao ());
			stmt . setString ( 2 , vacina . getNomeVacina ());
			stmt . setString ( 3 , vacina . getPaisOrigem ());
						
			resultado = stmt . executeUpdate ();
			
		} catch ( SQLException e) {
			resultado =  0 ;
			Sistema . para fora . println ( " Erro ao alterar status da vacina "  + e . getMessage ());
		} 
		
		return resultado;
	}

}