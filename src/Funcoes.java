import java.util.Random;
public class Funcoes {
    public static String escada(int n) {
        String retorno="";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k <= i; k++) {
                retorno += (i + 1 + " ");
            }
            retorno += "\n";
        }
        return (retorno);
    }
    public static String escada2(int n) {
        String retorno = "";
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < i + 1; k++) {
                retorno += (k + 1 + " ");
            }
            retorno += "\n";

        }
        return(retorno);
    }
    public static int soma(int n1, int n2, int n3){
        int retorno =0;
        retorno += n1+n2+n3;
        return(retorno);
    }
    public static String verificar(int n){
        if(n>0){
            return("P - Positivo");
        }
        else{
            return("N - Nulo ou Negativo");
        }
    }
    public static float preco(float prod, float imposto){
        return(((prod*imposto)/100)+prod);
    }
    public static int converter(int horas){
        int h = horas;
        if (horas>12) {
            h = (horas - 12);
        }
        return(h);
    }
    public static String turno(int horas){
        String periodo = "";
        if(horas>=12){
            periodo = "P.M.";
        }else{
            periodo = "A.M.";
        }
        return (periodo);
    }
    public static double valorPagamento(float valor, int dias){
        double preco= 0;
        float taxa = 0.1f;
        if(dias>0){
            preco = (dias*taxa)+(valor*0.03)+valor ;
        }else{
            preco=valor;
        }
        return(preco);
    }
    public static int contar(String number){
        return (number.length());
    }
    public static String reverso(String x){
        String reverso="";
        char ch;
        System.out.println("Palavra informada: "+x);

        for (int i=0; i<x.length(); i++) {
            ch= x.charAt(i);
            reverso= ch+reverso;
        }
        return("Palavra ao contrário: "+ reverso);
    }
    public static String embaralha(String x){
        Random random = new Random();
        String[] letras = x.split("");
        int pos;
        for (int i=0;i<x.length();i++) {
            pos = random.nextInt(0, x.length());
            String temp = letras[i];
            letras[i] = letras[pos];
            letras[pos] = temp;
        }
        return String.join("",letras);
    }
    public static String extenso (String x){
        String[] meses  = {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
                "Agosto","Setembro","Outubro","Novembro","Dezembro"};

        String dia = x.substring(0,2);
        String mes = x.substring(3,5);
        String ano = x.substring(6,10);

        int k = Integer.parseInt(mes)-1;
        return(dia+" de "+meses[k]+" de "+ano);
    }
}
