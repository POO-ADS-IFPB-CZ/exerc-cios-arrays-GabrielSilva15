import java.util.Scanner;
public class questao04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int contaNumerosDigitados = 0;
            int soma = 0;

            while (true) {
                System.out.print("Digite um número inteiro maior ou igual a zero, caso queira sair digite um numero menor que zero: ");
                int numero = scanner.nextInt();

                if (numero < 0) {
                    break;
                }

                contaNumerosDigitados++;
                soma += numero;
            }

            if (contaNumerosDigitados > 0) {

                double media = (double) soma / contaNumerosDigitados;

                System.out.println("Quantidade de números digitados pelo usuário: " + contaNumerosDigitados);
                System.out.printf("Média dos números digitados pelo usuário: %.2f\n", media);
            } else {

                System.out.println("Nenhum número válido foi digitado pelo usuário.");
            }

            scanner.close();
        }
}

