package classe;

public class DataTeste {
    public static void main(String[] args){
        Data d1 = new Data();

        Data d2 = new Data(31, 12, 2020);

        System.out.printf("%d/%d/%d", d1.dia, d1.mes, d1.ano);
        System.out.println(d2.obterDataFormatada());
    }
}
