package br.com;

import org.apache.struts.action.ActionForm;

public class CalculadoraForm extends ActionForm {
	
	private Double valorA;
	private Double valorB;
	private String acao = "";
	
	
	public String getAcao() {
		return acao;
	}
	public void setAcao(String acao) {
		this.acao = acao;
	}
	public Double getValorA() {
		return valorA;
	}
	public void setValorA(Double valorA) {
		this.valorA = valorA;
	}
	public Double getValorB() {
		return valorB;
	}
	public void setValorB(Double valorB) {
		this.valorB = valorB;
	}
	
}
