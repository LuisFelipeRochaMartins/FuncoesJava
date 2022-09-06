import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int n1 = entrada.nextInt();
        System.out.print("Informe um outro inteiro: ");
        int n2 = entrada.nextInt();
        System.out.print("Informe um outro inteiro: ");
        int n3 = entrada.nextInt();

        System.out.println(Funcoes.soma(n1,n2,n3));
    }
}
