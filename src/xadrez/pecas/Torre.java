/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez.pecas;

import tabuleirojogo.Tabuleiro;
import xadrez.Color;
import xadrez.PecasXadrez;

/**
 *
 * @author Alkanet
 */
public class Torre extends PecasXadrez{
    
    public Torre(Tabuleiro tabuleiro, Color color) {
        super(tabuleiro, color);
    }
    @Override
    public String toString(){
        return "T";
    }
    
}
