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
    private void colocarNovaPeca(char coluna, int peca, PecasXadrez pecas){
        tabuleiro.ColocarPeca(pecas, new XadrezPosicao(coluna, peca).Posicionar());
        
    }
    private void IniciarConfiguracao(){
        colocarNovaPeca('b',6,new Torre(tabuleiro, Color.BRANCO));
        colocarNovaPeca('e',8,new Rei(tabuleiro, Color.PRETO));
        colocarNovaPeca('e',1,new Rei(tabuleiro, Color.BRANCO));
    }
    
}
