/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Arrays;

public class Vetor<T> {

    private Object[] elementos;
    private int posicao;

    public Vetor(int capacidade) {
        this.elementos = new Object[capacidade];
    }

    public Vetor(T elemento) {
        this.elementos = new Object[3];
        this.posicao = 0;
    }

    public void inserir(T elemento) {
        //acrescentando um elemento 
        if (this.posicao >= this.elementos.length) {
            this.elementos = Arrays.copyOf(this.elementos, this.elementos.length + 1);
        }
        this.elementos[this.posicao] = elemento;
        this.posicao++;
    }

    public void inserirEn(int posicao, T elemento) {

        if (this.elementos.length < posicao) {
            throw new IllegalArgumentException(String.format("Posicao é invalida[%d]", posicao));
        }
        if (this.elementos[posicao] != null) {
            Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao, this.elementos.length);
            Object[] arrayInicio = new Object[posicao + 1];
            System.arraycopy(this.elementos, 0, arrayInicio, 0, posicao);
            arrayInicio[arrayInicio.length - 1] = elemento;
            // arrayFinal = 2,3,4
            // arrayInicvio= 1,5
            int novoTamanho = arrayFinal.length + arrayInicio.length;
            this.elementos = new Object[novoTamanho];
            System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
            System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);
            this.posicao++;

        } else {
            this.elementos[posicao] = elemento;
        }
        this.elementos[posicao] = elemento;
    }

    @SuppressWarnings("unchecked")
    public T recuperar(int posicao) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Acesso do vetor invalido: [%d]", posicao));
        }
        return (T) this.elementos[posicao];
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public boolean contem(T elemento) {
        for (int i = 0; i < tamanho(); i++) {
            T elem = recuperar(i);
            if (elem != null && elem.equals(elemento)) {
                return true;
            }
        }
        return false;
    }

    public int indice(T elemento) {
        for (int i = 0; i < tamanho(); i++) {
            T elem = recuperar(i);
            if (elem != null && elem.equals(elemento)) {
                return i;
            }
        }
        return -1;
    }

    public void remover(int posicao) {
        if (posicao >= tamanho()) {
            throw new IllegalArgumentException(String.format("Posicao invalida [%d]", posicao));
        }
        Object[] arrayFinal = Arrays.copyOfRange(this.elementos, posicao + 1, tamanho());
        Object[] arrayInicio = Arrays.copyOfRange(this.elementos, 0, posicao);
        this.elementos = new Object[tamanho() - 1];
        this.posicao--;
        System.arraycopy(arrayInicio, 0, this.elementos, 0, arrayInicio.length);
        System.arraycopy(arrayFinal, 0, this.elementos, arrayInicio.length, arrayFinal.length);

    }

    public void remover(T elemento) {
        int posicao = indice(elemento);
        if (posicao >= tamanho() || posicao == -1) {
            throw new IllegalArgumentException("Elemento invalido -"+elemento.toString());
        }
        remover(posicao);
    }

    @Override
    public String toString() {
        return "Vetor{" + "elementos=" + Arrays.toString(elementos) + '}';
    }

}
