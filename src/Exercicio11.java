import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe uma data no formato dd/mm/aaaa:");;
        String data = entrada.nextLine();

        System.out.println(Funcoes.extenso(data));


    }
}
