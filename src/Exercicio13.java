import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int linha = entrada.nextInt();
        int coluna = entrada.nextInt();

        if (linha > 20) {
            linha = 20;
        } else if (linha < 1) {
            linha = 1;
        }

        if (coluna > 20) {
            coluna = 20;
        } else if (coluna < 1) {
            coluna = 1;
        }

        Funcoes.quadrado(linha, coluna);

        entrada.close();
    }
}