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
        if(linhas<1||colunas<1){
            throw new TabuleiroExcecoes("Erro em criar tabuleiro: É necessário que haja pelo menos 1 linha e 1 coluna");
        }
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
     * @return the colunas
     */
    public int getColunas() {
        return colunas;
    }

    public Peca pecas(int linhas, int colunas){
        if(!posicaoExiste(linhas, colunas)){
            throw new TabuleiroExcecoes("Essa posição não existe no tabuleiro");
        }
        return pecas[linhas][colunas];
    }
    public Peca pecas(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroExcecoes("Essa posição não existe no tabuleiro");
        }
        return pecas[posicao.getLinha()][posicao.getColuna()];
    }
    public void ColocarPeca(Peca peca, Posicao posicao){
        if(existeUmaPeca(posicao)){
            throw new TabuleiroExcecoes("Já existe uma peça na posição: "+posicao);
        }
        pecas[posicao.getLinha()][posicao.getColuna()]=peca;
        peca.posicao=posicao;
    }
    private boolean posicaoExiste(int linha, int coluna){
        return linha >=0 && linha < linhas && coluna >= 0 && coluna <colunas;
    }
    public boolean posicaoExiste(Posicao posicao){
        return posicaoExiste(posicao.getLinha(), posicao.getColuna());
        
    }
    public boolean existeUmaPeca(Posicao posicao){
        if(!posicaoExiste(posicao)){
            throw new TabuleiroExcecoes("Essa posição não existe no tabuleiro");
        }
        return pecas(posicao)!=null;
        
    }
}
