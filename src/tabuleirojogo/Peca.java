/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuleirojogo;

/**
 *
 * @author Alkanet
 */
public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;
    
    public Peca(Tabuleiro tabuleiro){
        this.tabuleiro=tabuleiro;
        posicao=null;
    }

    /**
     * @return the tabuleiro
     */
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    
}
