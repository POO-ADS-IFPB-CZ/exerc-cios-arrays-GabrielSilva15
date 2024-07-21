public class questao02 {
    public static void main(String[] args) {

        int anterior = 1;
        int atual = 1;

        System.out.print(anterior + " " + atual + " ");


        for (int i = 3; i <= 30; i++) {
            int proximo = anterior + atual;

            System.out.print(proximo + " ");

            anterior = atual;
            atual = proximo;
        }
    }
}
