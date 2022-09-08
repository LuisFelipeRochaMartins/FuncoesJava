import java.util.Random;
import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe um palavra: ");
        String palavra = entrada.nextLine();

        System.out.println(Funcoes.embaralha(palavra));
    }
}
