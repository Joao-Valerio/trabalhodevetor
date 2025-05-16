import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Vetor vetor = new Vetor(10);

        while (true) {

            System.out.println("       Menu de opções");

            System.out.println("");

            System.out.println("1ª opção: coletar dados do Vetor.");

            System.out.println("2ª opção: randomizar os valores do Vetor.");

            System.out.println("3ª opção: imprime dados do Vetor.");

            System.out.println("4ª opção: imprime Vetor invertido.");

            System.out.println("5ª opção: soma valores do Vetor");

            System.out.println("6ª opção: Soma personalizada dos valores do Vetor.");

            System.out.println("7ª opção: Media dos valores do Vetor.");

            System.out.println("8ª opção: Maior valor dentro do Vetor.");

            System.out.println("9ª opção: Menor valor dentro do Vetor.");

            System.out.println("Digite 0 para sair.");

            System.out.println("");

            System.out.println("Digite a opção desejada:");

            int escolha = t.nextInt();
            if (escolha == 1) {
                vetor.coletaVetor();
            } else if (escolha == 2) {
                System.out.print("Digite o valor máximo para randomizar: ");
                int max = t.nextInt();
                vetor.gerarVetorRandomico(max);
            } else if (escolha == 3) {
                vetor.imprimeVetor();
            } else if (escolha == 4) {
                vetor.imprimeVetorInvertido();
            } else if (escolha == 5) {
                vetor.somaTodos();
            } else if (escolha == 6) {
                System.out.print("Índice de início: ");
                int ini = t.nextInt();
                System.out.print("Índice de término: ");
                int fim = t.nextInt();
                vetor.somaPersonalizada(ini, fim);
            } else if (escolha == 7) {
                vetor.media();
            } else if (escolha == 8) {
                vetor.maiorValor();
            } else if (escolha == 9) {
                vetor.menorValor();
            }

            else if (escolha == 0) {

                System.out.println("Fim do algoritimo");

                break;

            } else if (escolha > 9) {

                System.out.println("Opção inválida");

            }

        }

    }

}
