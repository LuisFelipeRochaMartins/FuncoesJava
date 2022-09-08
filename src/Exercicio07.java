import java.util.Scanner;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true) {

            System.out.print("Informe o valor da prestação: ");
            float valor = entrada.nextInt();
            System.out.print("Informe a quantidade de dias que está atrasado o pagamento: ");
            int dias = entrada.nextInt();

            System.out.println("Valor da parcela total: "+Funcoes.valorPagamento(valor,dias));
        }
    }
}
