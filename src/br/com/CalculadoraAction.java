package br.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

public class CalculadoraAction extends Action{

	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		CalculadoraForm calculadoraForm = (CalculadoraForm) form;
		Double resultado;
		if(calculadoraForm.getAcao().equals("somar")) {
			resultado = calculadoraForm.getValorA()+calculadoraForm.getValorB();
			System.out.println("entrou em somar");
		}else {
			System.out.println("entrou em subtrair");
			resultado = calculadoraForm.getValorA()-calculadoraForm.getValorB();
		}

		request.setAttribute("resultado", resultado);
		return mapping.findForward("calculadora");
	}
}
