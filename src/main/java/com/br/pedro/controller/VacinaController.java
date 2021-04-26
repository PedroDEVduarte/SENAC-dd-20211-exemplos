
package com.br.pedro.controller;


import  java.util.List ;

import  com.br.pedro.model.bo.VacinaBO ;
import  com.br.pedro.model.entity.VacinaVO ;

public  class  VacinaController {
	
	VacinaBO vacinaBO =  novo  VacinaBO ();

	 Lista  pública < VacinaVO > findAll () {		
		return vacinaBO . encontrar tudo();
	}

	public  int  alterarStatusVacina ( VacinaVO  vacina ) {		
		return vacinaBO . alterarStatusVacina (vacina);
	}

	public  String  cadastraVacina ( VacinaVO  vacina ) {		
		return vacinaBO . cadastraVacina (vacina);
	}


}