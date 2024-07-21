import java.util.Scanner;
public class questao03 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double[] notas = new double[10];

            System.out.println("Digite as notas dos " + 10 + " alunos:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Informe a nota do aluno " + (i + 1) + ": ");
                notas[i] = scanner.nextDouble();
            }

            double soma = 0;

            for (int i=0;i< notas.length;i++) {
                soma += notas[i];
            }

            double media = soma / 10;

            System.out.printf("A média das notas dos alunos deu: %.2f\n", media);

            int notaAbaixoDaMedia = 0;
            int notaAcimaDaMedia = 0;

            for (double nota : notas) {
                if (nota < media) {
                    notaAbaixoDaMedia+=1;
                } else if (nota > media) {
                    notaAcimaDaMedia+=1;
                }
            }

            System.out.println("Quantidade de notas abaixo da média: " + notaAbaixoDaMedia);
            System.out.println("Quantidade de notas acima da média: " + notaAcimaDaMedia);

            scanner.close();
        }
}

