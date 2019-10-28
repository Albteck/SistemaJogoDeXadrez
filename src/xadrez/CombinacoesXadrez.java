/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleirojogo.Tabuleiro;

/**
 *
 * @author Alkanet
 */
public class CombinacoesXadrez {
    private Tabuleiro tabuleiro;
    
    public CombinacoesXadrez(){
        tabuleiro = new Tabuleiro(8, 8);
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
    
}
