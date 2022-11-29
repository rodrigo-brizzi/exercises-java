package classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(){
        //dia = 1;
        //mes = 1;
        //ano = 1970;
        this(1, 1, 1970);

        //byte, short, int, long => 0;
        //float, double => 0.0
        //char => /u0000;
        //Objetos => null;
    }

    Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    String obterDataFormatada(){
        String formato = "%d/%d/%d";
        return String.format(formato, dia, mes, ano);
    }
}
