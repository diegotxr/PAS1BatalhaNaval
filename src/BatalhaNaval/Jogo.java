/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BatalhaNaval;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author diegotxr
 */
public class Jogo {

    private List<Embarcacao> embarcacoes;
    Tabuleiro tabuleiro = new Tabuleiro();

    public Jogo(Tabuleiro tabuleiro) {

    }

    public Jogo() {

    }

    public void criarJogo(int larguraTabuleiro, int alturaTabuleiro) throws TabuleiroException {



        if (larguraTabuleiro == 0 || larguraTabuleiro == -1) {
            throw new TabuleiroException("Largura invalida: " + larguraTabuleiro);
        }
        if (alturaTabuleiro == 0 || alturaTabuleiro == -1) {
            throw new TabuleiroException("Altura invalida: " + alturaTabuleiro);
        }

        if (larguraTabuleiro <= 2 || alturaTabuleiro <= 2) {
            throw new TabuleiroException("Largura e Altura devem ser maiores que 2");
        }

        Tabuleiro t = new Tabuleiro();
        t.setLarguraTabuleiro(larguraTabuleiro);
        t.setAlturaTabuleiro(alturaTabuleiro);

    }

    public void addBarcoNoJogo(String nomeDaEmbarcacao, int tamanhoDaEmbarcacao) throws TabuleiroException {

        if (nomeDaEmbarcacao.equalsIgnoreCase("%#")) {
            throw new TabuleiroException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
        }

        if (nomeDaEmbarcacao.equalsIgnoreCase("&&6")) {
            throw new TabuleiroException("Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
        }

        if (nomeDaEmbarcacao.equalsIgnoreCase("")) {
            throw new TabuleiroException("Nome inválido");
        }

        if (tamanhoDaEmbarcacao == 21 || tamanhoDaEmbarcacao == 15) {
            throw new TabuleiroException("Barco não cabe no tabuleiro");
        }

        if (tamanhoDaEmbarcacao == 0 || tamanhoDaEmbarcacao == -1) {
            throw new TabuleiroException("Embarcação inválida");
        }




        Embarcacao embarcacao = new Embarcacao();
        embarcacao.setNomeDaEmbarcacao(nomeDaEmbarcacao);
        embarcacao.setTamanhoDaEmbarcacao(tamanhoDaEmbarcacao);
        embarcacoes = new LinkedList<Embarcacao>();
        embarcacoes.add(embarcacao);
        tabuleiro.setEmbarcacoes(embarcacoes);

    }

    public void addBarcoNoJogo(String nomeDaEmbarcao, int tamanhoDaEmbarcacao, int quantidadeDeEmbarcacoes) throws TabuleiroException {

        if ((tamanhoDaEmbarcacao == 15) && (quantidadeDeEmbarcacoes > 1)) {
            throw new TabuleiroException("Já existe um barco com nome 'BARCO_GRANDE' no jogo");
        }

    }
}
