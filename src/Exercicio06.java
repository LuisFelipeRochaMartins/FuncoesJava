import java.util.Locale;
import java.util.Scanner;
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while(true){

            System.out.print("Informe as horas");
            int horas = entrada.nextInt();
            while(horas<0 ||  horas>24) {
                System.out.print("Informe uma hora no formato 24h");
                horas = entrada.nextInt();
            }
            System.out.print("Informe os minutos: ");
            int min = entrada.nextInt();
            while(min<0 || min >59){
                System.out.print("Informe um valor ");
                min = entrada.nextInt();
            }

            System.out.println(Funcoes.converter(horas)+":"+(min)+" "+Funcoes.turno(horas));

            String op, S="S";
            op = entrada.nextLine();
            System.out.println("Deseja continuar? [S/N]");
            op = entrada.nextLine().toUpperCase();
            if(!(op.equalsIgnoreCase(S))){
                break;
            }
        }
    }
}
