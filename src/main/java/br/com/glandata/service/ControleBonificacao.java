package br.com.glandata.service;

import br.com.glandata.model.Funcionario;
import lombok.Getter;

public class ControleBonificacao {

    @Getter
	private double soma;

    public void registra(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;
    }
    
    //Metodos nao mais necessarios por conta do polimorfismo da classe funcionario
    /*
    public void registra(Gerente g) {
        double boni = g.getBonificacao();
        this.soma = this.soma + boni;
    }
    
    public void registra(EditorVideo e) {
        double boni = e.getBonificacao();
        this.soma = this.soma + boni;
    }
    
    public void registra(Designer d) {
        double boni = d.getBonificacao();
        this.soma = this.soma + boni;
    }
    */

}