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
public class Tabuleiro {
    private int linhas;
    private int colunas;
    private Peca[][] pecas;
    
    public Tabuleiro(int linhas, int colunas){
        this.linhas=linhas;
        this.colunas=colunas;
        pecas = new Peca[linhas][colunas];
    }

    /**
     * @return the linhas
     */
    public int getLinhas() {
        return linhas;
    }

    /**
     * @param linhas the linhas to set
     */
    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    /**
     * @return the colunas
     */
    public int getColunas() {
        return colunas;
    }

    /**
     * @param colunas the colunas to set
     */
    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public Peca pecas(int linhas, int colunas){
        return pecas[linhas][colunas];
    }
    public Peca pecas(Posicao posicao){
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
}
