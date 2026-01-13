package service;

import model.Vetor;

public class vetorService {
    public void preencherVetor(Vetor vetor, int[] elementos) {
        for (int elemento : elementos) {
            vetor.adicionarElemento(elemento);
        }
    }
    public void imprimir(Vetor vetor) {
        for (int i = 0; i < vetor.tamanho(); i++) {
            System.out.println(vetor.obterElemento(i));
        }
    }
    public void imprimirInverso(Vetor vetor) {
        if(vetor.estaVazio()) {
            System.out.println("Vetor vazio");
            return;
        }
        for (int i = vetor.tamanho() - 1; i >= 0; i--) {
            System.out.println(vetor.obterElemento(i));
        }
    }
    public int somaElementos(Vetor vetor) {
        int soma = 0;
        for (int i = 0; i < vetor.tamanho(); i++) {
            soma += vetor.obterElemento(i);
        }
        return soma;
    }
    public double mediaElementos(Vetor vetor) {
        if(vetor.estaVazio()) {
            return 0;
        }
        return (double) somaElementos(vetor) / vetor.tamanho();
    }
    public int maior(Vetor vetor){
        if(vetor.estaVazio()) {
            throw new IllegalArgumentException("Vetor vazio");
        }
        int maior = vetor.obterElemento(0);
        for (int i = 1; i < vetor.tamanho(); i++) {
            if (vetor.obterElemento(i) > maior) {
                maior = vetor.obterElemento(i);
            }
        }
        return maior;
    }
    public int menor(Vetor vetor){
        if(vetor.estaVazio()) {
            throw new IllegalArgumentException("Vetor vazio");
        }
        int menor = vetor.obterElemento(0);
        for (int i = 1; i < vetor.tamanho(); i++) {
            if (vetor.obterElemento(i) < menor) {
                menor = vetor.obterElemento(i);
            }
        }
        return menor;
    }
}
