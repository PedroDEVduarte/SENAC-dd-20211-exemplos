package com.br.pedro.view;


import  java.sql.SQLException ;
import  java.text.ParseException ;
import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;
import  java.util.ArrayList ;
import  java.util.List ;

import  javax.swing.JOptionPane ;

import  com.br.pedro.model.dao.AplicacaoVacinaDAO ;
import  com.br.pedro.model.dao.PessoaDAO ;
import  com.br.pedro.model.dao.VacinaDAO ;
import  com.br.pedro.model.entity.AplicacaoVacinaVO ;
import  com.br.pedro.model.entity.PessoaVO ;
import  com.br.pedro.model.entity.VacinaVO ;
import  com.br.pedro.repository.Constants ;

public  class  Principal {
	
	static  DateTimeFormatter dataFormatter =  DateTimeFormatter . ofPattern ( " dd / MM / aaaa " );

	public  static  void  main ( String [] args ) throws  ParseException {

		
		// ========================= Inclui ======================== =======================		
		
	
// 		PessoaVO pessoaVO = novo PessoaVO ();
// 		pessoaVO.setNome ("joão");
// 		pessoaVO.setDataNascimento (LocalDate.parse ("30/02/1970", dataFormatter));
// 		pessoaVO.setCpf ("012");
// 		pessoaVO.setSexo ("masculino");
// 		pessoaVO.setCategoria (Constants.FASE_PUBLICO_GERAL);
//		
// 		PessoaDAO pessoaDAO = novo PessoaDAO ();		
// 		tente {
// 			pessoaDAO.insert (pessoaVO);
// 		} catch (SQLException e) {
// 			JOptionPane.showMessageDialog (null, "Erro no executável!");
// 			e.printStackTrace ();
// 		}
		
		// ======================== Altera =========================== ========================
//		
// 		PessoaVO pessoaVO = novo PessoaVO ();
// 		PessoaDAO pessoaDAO = novo PessoaDAO ();
// 		pessoaVO.setIdPessoa (3);
// 		pessoaVO.setNome ("Pedro");
// 		pessoaVO.setDataNascimento (LocalDate.parse ("12/12/1990", dataFormatter));
// 		pessoaVO.setCpf ("123");
// 		pessoaVO.setSexo ("feminino");
// 		pessoaVO.setCategoria (Constants.FASE_PESQUISADORES);
//		
// 		pessoaDAO.update (pessoaVO);
		
		// =================== Deleta ============================== ================
		
// 		PessoaDAO pessoaDAO = novo PessoaDAO ();
//				
// 		pessoaDAO.delete (3);
		
		
		// =================== Busca por ID ============================ ==================
		
// 		PessoaDAO pessoaDAO = novo PessoaDAO ();
// 		PessoaVO pessoa;
//		
// 		pessoa = pessoaDAO.findById (3);
//		
// 		System.out.println (pessoa.toString ());
		
		
		// ==================== Busca Todos ============================ ===========================
		
// 		PessoaDAO pessoaDAO = novo PessoaDAO ();
//		
// 		Lista <PessoaVO> ListaPessoa = pessoaDAO.findAll ();
//		
// 		para (PessoaVO pessoaVO: ListaPessoa) {
// 			System.out.println ("\ n" + pessoaVO.toString ());
//			
// 		}
		
		
// 		====================================================== ========================================================== =
// 		====================================================== ========================================================== =
// 		====================================================== ========================================================== =
// 		====================================================== ========================================================== =
		
// 		VacinaDAO dao = new VacinaDAO ();
// 		VacinaVO vacinaVO = novo VacinaVO ();
//		
// 		vacinaVO.setNomeVacina ("Vacina000");
// 		vacinaVO.setEstagioPesquisa ("testes000");
// 		vacinaVO.setResponsavelPesquisa ("João000");
// 		vacinaVO.setDataInicioPesquisa (LocalDate.parse ("22/02/2012", dataFormatter));
// 		vacinaVO.setFaseVacina ("testes1");
// 		vacinaVO.setPaisOrigem ("EUA");
// 		vacinaVO.setQuantidadeDoses (1); //		
// 		dao.insert (vacinaVO);
		
		
		
// 		vacinaVO.setIdVacina (3);
// 		vacinaVO.setNomeVacina ("Sputnik");
// 		vacinaVO.setEstagioPesquisa ("testes2");
// 		vacinaVO.setResponsavelPesquisa ("jose123");
// 		vacinaVO.setDataInicioPesquisa (LocalDate.parse ("25/10/2020", dataFormatter));
// 		vacinaVO.setFaseVacina ("testes2");
// 		vacinaVO.setPaisOrigem ("EUA");
// 		vacinaVO.setQuantidadeDoses (3);
// 		dao.update (vacinaVO);
		
		
// 		dao.delete (4);
		
		
		
// 		vacinaVO = dao.findById (4);		
// 		System.out.println (vacinaVO.toString ());
		
		
		
// 		Lista <VacinaVO> lista = new ArrayList <> ();
// 		lista = dao.findAll ();
//		
// 		para (VacinaVO vacina: lista) {						
// 			System.out.println ("\ n" + vacina.toString ());
// 		}
		
		
// 		AplicacaoVacinaVO aplicacaoVacinaVO = novo AplicacaoVacinaVO ();
// 		AplicacaoVacinaDAO aplicacaoVacinaDAO = new AplicacaoVacinaDAO ();
//		
// 		aplicacaoVacinaVO.setIdVacina (2);
// 		aplicacaoVacinaVO.setidPessoa (2);
// 		aplicacaoVacinaVO.setReacao (Constants.REACAO_OTIMA);
// 		aplicacaoVacinaVO.setDataAplicacao (LocalDate.parse ("22/02/2012", dataFormatter));
// 		aplicacaoVacinaDAO.insert (aplicacaoVacinaVO);
		
		
// 		AplicacaoVacinaVO aplicacaoVacinaVO = novo AplicacaoVacinaVO ();
// 		AplicacaoVacinaDAO aplicacaoVacinaDAO = new AplicacaoVacinaDAO ();
//		
// 		aplicacaoVacinaVO.setIdVacina (1);
// 		aplicacaoVacinaVO.setidPessoa (1);
// 		aplicacaoVacinaVO.setReacao (Constants.REACAO_PESSIMA);
// 		aplicacaoVacinaVO.setDataAplicacao (LocalDate.parse ("22/02/2019", dataFormatter));
// 		aplicacaoVacinaVO.setIdAplicacaoVacina (2);
//		
// 		aplicacaoVacinaDAO.update (aplicacaoVacinaVO);
		
		
		
// 		AplicacaoVacinaDAO aplicacaoVacinaDAO = new AplicacaoVacinaDAO ();		
// 		aplicacaoVacinaDAO.delete (3);
		
		
// 		AplicacaoVacinaVO aplicacaoVacinaVO = novo AplicacaoVacinaVO ();
// 		AplicacaoVacinaDAO aplicacaoVacinaDAO = new AplicacaoVacinaDAO ();
		
		
// 		System.out.println (aplicacaoVacinaDAO.findById (2) .toString ());
		
// 		Lista <AplicacaoVacinaVO> lista = new ArrayList <> ();
// 		lista = aplicacaoVacinaDAO.findAll ();
// 		para (AplicacaoVacinaVO aplicacao: lista) {
//			
// 			System.out.println ("\ n" + aplicacao.toString ());
		
		
		
		
// 		VacinaDAO dao = new VacinaDAO ();
// 		VacinaVO vo = new VacinaVO ();
//		
// 		vo.setNomeVacina ("Vacina444");
// 		vo.setPaisOrigem ("Estônia444");	
//		
// 		int retorno = dao.findIdForPaisAndNomeVacina (vo);
//		
// 		System.out.println (retorno);
			
		}
	
		
		
	
	}
