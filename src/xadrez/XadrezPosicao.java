/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xadrez;

import tabuleirojogo.Posicao;

/**
 *
 * @author Alkanet
 */
public class XadrezPosicao {
    private char colunas;
    private int linhas;
    
    public XadrezPosicao(char colunas, int linhas){
        if(colunas<'a'||colunas>'h'||linhas<1||linhas>8){
            throw new XadrezExcecao("Erro de intanciação na posição do xadrez: posições validas de A1 a H8");
        }
        this.colunas=colunas;
        this.linhas=linhas;
    }

    /**
     * @return the colunas
     */
    public char getColunas() {
        return colunas;
    }

    /**
     * @return the linhas
     */
    public int getLinhas() {
        return linhas;
    }
    protected Posicao Posicionar(){
        return new Posicao(8-linhas, colunas - 'a');
    }
    protected static XadrezPosicao DePosicao(Posicao posicao){
        return new XadrezPosicao((char)('a'-posicao.getColuna()), 8-posicao.getLinha());
    }
    public String toString(){
        return ""+colunas+linhas;
    }
    
}
