package br.com.glandata.model;

public class Designer extends Funcionario {

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificação do designer");
		return 300;
	}

}