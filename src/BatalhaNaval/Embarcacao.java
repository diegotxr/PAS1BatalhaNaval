/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BatalhaNaval;

/**
 *
 * @author diegotxr
 */
public class Embarcacao {

    private String nomeDaEmbarcacao;
    private int tamanhoDaEmbarcacao;

    public Embarcacao(String nomeDaEmbarcacao, int tamanhoDaEmbarcacao) {
        this.nomeDaEmbarcacao = nomeDaEmbarcacao;
        this.tamanhoDaEmbarcacao = tamanhoDaEmbarcacao;
    }

    public Embarcacao() {
    }

    public String getNomeDaEmbarcacao() {
        return this.nomeDaEmbarcacao;
    }

    public void setNomeDaEmbarcacao(String nomeDaEmbarcacao) {
        this.nomeDaEmbarcacao = nomeDaEmbarcacao;
    }

    public int getTamanhoDaEmbarcacao() {
        return this.tamanhoDaEmbarcacao;
    }

    public void setTamanhoDaEmbarcacao(int tamanhoDaEmbarcacao) {
        this.tamanhoDaEmbarcacao = tamanhoDaEmbarcacao;
    }
}
