package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
    public static void main(String[] args){

        Monstro j1 = new Monstro();
        j1.x = 10;
        j1.y = 10;

        Heroi j2 = new Heroi();
        j2.x = 10;
        j2.y = 11;

        //j1.andar(Direcao.NORTE);
        //j1.andar(Direcao.LESTE);
        //j1.andar(Direcao.NORTE);
        //j1.andar(Direcao.LESTE);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);
        j2.atacar(j1);

        System.out.println(j1.x);
        System.out.println(j1.y);

        System.out.println(j1.vida);
        System.out.println(j2.vida);


    }
}
