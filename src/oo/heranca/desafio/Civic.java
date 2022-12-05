package oo.heranca.desafio;

public class Civic extends Carro{
    public Civic(){
        this(250);
    }

    protected Civic(int velocidadeMaxima){
        super(velocidadeMaxima);
    }
}
