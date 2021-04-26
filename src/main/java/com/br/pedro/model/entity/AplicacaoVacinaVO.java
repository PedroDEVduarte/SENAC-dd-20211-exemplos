package com.br.pedro.model.entity;



import  java.time.LocalDate ;

public  class  AplicacaoVacinaVO {

	private  Integer idAplicacaoVacina;
	private  Integer idVacina;
	private  LocalDate dataAplicacao;
	private  Integer idPessoa;
	private  Integer reacao;

	public  AplicacaoVacinaVO ( Integer  idVacina , LocalDate  dataAplicacao , Integer  idPessoa , Integer  reacao ) {
		super ();
		isso . idVacina = idVacina;
		isso . dataAplicacao = dataAplicacao;
		isso . idPessoa = idPessoa;
		isso . reacao = reacao;
	}

	public  AplicacaoVacinaVO () {
		super ();
	}

	public  Integer  getIdAplicacaoVacina () {
		return idAplicacaoVacina;
	}

	public  void  setIdAplicacaoVacina ( Integer  idAplicacaoVacina ) {
		isso . idAplicacaoVacina = idAplicacaoVacina;
	}

	public  Integer  getIdVacina () {
		return idVacina;
	}

	public  void  setIdVacina ( Integer  idVacina ) {
		isso . idVacina = idVacina;
	}

	public  LocalDate  getDataAplicacao () {
		return dataAplicacao;
	}

	public  void  setDataAplicacao ( LocalDate  dataAplicacao ) {
		isso . dataAplicacao = dataAplicacao;
	}

	public  Integer  getidPessoa () {
		return idPessoa;
	}

	public  void  setidPessoa ( Integer  iPessoa ) {
		isso . idPessoa = iPessoa;
	}

	public  Integer  getReacao () {
		retorno reacao;
	}

	public  void  setReacao ( Integer  reacao ) {
		isso . reacao = reacao;
	}

	@Sobrepor
	public  String  toString () {
		retornar  " AplicacaoVacinaVO [ \ n idAplicacaoVacina = "  + idAplicacaoVacina +  " \ n , idVacina = "  + idVacina
				+  " \ n , dataAplicacao = "  + dataAplicacao +  " \ n , idPessoa = "  + idPessoa +  " \ n , reacao = "  + reacao
				+  " \ n ] " ;
	}
}
	