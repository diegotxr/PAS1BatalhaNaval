/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BatalhaNaval;

import java.util.List;

/**
 *
 * @author diegotxr
 */
public class Tabuleiro {

    private int larguraTabuleiro;
    private int alturaTabuleiro;
    private int quantidadeDeEmbarcacoes;
    private static final int LARGURA_MINIMA = 3;
    private static final int ALTURA_MINIMA = 3;
    private static final int QUANTIDADE_INCIAL_DE_EMBARCACOES = 0;
    private List<Embarcacao> embarcacoes;

    public Tabuleiro() {
        this.larguraTabuleiro = LARGURA_MINIMA;
        this.alturaTabuleiro = ALTURA_MINIMA;
        this.quantidadeDeEmbarcacoes = QUANTIDADE_INCIAL_DE_EMBARCACOES;
    }

    public int getLarguraTabuleiro() {
        return larguraTabuleiro;
    }

    public void setLarguraTabuleiro(int larguraTabuleiro) {
        this.larguraTabuleiro = larguraTabuleiro;
    }

    public int getAlturaTabuleiro() {
        return alturaTabuleiro;
    }

    public void setAlturaTabuleiro(int alturaTabuleiro) {
        this.alturaTabuleiro = alturaTabuleiro;
    }

    public int getQuantidadeDeEmbarcacoes() {
        return quantidadeDeEmbarcacoes;
    }

    public void setQuantidadeDeEmbarcacoes(int quantidadeDeEmbarcacoes) {
        this.quantidadeDeEmbarcacoes = quantidadeDeEmbarcacoes;
    }

    public int getALTURA_MINIMA() {
        return ALTURA_MINIMA;
    }

    public int getLARGURA_MINIMA() {
        return LARGURA_MINIMA;
    }

    public List<Embarcacao> getEmbarcacoes() {
        return embarcacoes;
    }

    public void setEmbarcacoes(List<Embarcacao> embarcacoes) {
        this.embarcacoes = embarcacoes;
    }
}
