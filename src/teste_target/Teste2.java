package teste_target;

import java.util.Scanner;

public class Teste2 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();

        if (verificaFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean verificaFibonacci(int numero) {
        int primeiro = 0;
        int segundo = 1;

        while (primeiro <= numero) {
            if (primeiro == numero) {
                return true;
            }
            int proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
        return false;
    }
}
