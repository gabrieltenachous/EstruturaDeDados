/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;
import modelos.Pessoa;

public class Vetor<T> {

    private Object[] elementos;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
    }
    public Vetor(){
        this.elementos = new Object[3];
    }
    public void inserirEn(int posicao, T elemento) {
        if(this.elementos.length<posicao){
            throw new IllegalArgumentException(String.format("Posicao é invalida[%d]",posicao));
        }
        this.elementos[posicao] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T recuperar(int posicao) {
        return  (T)this.elementos[posicao];
    }

}
