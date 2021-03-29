package entities;

import java.util.Date;

public class aplicacaoVacina extends Pessoas{

	
			private Date dataAplicacao;
			private int nota;
			private Vacinas vacina;
			public aplicacaoVacina(String nome, Date dataNascimento, char sexo, String cPF, int tipo,
					Date dataAplicacao, int nota, Vacinas vacina) {
				super(nome, dataNascimento, sexo, cPF, tipo);
				this.dataAplicacao = dataAplicacao;
				this.nota = nota;
				this.vacina = vacina;
			}
			public Date getDataAplicacao() {
				return dataAplicacao;
			}
			public void setDataAplicacao(Date dataAplicacao) {
				this.dataAplicacao = dataAplicacao;
			}
			public int getNota() {
				return nota;
			}
			public void setNota(int nota) {
				this.nota = nota;
			}
			public Vacinas getVacina() {
				return vacina;
			}
			public void setVacina(Vacinas vacina) {
				this.vacina = vacina;
			}
			
			
}
