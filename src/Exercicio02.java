import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n = entrada.nextInt();

        System.out.println(Funcoes.escada2(n));
    }
}
