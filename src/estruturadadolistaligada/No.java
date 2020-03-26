/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadadolistaligada;

/**
 *
 * @author gabri
 * @param <T>
 */
public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No() {
        this.proximo = null;
    }

    public No(T elemento, No<T> proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No(T elemento) {
        this.elemento = elemento;
        
    }

    /**
     * @return the elemento
     */
    public T getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the proximo
     */
    public No<T> getProximo() {
        return proximo;
    }

    /**
     * @param proximo the proximo to set
     */
    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

}
