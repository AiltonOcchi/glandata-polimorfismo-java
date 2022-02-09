package br.com.glandata.model;

import lombok.Getter;
import lombok.Setter;

public class Funcionario {

	@Getter @Setter
	private String nome;
	
	@Getter @Setter
	private double salario;

	public double getBonificacao() {
		return this.salario * 0.15;
	}
}