import java.util.Scanner;
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        String palavra = entrada.nextLine();

        System.out.println(Funcoes.reverso(palavra));
    }
}
