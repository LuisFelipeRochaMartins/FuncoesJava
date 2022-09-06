import java.util.Scanner;
public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o valor do produto: ");
        float prod = entrada.nextFloat();
        System.out.print("Informe a taxa do imposto: ");
        float imposto = entrada.nextFloat();

        System.out.println("Valor do produto já com o imposto aplicado é "+Funcoes.preco(prod,imposto));
    }
}
