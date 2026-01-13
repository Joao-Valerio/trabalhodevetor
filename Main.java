import service.vetorService;
import model.Vetor;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vetor vetor = new Vetor();
        vetorService service = new vetorService();

        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Adicionar valor");
            System.out.println("2 - Imprimir vetor");
            System.out.println("3 - Imprimir vetor invertido");
            System.out.println("4 - Soma");
            System.out.println("5 - Média");
            System.out.println("6 - Maior valor");
            System.out.println("7 - Menor valor");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um valor: ");
                    vetor.adicionarElemento(sc.nextInt());
                    break;

                case 2:
                    service.imprimir(vetor);
                    break;

                case 3:
                    service.imprimirInverso(vetor);
                    break;

                case 4:
                    System.out.println("Soma: " + service.somaElementos(vetor));
                    break;

                case 5:
                    System.out.println("Média: " + service.mediaElementos(vetor));
                    break;

                case 6:
                    System.out.println("Maior valor: " + service.maior(vetor));
                    break;

                case 7:
                    System.out.println("Menor valor: " + service.menor(vetor));
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}
