import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Pilha pilha = new Pilha();
        Fila fila = new Fila();

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserir na pilha");
            System.out.println("2 - Remover da pilha");
            System.out.println("3 - Imprimir pilha");
            System.out.println("4 - Inserir na fila");
            System.out.println("5 - Remover da fila");
            System.out.println("6 - Imprimir fila");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor: ");
                    int valorPilha = entrada.nextInt();
                    pilha.insere(valorPilha);
                    break;

                case 2:
                    pilha.remove();
                    break;

                case 3:
                    pilha.imprime();
                    break;

                case 4:
                    System.out.print("Valor: ");
                    int valorFila = entrada.nextInt();
                    fila.insere(valorFila);
                    break;

                case 5:
                    fila.remove();
                    break;

                case 6:
                    fila.imprime();
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
            }
        }
        entrada.close();
    }
}
