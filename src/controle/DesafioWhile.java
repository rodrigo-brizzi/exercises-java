package controle;

import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double notas = 0;

        double nota = 0;

        int qtde = 0;

        do {
            System.out.println("Digite a nota: ");

            nota = entrada.nextDouble();

            if(nota > 0) {
                notas += nota;
                qtde++;
            }

        } while (nota > 0);

        double media = notas / qtde;

        System.out.println("Media:" + media);

        entrada.close();

    }

}
