/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package batalhaNaval;

import BatalhaNaval.Jogo;
import BatalhaNaval.Tabuleiro;
import BatalhaNaval.TabuleiroException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author diegotxr
 */
public class TabuleiroTest {

    Tabuleiro tabuleiro = new Tabuleiro();
    Jogo jogo = new Jogo(tabuleiro);

    @Test
    public void criarJogo() throws TabuleiroException {
        jogo.criarJogo(20, 10);

        assertEquals(10, tabuleiro.getAlturaTabuleiro());
        assertEquals(20, tabuleiro.getLarguraTabuleiro());


        try {
            jogo.criarJogo(2, 3);
            fail("");
        } catch (TabuleiroException e) {
            assertEquals("Largura e Altura devem ser maiores que 2", e.getMessage());
        }

        try {
            jogo.criarJogo(3, 2);
            fail("");
        } catch (TabuleiroException e) {
            assertEquals("Largura e Altura devem ser maiores que 2", e.getMessage());
        }

        try {
            jogo.criarJogo(-1, 15);
            fail("");
        } catch (TabuleiroException e) {
            assertEquals("Largura invalida: -1", e.getMessage());
        }

        try {
            jogo.criarJogo(0, 15);
            fail("");
        } catch (TabuleiroException e) {
            assertEquals("Largura invalida: 0", e.getMessage());
        }

        try {
            jogo.criarJogo(-1, -1);
            fail("");
        } catch (TabuleiroException e) {
            assertEquals("Largura invalida: -1", e.getMessage());
        }

    }
}
