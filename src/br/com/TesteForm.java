package br.com;

import org.apache.struts.action.ActionForm;

public class TesteForm extends ActionForm {
	
	private String nome = "";

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
