package teste_target;

import java.util.Scanner;

public class Teste5 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String invertida = inverterString(entrada);
        System.out.println("String invertida: " + invertida);
        
        scanner.close();
    }

    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int esquerda = 0;
        int direita = caracteres.length - 1;

        while (esquerda < direita) {
            char temp = caracteres[esquerda];
            caracteres[esquerda] = caracteres[direita];
            caracteres[direita] = temp;

            esquerda++;
            direita--;
        }

        return new String(caracteres);
    }
}
