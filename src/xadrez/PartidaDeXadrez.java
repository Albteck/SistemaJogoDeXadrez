/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleirojogo.Posicao;
import tabuleirojogo.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/**
 *
 * @author Alkanet
 */
public class PartidaDeXadrez {
    private Tabuleiro tabuleiro;
    
    public PartidaDeXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
        IniciarConfiguracao();
    }
    public PecasXadrez[][]getPecas(){
        PecasXadrez[][] mat = new PecasXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for(int i = 0; i<tabuleiro.getLinhas();i++){
            for(int j = 0;j<tabuleiro.getColunas();j++){
                mat[i][j]=(PecasXadrez)tabuleiro.pecas(i, j);
            }
        }
        return mat;
    }
    private void IniciarConfiguracao(){
        tabuleiro.ColocarPeca(new Torre(tabuleiro, Color.BRANCO), new Posicao(2,1));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Color.PRETO), new Posicao(0,4));
        tabuleiro.ColocarPeca(new Rei(tabuleiro, Color.BRANCO), new Posicao(7,4));
    }
    
}
