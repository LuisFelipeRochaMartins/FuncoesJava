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
}
