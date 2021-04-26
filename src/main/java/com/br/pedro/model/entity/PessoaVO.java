package com.br.pedro.model.entity;


import  java.time.LocalDate ;
import  java.time.format.DateTimeFormatter ;
import  java.util.List ;

public  class  PessoaVO {

	private  Integer idPessoa;
	private  String nome;
	private  LocalDate dataNascimento;
	 sexo String privado ;
	private  String cpf;
	 categoria String privada ;
	 Lista privada < AplicacaoVacinaVO > vacinas;

	public  PessoaVO ( String  nome , LocalDate  dataNascimento , String  sexo , String  cpf , String  categoria ,
			Listar < AplicacaoVacinaVO >  vacinas ) {
		super ();
		isso . nome = nome;
		isso . dataNascimento = dataNascimento;
		isso . sexo = sexo;
		isso . cpf = cpf;
		isso . categoria = categoria;
		isso . vacinas = vacinas;
	}

	public  PessoaVO () {
		super ();
	}

	public  Integer  getIdPessoa () {
		return idPessoa;
	}

	public  void  setIdPessoa ( Integer  idPessoa ) {
		isso . idPessoa = idPessoa;
	}

	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		isso . nome = nome;
	}

	public  LocalDate  getDataNascimento () {
		return dataNascimento;
	}

	public  void  setDataNascimento ( LocalDate  dataNascimento ) {
		isso . dataNascimento = dataNascimento;
	}

	public  String  getSexo () {
		retorno sexo;
	}

	public  void  setSexo ( String  sexo ) {
		isso . sexo = sexo;
	}

	public  String  getCpf () {
		return cpf;
	}

	public  void  setCpf ( String  cpf ) {
		isso . cpf = cpf;
	}

	public  String  getCategoria () {
		voltar categoria;
	}

	public  void  setCategoria ( String  categoria ) {
		isso . categoria = categoria;
	}

	 Lista  pública < AplicacaoVacinaVO > getVacinacoes () {
		voltar vacinas;
	}

	public  void  setVacinacoes ( List < AplicacaoVacinaVO >  vacinacoes ) {
		isso . vacinas = vacinas;
	}

	static  DateTimeFormatter dataFormatter =  DateTimeFormatter . ofPattern ( " dd / MM / aaaa " );

	@Sobrepor
	public  String  toString () {
		return  " PessoaVO [ \ n idPessoa = "  + idPessoa +  " \ n , nome = "  + nome +  " \ n , dataNascimento = "
				+ dataFormatter . formato (dataNascimento) +  " \ n , sexo = "  + sexo +  " \ n , cpf = "  + cpf +  " \ n , categoria = "
				+ categoria +  " \ n , vacinas = "  + vacinas +  " \ n ] " ;
	}
}