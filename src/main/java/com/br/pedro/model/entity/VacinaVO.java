package com.br.pedro.model.entity;

import  java.time.LocalDate ;

public  class  VacinaVO {

	private  Integer idVacina;
	private  String nomeVacina;
	private  int idPessoaResponsavel;	
	private  String paisOrigem;
	private  int quantidadeDoses;
	private  String estagioPesquisa;
	privado  LocalDate dataInicioPesquisa;
	privada  de Cordas faseVacina;
	particular  String situacao;

	
	public  VacinaVO ( String  nomeVacina , int  idPessoaResponsavel , String  paisOrigem , int  quantidadeDoses ,
			String  estagioPesquisa , LocalDate  dataInicioPesquisa , String  faseVacina , String  situacao ) {
		super ();
		isso . nomeVacina = nomeVacina;
		isso . idPessoaResponsavel = idPessoaResponsavel;
		isso . paisOrigem = paisOrigem;
		isso . quantidadeDoses = quantidadeDoses;
		isso . estagioPesquisa = estagioPesquisa;
		isso . dataInicioPesquisa = dataInicioPesquisa;
		isso . faseVacina = faseVacina;
		isso . situacao = situacao;
	}
	
	 VacinaVO público () {
 
	}

	public  Integer  getIdVacina () {
		return idVacina;
	}

	public  void  setIdVacina ( Integer  idVacina ) {
		isso . idVacina = idVacina;
	}

	public  String  getNomeVacina () {
		return nomeVacina;
	}

	public  void  setNomeVacina ( String  nomeVacina ) {
		isso . nomeVacina = nomeVacina;
	}

	public  int  getidPessoaResponsavel () {
		return idPessoaResponsavel;
	}

	public  void  setidPessoaResponsavel ( int  idPessoaResponsavel ) {
		isso . idPessoaResponsavel = idPessoaResponsavel;
	}

	public  String  getPaisOrigem () {
		return paisOrigem;
	}

	public  void  setPaisOrigem ( String  paisOrigem ) {
		isso . paisOrigem = paisOrigem;
	}

	public  int  getQuantidadeDoses () {
		return quantidadeDoses;
	}

	public  void  setQuantidadeDoses ( int  quantidadeDoses ) {
		isso . quantidadeDoses = quantidadeDoses;
	}

	public  String  getEstagioPesquisa () {
		retornar estagioPesquisa;
	}

	public  void  setEstagioPesquisa ( String  estagioPesquisa ) {
		isso . estagioPesquisa = estagioPesquisa;
	}

	public  LocalDate  getDataInicioPesquisa () {
		return dataInicioPesquisa;
	}

	public  void  setDataInicioPesquisa ( LocalDate  dataInicioPesquisa ) {
		isso . dataInicioPesquisa = dataInicioPesquisa;
	}

	public  String  getFaseVacina () {
		retorno da faseVacina;
	}

	public  void  setFaseVacina ( String  faseVacina ) {
		isso . faseVacina = faseVacina;
	}
	
	public  String  getSituacao () {
		return situacao;
	}

	public  void  setSituacao ( String  situacao ) {
		isso . situacao = situacao;
	}
	
}