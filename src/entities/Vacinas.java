package entities;

import java.util.Date;

public class Vacinas {

	
	private String paisOrigem;
	private String estagioPesquisa;
	private String responvavel;
	private Date dataInicioPesquisa;
	private int fase;
	private int quantidadeDoses;
	public Vacinas(String paisOrigem, String estagioPesquisa, String responvavel, Date dataInicioPesquisa, int fase,
			int quantidadeDoses) {
		super();
		this.paisOrigem = paisOrigem;
		this.estagioPesquisa = estagioPesquisa;
		this.responvavel = responvavel;
		this.dataInicioPesquisa = dataInicioPesquisa;
		this.fase = fase;
		this.quantidadeDoses = quantidadeDoses;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public String getEstagioPesquisa() {
		return estagioPesquisa;
	}
	public void setEstagioPesquisa(String estagioPesquisa) {
		this.estagioPesquisa = estagioPesquisa;
	}
	public String getResponvavel() {
		return responvavel;
	}
	public void setResponvavel(String responvavel) {
		this.responvavel = responvavel;
	}
	public Date getDataInicioPesquisa() {
		return dataInicioPesquisa;
	}
	public void setDataInicioPesquisa(Date dataInicioPesquisa) {
		this.dataInicioPesquisa = dataInicioPesquisa;
	}
	public int getFase() {
		return fase;
	}
	public void setFase(int fase) {
		this.fase = fase;
	}
	public int getQuantidadeDoses() {
		return quantidadeDoses;
	}
	public void setQuantidadeDoses(int quantidadeDoses) {
		this.quantidadeDoses = quantidadeDoses;
	}
	
}
