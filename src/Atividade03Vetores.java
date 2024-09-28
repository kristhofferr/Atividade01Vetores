public class Atividade03Vetores {
    public static void main(String[] args) {

        int[] numeros = {5,10};
        System.out.println("Antes da troca:");
        System.out.println("Posição 0:" + numeros[0]);
        System.out.println("Posição 1:" + numeros[1]);

        int tenp = numeros[0];

        numeros[0] = numeros[1];
        numeros[1] = tenp;

        System.out.println("Após da troca");
        System.out.println("Posição 0:" + numeros[0]);
        System.out.println("Poaiço 1:" + numeros[1]);



    }
}
