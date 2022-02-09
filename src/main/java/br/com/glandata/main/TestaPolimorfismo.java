package br.com.glandata.main;
import br.com.glandata.model.Designer;
import br.com.glandata.model.EditorVideo;
import br.com.glandata.model.Gerente;
import br.com.glandata.service.ControleBonificacao;

public class TestaPolimorfismo {

    public static void main(String[] args) {

        Gerente gerente = new Gerente();
        gerente.setNome("Douglas");
        gerente.setSalario(5000.0);
        System.out.println("Autenticou? "+gerente.autentica(123456));

        EditorVideo editorVideo = new EditorVideo();
        gerente.setNome("Ailton");
        editorVideo.setSalario(2500.0);

        Designer designer = new Designer();
        gerente.setNome("Sandra");
        designer.setSalario(2000.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(gerente);
        controle.registra(editorVideo);
        controle.registra(designer);

        System.out.println(controle.getSoma());

    }

}