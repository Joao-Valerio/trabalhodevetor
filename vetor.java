import java.util.Random;

import java.util.Scanner;

public class Vetor {
    private int[] vetor;

    public Vetor(int tamanho) {
        vetor = new int[tamanho];
    }

    public void coletaVetor() {
        Scanner t = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe o " + (i + 1) + "º valor do vetor: ");
            vetor[i] = t.nextInt();
        }
    }

    public void gerarVetorRandomico(int max) {

        Random ale = new Random();

        System.out.print("Valores randômicos gerados: ");

        for (int x = 0; x < vetor.length; x++) {

            vetor[x] = ale.nextInt(max);

            if (x < vetor.length - 1) {

                System.out.print(vetor[x] + ",");

            } else {

                System.out.println(vetor[x]);

                System.out.println(" ");

            }

        }

    }

    public void imprimeVetor() {

        System.out.println("Dados do vetor: ");

        for (int x = 0; x < 10; x++) {

            if (x < vetor.length - 1) {

                System.out.print(vetor[x] + ",");

            } else {

                System.out.println(vetor[x]);

                System.out.println(" ");

            }

        }

    }

    public void imprimeVetorInvertido() {

        System.out.print("Dados do Vetor: ");

        for (int x = 1; x <= vetor.length; x++) {

            if (x <= vetor.length - 1) {

                System.out.print(vetor[vetor.length - x] + ",");

            } else {

                System.out.print(vetor[vetor.length - x]);

                System.out.println(" ");

            }

        }

    }

    public int somaTodos() {
        int soma = 0;
        for (int x = 0; x < vetor.length; x++) {
            soma = vetor[x] + soma;
        }
        System.out.println("Soma de todos os valores do vetor: " + soma);
        System.out.println(" ");
        return soma;
    }

    public int somaPersonalizada(int inicio,int termino) {
        Scanner t = new Scanner(System.in);
        int soma = 0;
        System.out.println("Indíce de início(inclusive):");
        inicio = t.nextInt();
        System.out.println("Indíce de término(inclusive):");
        termino = t.nextInt();
        if (inicio <= vetor.length && termino <= vetor.length) {
            if (inicio < termino) {
                for (int x = inicio; x <= termino; x++) {
                    soma = soma + vetor[x];
                }
                System.out.println("Soma personalizada: " + soma);
                System.out.println("  ");
            } else {
                System.out.println("Verifique restrições do Algoritimo!");
                System.out.println("  ");
            }
        } else {
            System.out.println("Verifique restrições do Algoritimo!");
            System.out.println(" ");
        }
        return soma;

    }

    public double media() {
        double soma = 0;
        for (int x = 0; x < vetor.length; x++) {
            soma = vetor[x] + soma;
        }
        double media = soma / 10;
        System.out.println("A média do Vetor é " + media);
        System.out.println(" ");
        return soma;

    }

    public int menorValor() {
        int menor = vetor[0];
        for (int x = 0; x < vetor.length; x++) {
            if (menor > vetor[x]) {
                menor = vetor[x];
            }
        }
        System.out.println("O menor valor do Vetor é: " + menor);
        System.out.println(" ");
        return menor;

    }

    public int maiorValor() {
        int maior = vetor[0];
        for (int x = 0; x < vetor.length; x++) {
            if (maior < vetor[x]) {
                maior = vetor[x];
            }
        }
        System.out.println("O maior valor do Vetor é: " + maior);
        System.out.println("  ");

        return maior;

    }

}