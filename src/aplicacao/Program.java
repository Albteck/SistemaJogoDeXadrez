/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

import xadrez.PartidaDeXadrez;

/**
 *
 * @author Alkanet
 */
public class Program {
    public static void main(String []args){
        
        PartidaDeXadrez combinacoes = new PartidaDeXadrez();
        UI.imprimirTabuleiro(combinacoes.getPecas());
        
    }
    
}
