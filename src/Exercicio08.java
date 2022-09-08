import java.util.Scanner;
public class Exercicio08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        String number = entrada.nextLine();

        System.out.println("A quantidade de dígitos é de :"+Funcoes.contar(number));

    }
}
