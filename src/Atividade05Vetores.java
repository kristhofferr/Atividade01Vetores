import java.util.Scanner;

public class Atividade05Vetores {

    public static void main(String[] args) {
        // Criar um Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarar um vetor de Strings com 3 posições
        String[] nomes = new String[3];

        // Solicitar ao usuário que insira três nomes
        System.out.println("Por favor, insira três nomes:");

        // Ler os três nomes e armazená-los no vetor
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Fechar o scanner
        scanner.close();

        // Exibir os nomes inseridos
        System.out.println("Os nomes inseridos foram:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }
}


