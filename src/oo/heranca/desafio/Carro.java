package oo.heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    protected int velocidadeAtual;
    private int delta;

    Carro(int velocidadeMaxima){

        this.VELOCIDADE_MAXIMA = velocidadeMaxima;
        setDelta(5);
    }

    public void acelerar() {
        if(this.velocidadeAtual + 5 > VELOCIDADE_MAXIMA)
            this.velocidadeAtual = VELOCIDADE_MAXIMA;
        else
            this.velocidadeAtual += getDelta();
    }

    public void frear() {
        if(velocidadeAtual >= 5)
            this.velocidadeAtual -= 5;
        else
            this.velocidadeAtual = 0;
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public String toString() {
        return "Velocidade atual é " + velocidadeAtual + "KM/h.";
    }
}
