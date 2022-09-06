import java.util.Scanner;
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número:");
        int n = entrada.nextInt();

        System.out.println(Funcoes.escada(n));
        System.out.println();
    }
}
