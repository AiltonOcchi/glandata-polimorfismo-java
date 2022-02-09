package br.com.glandata.model;

public class Gerente extends Funcionario {

	private int senha = 123456;

	@Override
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}