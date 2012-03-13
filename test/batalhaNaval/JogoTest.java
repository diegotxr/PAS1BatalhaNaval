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
public class JogoTest {

    Tabuleiro tabuleiro = new Tabuleiro();
    Jogo jogo = new Jogo();

    @Test
    public void addBarcoNoJogo() throws TabuleiroException {
        try{
            jogo.addBarcoNoJogo("%#", 3);
            fail("Teste");
        }catch(TabuleiroException e){
            assertEquals(e.getMessage(),"Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
        }

        try{
            jogo.addBarcoNoJogo("%#6", 3);
            fail("Teste");
        }catch(TabuleiroException e){
            assertEquals(e.getMessage(),"Nome deve conter apenas os seguintes caracteres (A..Z), (0..9) e (_-.)");
        }

        try{
            jogo.addBarcoNoJogo("", 3);
            fail("Teste");
        }catch(TabuleiroException e){
            assertEquals(e.getMessage(), "Nome invalido ''");
        }
        }
}

