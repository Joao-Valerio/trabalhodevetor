package model;

import java.util.ArrayList;
import java.util.List;

public class Vetor {
    private List<Integer> elementos;

    public Vetor() {
        this.elementos = new ArrayList<>();
    }

    public void adicionarElemento(int elemento) {
        elementos.add(elemento);
    }

    public int obterElemento(int indice) {
        return elementos.get(indice);
    }

    public int tamanho() {
        return elementos.size();
    }
    public boolean estaVazio() {
        return elementos.isEmpty();
    }
    
}
