import java.util.Scanner;

public class Atividade04Vetores {
    public static void main(String[] args) {
        // Criar um Scanner para leitura de dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Declarar um vetor de inteiros com 3 posições
        int[] numeros = new int[3];

        // Solicitar ao usuário que insira três números
        System.out.println("Digite 3 números inteiros:");

        // Ler os três números e armazená-los no vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Fechar o scanner
        scanner.close();

        // Exibir os valores inseridos
        System.out.println("Os valores inseridos foram:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + numeros[i]);
        }

        // Calcular a média dos valores
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        double media = (double) soma / numeros.length;

        // Exibir a média dos valores
        System.out.println("A média dos valores é: " + media);
    }
}

