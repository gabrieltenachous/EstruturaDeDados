/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import modelos.Pessoa;

/**
 *
 * @author gabri
 */
public class Vetor {

    private Pessoa[] pessoas;

    public Vetor(int capacidade) {
        this.pessoas = new Pessoa[capacidade];
    }
    public void inserirEn(int posicao,Pessoa pessoa){
        this.pessoas[posicao] = pessoa;
    }
    public Pessoa recupera(int posicao){
        return this.pessoas[posicao];
    }
}
