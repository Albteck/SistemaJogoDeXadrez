/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleirojogo.Peca;
import tabuleirojogo.Tabuleiro;

/**
 *
 * @author Alkanet
 */
public class PecasXadrez extends Peca{
    
    private Color color;
    
    public PecasXadrez(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro);
        this.color=color;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }
    
}
